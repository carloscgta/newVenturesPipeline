package agt.psrm.appModules.appModules_NIFSearch;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.Registration_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Utils;

public class AddRegistration_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(8000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	Registration_Page.Menu_Registration().click();
    	Log.info("Menu tab has been clicked");
    	
    	Registration_Page.Forms_Registration().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	Registration_Page.RegistrationForm().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	Registration_Page.Add_Registration().click();
    	Log.info("Add new registration form Navigation has been clicked");
    	
    	BaseClass.driver.switchTo().frame(1);

        Registration_Page.NIFdoRepresentanteLegal_Search().click();
        Log.info("check form button has been clicked" );
        String parantWindow = BaseClass.driver.getWindowHandle();
        Utils.newWindowSwitch(); 
        SearchbyPersonIDandNIF_Action.Execute(iTestCaseRow);
        Utils.ParantWindowSwitch(parantWindow);
        
        BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(1);
        String PersonName = Registration_Page.NIFperson_Singular().getText();
        if(!"".equalsIgnoreCase(PersonName)) {
        	
        	ExcelUtils.setCellData(PersonName, iTestCaseRow, Constant.Col_PersonName);
        	Reporter.log("Person with New NIF is displayed : Validation Success");
        }
        else {
        	Reporter.log("Person with New NIF is not displayed : Validation Failed");
        }
        
    }
}
