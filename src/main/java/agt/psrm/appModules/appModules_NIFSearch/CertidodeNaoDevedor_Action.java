package agt.psrm.appModules.appModules_NIFSearch;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.CertidaodeDivida_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Utils;

public class CertidodeNaoDevedor_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().window().maximize();
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(4000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	CertidaodeDivida_Page.Menu_ertidaodeDivida().click();
    	Log.info("Menu tab has been clicked");
    	
    	CertidaodeDivida_Page.CertidaodeDivida().click();
    	Log.info("CertidaodeDivida Navigation has been clicked");

    	CertidaodeDivida_Page.CertidaodeNaoDevedor_CertidaodeDivida().click();
    	Log.info("CertidaodeNaoDevedor Navigation has been clicked");
    	
    	
    	BaseClass.driver.switchTo().frame(1);

    	CertidaodeDivida_Page.NIFSearch_CertidaodeNaoDevedor().click();
    	Log.info("NIF Search Button has been clicked");
    	
    	String parantWindow = BaseClass.driver.getWindowHandle();
    	Thread.sleep(1000);
        Utils.newWindowSwitch(); 
        SearchbyPersonIDandNIF_Action.Execute(iTestCaseRow);
        Utils.ParantWindowSwitch(parantWindow);
    	
        BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(1);
        
        String PersonName = CertidaodeDivida_Page.Pessoa().getText();
        if(!"".equalsIgnoreCase(PersonName)) {
        	
        	ExcelUtils.setCellData(PersonName, iTestCaseRow, Constant.Col_PersonName);
        	Reporter.log("Person with New NIF is displayed : Validation Success");
        }
        else {
        	Reporter.log("Person with New NIF is not displayed : Validation Failed");
        }
    	
    	
}
}