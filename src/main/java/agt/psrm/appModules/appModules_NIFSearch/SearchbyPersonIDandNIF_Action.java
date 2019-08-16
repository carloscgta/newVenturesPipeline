package agt.psrm.appModules.appModules_NIFSearch;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.HistoricodaContaCorrente_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.SearchbyPersonIDandNIF_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class SearchbyPersonIDandNIF_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().window().maximize();
    	
    	BaseClass.driver.switchTo().defaultContent();
        
        BaseClass.driver.switchTo().defaultContent();

    	Select TipodeIdentificacao = new Select(SearchbyPersonIDandNIF_Page.TipodeIdentificacao());
    	String TipodeIdentificacao_Dropdown = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeIdentificaca);
    	TipodeIdentificacao.selectByVisibleText(TipodeIdentificacao_Dropdown);
    	Log.info(TipodeIdentificacao_Dropdown+" Value has been selected in the dropdown");
    	
    	SearchbyPersonIDandNIF_Page.NºIdentificacao().clear();
    	String NºIdentificacao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºIdentificacao);
    	SearchbyPersonIDandNIF_Page.NºIdentificacao().sendKeys(NºIdentificacao);
    	Log.info(NºIdentificacao+" Value has been selected in the dropdown");

    	SearchbyPersonIDandNIF_Page.Pesquisar().click();
        Log.info("Search button has been clicked" );
        
        
        
        if(BaseClass.driver.getTitle().equals("Buscar Pessoa pelo Grupo de Acesso a Dados do Usuário")) {
        	String PersonName = SearchbyPersonIDandNIF_Page.Name_Result().getText();
            if(!"".equalsIgnoreCase(PersonName)) {
            	
            	ExcelUtils.setCellData(PersonName, iTestCaseRow, Constant.Col_PersonName);
            	Reporter.log("Person with New NIF is displayed : Validation Success");
            }
            else {
            	Reporter.log("Person with New NIF is not displayed : Validation Failed");
            }
        	SearchbyPersonIDandNIF_Page.Name_Result().click();

        }
        
        if(BaseClass.driver.getTitle().equals("Search for Person Id, Accounts and NIF")) {
        	
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
            }
        	SearchbyPersonIDandNIF_Page.Conta_Result().click();
        }
    }
}

