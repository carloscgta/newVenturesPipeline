package agt.psrm.appModules.appModules_NIFSearch;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.Efectuarpagamentos_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Utils;

public class Efectuarpagamentos_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(8000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	Efectuarpagamentos_Page.Menu_Pagamentos().click();
    	Log.info("Menu tab has been clicked");
    	
    	Efectuarpagamentos_Page.Pagamentos().click();
    	Log.info("Pagamentos Navigation has been clicked");
    	
    	Efectuarpagamentos_Page.Efectuarpagamentos().click();
    	Log.info("Efectuarpagamentos button has been clicked");
    	
    	BaseClass.driver.switchTo().frame(1);
    	
    	Efectuarpagamentos_Page.NIFSearch().click();
    	Log.info("NIFSearch button has been clicked");
    	
        String parantWindow = BaseClass.driver.getWindowHandle();
        Utils.newWindowSwitch(); 
        SearchbyPersonIDandNIF_Action.Execute(iTestCaseRow);
        Utils.ParantWindowSwitch(parantWindow);
        
        BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(1);
        String PersonName = Efectuarpagamentos_Page.PersonName().getText();
        if(!"".equalsIgnoreCase(PersonName)) {
        	
        	ExcelUtils.setCellData(PersonName, iTestCaseRow, Constant.Col_PersonName);
        	Reporter.log("Person with New NIF is displayed : Validation Success");
        }
        else {
        	Reporter.log("Person with New NIF is not displayed : Validation Failed");
        }
        
        String AccountName = Efectuarpagamentos_Page.AccountName().getText();
        if(!"".equalsIgnoreCase(AccountName)) {
        	
        	ExcelUtils.setCellData(AccountName, iTestCaseRow, Constant.Col_Account);
        	Reporter.log("Account with New NIF is displayed : Validation Success");
        }
        else {
        	Reporter.log("Account with New NIF is not displayed : Validation Failed");
        }
        
    }
}
