package agt.psrm.appModules.appModules_NIFSearch;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.SearchbyPerson_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class SearchbyPerson_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().window().maximize();
    	
    	BaseClass.driver.switchTo().defaultContent();
    	Select TipodeIdentificacao = new Select(SearchbyPerson_Page.TipodeID());
    	String TipodeIdentificacao_Dropdown = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeIdentificaca);
    	TipodeIdentificacao.selectByVisibleText(TipodeIdentificacao_Dropdown);
    	Log.info(TipodeIdentificacao_Dropdown+" Value has been selected in the dropdown");
    	
    	SearchbyPerson_Page.NumerodaID().clear();
    	String NºIdentificacao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºIdentificacao);
    	SearchbyPerson_Page.NumerodaID().sendKeys(NºIdentificacao);
    	Log.info(NºIdentificacao+" Value has been selected in the dropdown");

    	SearchbyPerson_Page.Pesquisar_TipodeID().click();
        Log.info("Search button has been clicked" );
        
        Thread.sleep(1000);
        if(BaseClass.driver.getTitle().equals("Pesquisa de Pessoas")) {
        	
        	BaseClass.driver.switchTo().frame(0);
        	String PersonName = SearchbyPerson_Page.NomedaPessoa_Result().getText();
            if(!"".equalsIgnoreCase(PersonName)) {
            	
            	ExcelUtils.setCellData(PersonName, iTestCaseRow, Constant.Col_PersonName);
            	Reporter.log("Person with New NIF is displayed : Validation Success");
            	
            	BaseClass.driver.quit();
            	
            }
            else {
            	Reporter.log("Person with New NIF is not displayed : Validation Failed");
            }
        	SearchbyPerson_Page.NomedaPessoa_Result().click();
        	
        }
        

    }
}
