package agt.psrm.appModules.appModules_NIFSearch;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.TaxForm_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Utils;

public class AddTax_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(8000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	TaxForm_Page.Menu_TaxForm().click();
    	Log.info("Menu tab has been clicked");
    	
    	TaxForm_Page.Forms_TaxFrom().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	TaxForm_Page.TaxFormTab().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	TaxForm_Page.Add_TaxForm().click();
    	Log.info("Add new registration form Navigation has been clicked");
    	
    	BaseClass.driver.switchTo().frame(1);
    	
    	/*TaxForm_Page.formType_TaxForm().clear();	
    	String formType = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TaxType);
    	TaxForm_Page.formType_TaxForm().sendKeys(formType);
        Log.info(formType+" is entered in Name text box" );
        TaxForm_Page.formType_TaxForm().sendKeys(Keys.TAB);
        TaxForm_Page.oKButton_TaxForm().click();
        Log.info("OK button has been clicked");*/
        
        Utils.waitForVisibleElement(TaxForm_Page.SearchNIF_TaxForm());
        TaxForm_Page.SearchNIF_TaxForm().click();
        Log.info("Search NIF button has been clicked");
        
        String parantWindow = BaseClass.driver.getWindowHandle();
        Utils.newWindowSwitch(); 
        SearchbyPersonIDandNIF_Action.Execute(iTestCaseRow);
        Utils.ParantWindowSwitch(parantWindow);
        
        BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(1);
        String PersonName = TaxForm_Page.personID_TaxForm().getText();
        if(!"".equalsIgnoreCase(PersonName)) {
        	
        	ExcelUtils.setCellData(PersonName, iTestCaseRow, Constant.Col_PersonName);
        	Reporter.log("Person with New NIF is displayed : Validation Success");
        }
        else {
        	Reporter.log("Person with New NIF is not displayed : Validation Failed");
        }
        
        String Account = TaxForm_Page.account_TaxForm().getText();
        if(!"".equalsIgnoreCase(Account)) {
        	
        	ExcelUtils.setCellData(Account, iTestCaseRow, Constant.Col_Account);
        	Reporter.log("Account with New NIF is displayed : Validation Success");
        }
        else {
        	Reporter.log("Acount with New NIF is not displayed : Validation Failed");
        }
        
    }
}
