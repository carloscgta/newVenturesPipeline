package agt.psrm.appModules.appModules_NIFSearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.SearchRegistrationForm_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.SearchTaxForm_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.NIFSearch_SearchTax;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Utils;

public class SearchTax_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(8000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	SearchTaxForm_Page.Menu_TaxForm().click();
    	Log.info("Menu tab has been clicked");
    	
    	SearchTaxForm_Page.Forms_TaxFrom().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	SearchTaxForm_Page.TaxFormTab().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	SearchTaxForm_Page.Search_TaxForm().click();
    	Log.info("Search tax form Navigation has been clicked");
    	
    	BaseClass.driver.switchTo().frame(3);
        
			Select TipodeID_TaxForm = new Select(SearchTaxForm_Page.TipodeID_TaxForm());
			String TipodeID = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeIdentificaca);
			TipodeID_TaxForm.selectByVisibleText(TipodeID);
			Log.info(TipodeID + " value has been selected in dropdown");
			
			SearchTaxForm_Page.ValordaID_TaxForm().clear();
			String ValordaID = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºIdentificacao);
			SearchTaxForm_Page.ValordaID_TaxForm().sendKeys(ValordaID);
			Log.info(ValordaID + " is entered in text box");
		
        
		SearchTaxForm_Page.Pesquisar_TaxForm().click();
		Log.info( "Search button has been clicked ");
        
		String PersonName = SearchRegistrationForm_Page.PersonName().getText();
        if(!"".equalsIgnoreCase(PersonName)) {
        	
        	ExcelUtils.setCellData(PersonName, iTestCaseRow, Constant.Col_PersonName);
        	Reporter.log("Person with New NIF is displayed : Validation Success");
        	 
        }
        else {
        	Reporter.log("Person with New NIF is not displayed : Validation Failed");
        }
        
        
    }
}
