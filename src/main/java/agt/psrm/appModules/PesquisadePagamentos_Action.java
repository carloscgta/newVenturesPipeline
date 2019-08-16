package agt.psrm.appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.PesquisadePagamentos_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class PesquisadePagamentos_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(8000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	PesquisadePagamentos_Page.Menu_Pagamentos().click();
    	Log.info("Menu tab has been clicked");
    	
    	PesquisadePagamentos_Page.Pagamentos().click();
    	Log.info("Pagamentos Navigation has been clicked");
    	
    	PesquisadePagamentos_Page.PesquisadePagamentos().click();
    	Log.info("PesquisadePagamentos Navigation has been clicked");
    	
    	BaseClass.driver.switchTo().frame(3);
        
        Select Pesquisar_Pagamentos = new Select(PesquisadePagamentos_Page.Pesquisar_Pagamentos());
        String Pesquisar = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Pesquisar);
        Pesquisar_Pagamentos.selectByVisibleText(Pesquisar);
        Log.info(Pesquisar+" value has been selected in dropdown" );
        
        if (!Pesquisar.contains("Metodo de Pagamento")) {
        	
        	Select ContadePagamentos_dropdown = new Select(PesquisadePagamentos_Page.ContadePagamentos_dropdown());
			String ContadePagamentos = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ContadePagamentos);
			ContadePagamentos_dropdown.selectByVisibleText(ContadePagamentos);
			Log.info(ContadePagamentos + " value has been selected in dropdown");
			
			PesquisadePagamentos_Page.ContadePagamentos_Values().clear();
			String ContadePagamentos_Values = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ContadePagamentos_Values);
			PesquisadePagamentos_Page.ContadePagamentos_Values().sendKeys(ContadePagamentos_Values);
			Log.info(ContadePagamentos_Values + " is entered in  text box");
			
			Select MontantedePagamento_dropdown = new Select(PesquisadePagamentos_Page.MontantedePagamento_dropdown());
			String MontantedePagamento = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MontantedePagamento);
			MontantedePagamento_dropdown.selectByVisibleText(MontantedePagamento);
			Log.info(MontantedePagamento + " value has been selected in dropdown");
			
			PesquisadePagamentos_Page.MontantedePagamento_Values1().clear();
			String MontantedePagamento_Values1 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MontantedePagamento_Values1);
			PesquisadePagamentos_Page.MontantedePagamento_Values1().sendKeys(MontantedePagamento_Values1);
			Log.info(MontantedePagamento_Values1 + " is entered in text box");
			
			PesquisadePagamentos_Page.MontantedePagamento_Values2().clear();
			String MontantedePagamento_Values2 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MontantedePagamento_Values2);
			PesquisadePagamentos_Page.MontantedePagamento_Values2().sendKeys(MontantedePagamento_Values2);
			Log.info(MontantedePagamento_Values2 + " is entered in text box");
        	
        }
        	if (!Pesquisar.contains("Pagamento")) {
				Select ContadaEntidadePagadora_dropdown = new Select(PesquisadePagamentos_Page.ContadaEntidadePagadora_dropdown());
				String ContadaEntidadePagadora = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ContadaEntidadePagadora);
				ContadaEntidadePagadora_dropdown.selectByVisibleText(ContadaEntidadePagadora);
				Log.info(ContadaEntidadePagadora + " value has been selected in dropdown");
				PesquisadePagamentos_Page.ContadaEntidadePagadora_Value().clear();
				String ContadaEntidadePagadora_Value = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ContadaEntidadePagadora_Value);
				PesquisadePagamentos_Page.ContadaEntidadePagadora_Value().sendKeys(ContadaEntidadePagadora_Value);
				Log.info(ContadaEntidadePagadora_Value + " is entered in   text box");
				Select MontantedoMetododePagamento_Dropdown = new Select(PesquisadePagamentos_Page.MontantedoMetododePagamento_Dropdown());
				String MontantedoMetododePagamento = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MontantedoMetododePagamento);
				MontantedoMetododePagamento_Dropdown.selectByVisibleText(MontantedoMetododePagamento);
				Log.info(MontantedoMetododePagamento + " value has been selected in dropdown");
				PesquisadePagamentos_Page.MontantedoMetododePagamento_Values1().clear();
				String MontantedoMetododePagamento_Values1 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MontantedoMetododePagamento_Values1);
				PesquisadePagamentos_Page.MontantedoMetododePagamento_Values1().sendKeys(MontantedoMetododePagamento_Values1);
				Log.info(MontantedoMetododePagamento_Values1 + " is entered in   text box");
				PesquisadePagamentos_Page.MontantedoMetododePagamento_Values2().clear();
				String MontantedoMetododePagamento_Values2 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MontantedoMetododePagamento_Values2);
				PesquisadePagamentos_Page.MontantedoMetododePagamento_Values2().sendKeys(MontantedoMetododePagamento_Values2);
				Log.info(MontantedoMetododePagamento_Values2 + " is entered in   text box");
				Select OrigemdoMetododePagamento_dropdown = new Select(PesquisadePagamentos_Page.OrigemdoMetododePagamento_dropdown());
				String OrigemdoMetododePagamento = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_OrigemdoMetododePagamento_dropdown);
				OrigemdoMetododePagamento_dropdown.selectByVisibleText(OrigemdoMetododePagamento);
				Log.info(OrigemdoMetododePagamento + " value has been selected in dropdown");
				PesquisadePagamentos_Page.OrigemdoMetododePagamento_Value().clear();
				String OrigemdoMetododePagamento_Value = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_OrigemdoMetododePagamento_Value);
				PesquisadePagamentos_Page.OrigemdoMetododePagamento_Value().sendKeys(OrigemdoMetododePagamento_Value);
				Log.info(OrigemdoMetododePagamento_Value + " is entered in   text box");
				Select MICRID_Dropdown = new Select(PesquisadePagamentos_Page.MICRID_Dropdown());
				String MICRID = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MICRID_dropdown);
				MICRID_Dropdown.selectByVisibleText(MICRID);
				Log.info(MICRID + " value has been selected in dropdown");
				PesquisadePagamentos_Page.MICRID_Value().clear();
				String MICRID_Value = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MICRID_Value);
				PesquisadePagamentos_Page.MICRID_Value().sendKeys(MICRID_Value);
				Log.info(MICRID_Value + " is entered in   text box");
			}
			Select DatadePagamento_Dropdown = new Select(PesquisadePagamentos_Page.DatadePagamento_Dropdown());
			String DatadePagamento= ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadePagamento_dropdown);
			DatadePagamento_Dropdown.selectByVisibleText(DatadePagamento);
			Log.info(DatadePagamento + " value has been selected in dropdown");
			
			PesquisadePagamentos_Page.DatadePagamento_Value1().clear();
			String DatadePagamento_Value1 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadePagamento_Value1);
			PesquisadePagamentos_Page.DatadePagamento_Value1().sendKeys(DatadePagamento_Value1);
			Log.info(DatadePagamento_Value1 + " is entered in   text box");	
			
			PesquisadePagamentos_Page.DatadePagamento_Value2().clear();
			String DatadePagamento_Value2 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadePagamento_Value2);
			PesquisadePagamentos_Page.DatadePagamento_Value2().sendKeys(DatadePagamento_Value2);
			Log.info(DatadePagamento_Value2 + " is entered in   text box");	
		
		PesquisadePagamentos_Page.Search	().click();
		Log.info( "Search button has been clicked ");
        
        
        
        
    }
}
