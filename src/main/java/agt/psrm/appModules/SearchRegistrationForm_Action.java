package agt.psrm.appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.SearchRegistrationForm_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class SearchRegistrationForm_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(8000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	SearchRegistrationForm_Page.Menu_RegistrationForm().click();
    	Log.info("Menu tab has been clicked");
    	
    	SearchRegistrationForm_Page.Forms_RegistrationForm().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	SearchRegistrationForm_Page.RegistrationFormTab().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	SearchRegistrationForm_Page.Search_RegistrationForm().click();
    	Log.info("Search tax form Navigation has been clicked");
    	
    	BaseClass.driver.switchTo().frame(3);
        
        Select PesquisarPor_RegistrationForm = new Select(SearchRegistrationForm_Page.PesquisarPor_RegistrationForm());
        String PesquisarPor = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Pesquisapor);
        PesquisarPor_RegistrationForm.selectByVisibleText(PesquisarPor);
        Log.info(PesquisarPor+" value has been selected in dropdown" );
        
        if (PesquisarPor.contains("Pessoa")) {
			SearchRegistrationForm_Page.NomeCompleto_RegistrationForm().clear();
			String NomeCompleto = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NomeCompleto);
			SearchRegistrationForm_Page.NomeCompleto_RegistrationForm().sendKeys(NomeCompleto);
			Log.info(NomeCompleto + " is entered in Full Name text box");
			SearchRegistrationForm_Page.PrimeiroNome_RegistrationForm().clear();
			String PrimeiroNome = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PrimeiroNome);
			SearchRegistrationForm_Page.PrimeiroNome_RegistrationForm().sendKeys(PrimeiroNome);
			Log.info(PrimeiroNome + " is entered in First Name text box");
			SearchRegistrationForm_Page.UltimoNome_RegistrationForm().clear();
			String UltimoNome = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Sobrenome);
			SearchRegistrationForm_Page.UltimoNome_RegistrationForm().sendKeys(UltimoNome);
			Log.info(UltimoNome + " is entered in Last Name text box");
			Select TipodeID_RegistrationForm = new Select(SearchRegistrationForm_Page.TipodeID_RegistrationForm());
			String TipodeID = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeID);
			TipodeID_RegistrationForm.selectByVisibleText(TipodeID);
			Log.info(TipodeID + " value has been selected in dropdown");
			SearchRegistrationForm_Page.ValordaID_RegistrationForm().clear();
			String ValordaID = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ValordaID);
			SearchRegistrationForm_Page.ValordaID_RegistrationForm().sendKeys(ValordaID);
			Log.info(ValordaID + " is entered in text box");
		}
        
		if (PesquisarPor.contains("Data de Rececao/Tipo de Formulario/Estado")) {
			SearchRegistrationForm_Page.DatadeRecepcao_RegistrationForm().clear();
			String DatadeRecepcao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadeRecepcao);
			SearchRegistrationForm_Page.DatadeRecepcao_RegistrationForm().sendKeys(DatadeRecepcao);
			Log.info(DatadeRecepcao + " is entered in text box");
			SearchRegistrationForm_Page.Ate_RegistrationForm().clear();
			String Ate = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Ate);
			SearchRegistrationForm_Page.Ate_RegistrationForm().sendKeys(Ate);
			Log.info(Ate + " is entered in text box");
			SearchRegistrationForm_Page.TipodeFormulario_RegistrationForm().clear();
			String TipodeFormulario = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeFormulario);
			SearchRegistrationForm_Page.TipodeFormulario_RegistrationForm().sendKeys(TipodeFormulario);
			Log.info(TipodeFormulario + " is entered in text box");
			Select Estado_RegistrationForm = new Select(SearchRegistrationForm_Page.Estado_RegistrationForm());
			String Estado = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Estado);
			Estado_RegistrationForm.selectByVisibleText(Estado);
			Log.info(Estado + " value has been selected in dropdown");
			
		}
		
		
		if (PesquisarPor.contains("Morada")) {
			SearchRegistrationForm_Page.Enderecofisico_RegistrationForm().clear();
			String Enderecofisico = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_EnderecoFisico);
			SearchRegistrationForm_Page.Enderecofisico_RegistrationForm().sendKeys(Enderecofisico);
			Log.info(Enderecofisico + " is entered in text box");
			Select municipality_RegistrationForm = new Select(SearchRegistrationForm_Page.municipality_RegistrationForm());
			String municipality = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MunicipioInformacoes);
			municipality_RegistrationForm.selectByVisibleText(municipality);
			Log.info(municipality + " value has been selected in dropdown");
			Select taxOffice_RegistrationForm = new Select(SearchRegistrationForm_Page.taxOffice_RegistrationForm());
			String taxOffice = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ReparticaoFiscaldeDomicilio);
			taxOffice_RegistrationForm.selectByVisibleText(taxOffice);
			Log.info(taxOffice + " value has been selected in dropdown");
		}
		
		
		if (PesquisarPor.contains("ID do Batch Externo/Cabecalho do Batch de Formularios")) {
			SearchRegistrationForm_Page.externalFormBatchId_RegistrationForm().clear();
			String externalFormBatchId = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_externalFormBatchId);
			SearchRegistrationForm_Page.externalFormBatchId_RegistrationForm().sendKeys(externalFormBatchId);
			Log.info(externalFormBatchId + " is entered in text box");
			SearchRegistrationForm_Page.formBatchHeader_RegistrationForm().clear();
			String formBatchHeader = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_formBatchHeader);
			SearchRegistrationForm_Page.formBatchHeader_RegistrationForm().sendKeys(formBatchHeader);
			Log.info(formBatchHeader + " is entered in text box");
		}
		
		
		if (PesquisarPor.contains("Localizacao do Documento")) {
			SearchRegistrationForm_Page.IdentificadordoDocumento_RegistrationForm().clear();
			String IdentificadordoDocumento = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NumerodoDLI);
			SearchRegistrationForm_Page.IdentificadordoDocumento_RegistrationForm().sendKeys(IdentificadordoDocumento);
			Log.info(IdentificadordoDocumento + " is entered in text box");
		}
        
		SearchRegistrationForm_Page.Pesquisar_RegistrationForm().click();
		Log.info( "Search button has been clicked ");
        
        
        
        
    }
}
