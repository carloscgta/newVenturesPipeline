package agt.psrm.appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.GestaodeContribuintesInadimplentes_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Utils;

public class GestaodeContribuintesInadimplentes_Action {
	
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
        
        GestaodeContribuintesInadimplentes_Page.Nome_Inadimplentes().clear();
        String Nome = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NomeCompleto);
        GestaodeContribuintesInadimplentes_Page.Nome_Inadimplentes().sendKeys(Nome);
        Log.info(Nome+" value has been selected in dropdown" );
        
        GestaodeContribuintesInadimplentes_Page.PrimeiroNome_Inadimplentes().clear();
        String PrimeiroNome = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PrimeiroNome);
        GestaodeContribuintesInadimplentes_Page.PrimeiroNome_Inadimplentes().sendKeys(PrimeiroNome);
        Log.info(PrimeiroNome+" value has been selected in dropdown" );
        
        GestaodeContribuintesInadimplentes_Page.UltimoNome_Inadimplentes().clear();
        String UltimoNome = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UltimoNome);
        GestaodeContribuintesInadimplentes_Page.UltimoNome_Inadimplentes().sendKeys(UltimoNome);
        Log.info(UltimoNome+" value has been selected in dropdown" );
        
        Select TipodeIdentificacao_Inadimplentes = new Select(GestaodeContribuintesInadimplentes_Page.TipodeIdentificacao_Inadimplentes());
        String TipodeIdentificacao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeID);
        TipodeIdentificacao_Inadimplentes.selectByVisibleText(TipodeIdentificacao);
        Log.info(TipodeIdentificacao+" value has been selected in dropdown" );
        
        GestaodeContribuintesInadimplentes_Page.NºIdentificacao_Inadimplentes().clear();
        String NºIdentificacao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ValordaID);
        GestaodeContribuintesInadimplentes_Page.NºIdentificacao_Inadimplentes().sendKeys(NºIdentificacao);
        Log.info(NºIdentificacao+" value has been selected in dropdown" );
        
        GestaodeContribuintesInadimplentes_Page.Pesquisar_Inadimplentes().click();
		Log.info( "Search button has been clicked ");
        
		GestaodeContribuintesInadimplentes_Page.InformacoesdoFluxodoProcesso_Inadimplentes().click();
		Log.info( "process flow information field is clicked ");
		
		BaseClass.driver.switchTo().frame(0);
		
		BaseClass.driver.switchTo().defaultContent();
		BaseClass.driver.switchTo().frame(0);
		BaseClass.driver.switchTo().frame(1);
		
		Utils.ScrollBar(100);
		
		GestaodeContribuintesInadimplentes_Page.PersonID_Inadimplentes().click();
		Log.info( "Person ID field is clicked ");
        
        
    }
}
