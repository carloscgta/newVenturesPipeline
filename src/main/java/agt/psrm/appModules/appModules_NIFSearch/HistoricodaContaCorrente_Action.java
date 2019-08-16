package agt.psrm.appModules.appModules_NIFSearch;

import java.util.concurrent.TimeUnit;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.HistoricodaContaCorrente_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Utils;

public class HistoricodaContaCorrente_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(4000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	HistoricodaContaCorrente_Page.Menu().click();
    	Log.info("Menu tab has been clicked");
    	
    	HistoricodaContaCorrente_Page.HistoricodeContaCorrente().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	BaseClass.driver.switchTo().frame(3);
    	HistoricodaContaCorrente_Page.NIFSearch().click();
    	Log.info("NIFSearch Button has been clicked");

    	// String parantWindow = BaseClass.driver.getWindowHandle();
         Utils.newWindowSwitch(); 
         SearchbyPersonIDandNIF_Action.Execute(iTestCaseRow);
         
         Utils.driver.close();
         /*Utils.ParantWindowSwitch(parantWindow);
         
         BaseClass.driver.switchTo().frame(0);
         BaseClass.driver.switchTo().frame(3);
         String PersonName = HistoricodaContaCorrente_Page.PersonName().getText();
         if(!"".equalsIgnoreCase(PersonName)) {
         	
         	ExcelUtils.setCellData(PersonName, iTestCaseRow, Constant.Col_PersonName);
         	Reporter.log("Person with New NIF is displayed : Validation Success");
         }
         else {
         	Reporter.log("Person with New NIF is not displayed : Validation Failed");
         }
         
         String Account = HistoricodaContaCorrente_Page.AccountName().getText();
         if(!"".equalsIgnoreCase(Account)) {
         	
         	ExcelUtils.setCellData(Account, iTestCaseRow, Constant.Col_Account);
         	Reporter.log("Account with New NIF is displayed : Validation Success");
         }
         else {
         	Reporter.log("Acount with New NIF is not displayed : Validation Failed");
         }*/
        
    }
}
