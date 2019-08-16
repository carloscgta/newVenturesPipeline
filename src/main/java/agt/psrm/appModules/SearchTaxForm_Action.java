package agt.psrm.appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.SearchTaxForm_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class SearchTaxForm_Action {
	
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
        
        Select PesquisarPor_TaxForm = new Select(SearchTaxForm_Page.PesquisarPor_TaxForm());
        String PesquisarPor = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Pesquisapor);
        PesquisarPor_TaxForm.selectByVisibleText(PesquisarPor);
        Log.info(PesquisarPor+" value has been selected in dropdown" );
        
        if (PesquisarPor.contains("Pessoa")) {
			SearchTaxForm_Page.NomeCompleto_TaxForm().clear();
			String NomeCompleto = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NomeCompleto);
			SearchTaxForm_Page.NomeCompleto_TaxForm().sendKeys(NomeCompleto);
			Log.info(NomeCompleto + " is entered in Full Name text box");
			SearchTaxForm_Page.PrimeiroNome_TaxForm().clear();
			String PrimeiroNome = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PrimeiroNome);
			SearchTaxForm_Page.PrimeiroNome_TaxForm().sendKeys(PrimeiroNome);
			Log.info(PrimeiroNome + " is entered in First Name text box");
			SearchTaxForm_Page.UltimoNome_TaxForm().clear();
			String UltimoNome = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Sobrenome);
			SearchTaxForm_Page.UltimoNome_TaxForm().sendKeys(UltimoNome);
			Log.info(UltimoNome + " is entered in Last Name text box");
			Select TipodeID_TaxForm = new Select(SearchTaxForm_Page.TipodeID_TaxForm());
			String TipodeID = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeID);
			TipodeID_TaxForm.selectByVisibleText(TipodeID);
			Log.info(TipodeID + " value has been selected in dropdown");
			SearchTaxForm_Page.ValordaID_TaxForm().clear();
			String ValordaID = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ValordaID);
			SearchTaxForm_Page.ValordaID_TaxForm().sendKeys(ValordaID);
			Log.info(ValordaID + " is entered in text box");
		}
        
		if (PesquisarPor.contains("Data de Rececao/Tipo/Estado/Tipo de Declaracao")) {
			SearchTaxForm_Page.DatadeRecepcao_TaxForm().clear();
			String DatadeRecepcao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadeRecepcao);
			SearchTaxForm_Page.DatadeRecepcao_TaxForm().sendKeys(DatadeRecepcao);
			Log.info(DatadeRecepcao + " is entered in text box");
			SearchTaxForm_Page.Ate_TaxForm().clear();
			String Ate = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Ate);
			SearchTaxForm_Page.Ate_TaxForm().sendKeys(Ate);
			Log.info(Ate + " is entered in text box");
			SearchTaxForm_Page.TipodeFormulario_TaxForm().clear();
			String TipodeFormulario = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeFormulario);
			SearchTaxForm_Page.TipodeFormulario_TaxForm().sendKeys(TipodeFormulario);
			Log.info(TipodeFormulario + " is entered in text box");
			Select Estado_TaxForm = new Select(SearchTaxForm_Page.Estado_TaxForm());
			String Estado = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Estado);
			Estado_TaxForm.selectByVisibleText(Estado);
			Log.info(Estado + " value has been selected in dropdown");
			Select taxFormFilingType_TaxForm = new Select(SearchTaxForm_Page.taxFormFilingType_TaxForm());
			String taxFormFilingType = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_taxFormFilingType);
			taxFormFilingType_TaxForm.selectByVisibleText(taxFormFilingType);
			Log.info(taxFormFilingType + " value has been selected in dropdown");
		}
		
		
		if (PesquisarPor.contains("Address")) {
			SearchTaxForm_Page.Enderecofisico_TaxForm().clear();
			String Enderecofisico = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_EnderecoFisico);
			SearchTaxForm_Page.Enderecofisico_TaxForm().sendKeys(Enderecofisico);
			Log.info(Enderecofisico + " is entered in text box");
			Select municipality_TaxForm = new Select(SearchTaxForm_Page.municipality_TaxForm());
			String municipality = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MunicipioInformacoes);
			municipality_TaxForm.selectByVisibleText(municipality);
			Log.info(municipality + " value has been selected in dropdown");
			Select taxOffice_TaxForm = new Select(SearchTaxForm_Page.taxOffice_TaxForm());
			String taxOffice = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ReparticaoFiscaldeDomicilio);
			taxOffice_TaxForm.selectByVisibleText(taxOffice);
			Log.info(taxOffice + " value has been selected in dropdown");
		}
		
		
		if (PesquisarPor.contains("ID do Batch Externo/Cabecalho do Batch de Formularios")) {
			SearchTaxForm_Page.externalFormBatchId_TaxForm().clear();
			String externalFormBatchId = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_externalFormBatchId);
			SearchTaxForm_Page.externalFormBatchId_TaxForm().sendKeys(externalFormBatchId);
			Log.info(externalFormBatchId + " is entered in text box");
			SearchTaxForm_Page.formBatchHeader_TaxForm().clear();
			String formBatchHeader = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_formBatchHeader);
			SearchTaxForm_Page.formBatchHeader_TaxForm().sendKeys(formBatchHeader);
			Log.info(formBatchHeader + " is entered in text box");
		}
		
		
		if (PesquisarPor.contains("Localizacao do Documento")) {
			SearchTaxForm_Page.IdentificadordoDocumento_TaxForm().clear();
			String IdentificadordoDocumento = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NumerodoDLI);
			SearchTaxForm_Page.IdentificadordoDocumento_TaxForm().sendKeys(IdentificadordoDocumento);
			Log.info(IdentificadordoDocumento + " is entered in text box");
		}
        
		SearchTaxForm_Page.Pesquisar_TaxForm().click();
		Log.info( "Search button has been clicked ");
        
        
        
        
    }
}
