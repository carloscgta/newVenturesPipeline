package agt.psrm.appModules.appModules_NIFSearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.GestaodeContribuintesInadimplentes_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class NIFSearchInadimplentes_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(3000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	GestaodeContribuintesInadimplentes_Page.Menu_Inadimplentes().click();
    	Log.info("Menu tab has been clicked");
    	
    	GestaodeContribuintesInadimplentes_Page.GestaodeTrabalho_Inadimplentes().click();
    	Log.info("GestaodeTrabalho Navigation has been clicked");
    	
    	GestaodeContribuintesInadimplentes_Page.GestaodeContribuintesInadimplentes().click();
    	Log.info("GestaodeContribuintesInadimplentes Navigation has been clicked");
    	
    	//BaseClass.driver.switchTo().frame(0);
    	
    	BaseClass.driver.switchTo().frame(3);
        
        Select PesquisarPor_Inadimplentes = new Select(GestaodeContribuintesInadimplentes_Page.PesquisarPor_Inadimplentes());
        String PesquisarPor = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Pesquisapor);
        PesquisarPor_Inadimplentes.selectByVisibleText(PesquisarPor);
        Log.info(PesquisarPor+" value has been selected in dropdown" );
        
        Thread.sleep(500);
        
        Select TipodeIdentificacao_Inadimplentes = new Select(GestaodeContribuintesInadimplentes_Page.TipodeIdentificacao_Inadimplentes());
        String TipodeIdentificacao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeIdentificaca);
        TipodeIdentificacao_Inadimplentes.selectByVisibleText(TipodeIdentificacao);
        Log.info(TipodeIdentificacao+" value has been selected in dropdown" );
        
        GestaodeContribuintesInadimplentes_Page.NºIdentificacao_Inadimplentes().clear();
        String NºIdentificacao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºIdentificacao);
        GestaodeContribuintesInadimplentes_Page.NºIdentificacao_Inadimplentes().sendKeys(NºIdentificacao);
        Log.info(NºIdentificacao+" value has been selected in dropdown" );
        
        GestaodeContribuintesInadimplentes_Page.Pesquisar_Inadimplentes().click();
		Log.info( "Search button has been clicked ");
        
		  String PersonName = GestaodeContribuintesInadimplentes_Page.Nome().getText();
            if(!"".equalsIgnoreCase(PersonName)) {
            	
            	ExcelUtils.setCellData(PersonName, iTestCaseRow, Constant.Col_PersonName);
            	Reporter.log("Nome field is displayed : Validation Success");
            }
            else {
            	Reporter.log("Nome field is not displayed : Validation Failed");
            }
        
        
    }
}
