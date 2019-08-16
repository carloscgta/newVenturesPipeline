package agt.psrm.appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.CollectionReport_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class DetalhadodeLiquidacao_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	Thread.sleep(8000);
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	
    	BaseClass.driver.switchTo().frame(0);
    	
    	CollectionReport_Page.Menu_CollectionReport().click();
    	Log.info("Menu tab has been clicked");
    	
    	CollectionReport_Page.CollectionReport().click();
    	Log.info("Collection Report tab has been clicked");
    	
    	CollectionReport_Page.RelatorioDetalhadodeLiquidacao_CollectionReport().click();
    	Log.info("RelatorioDetalhadodeLiquidacao Navigation has been clicked");
    	
    	BaseClass.driver.switchTo().frame(1);
    	
    	CollectionReport_Page.DatadeInicio_CollectionReport().clear();
		String DatadeInicio = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadeInicio);
		CollectionReport_Page.DatadeInicio_CollectionReport().sendKeys(DatadeInicio);
		Log.info(DatadeInicio + " is entered in Initial Date text box");
		
		CollectionReport_Page.DatadeFim_CollectionReport().clear();
		String DatadeFim = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadeFim);
		CollectionReport_Page.DatadeFim_CollectionReport().sendKeys(DatadeInicio);
		Log.info(DatadeFim + " is entered in End Date text box");
        
        Select Visao_CollectionReport = new Select(CollectionReport_Page.Visao_CollectionReport());
        String Visao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Visao);
        Visao_CollectionReport.selectByVisibleText(Visao);
        Log.info(Visao+" value has been selected in dropdown" );
        
        Select RegiaoTributaria_CollectionReport = new Select(CollectionReport_Page.RegiaoTributaria_CollectionReport());
        String RegiaoTributaria = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RegiaoTributaria);
        RegiaoTributaria_CollectionReport.selectByVisibleText(RegiaoTributaria);
        Log.info(RegiaoTributaria+" value has been selected in dropdown" );
        
        Select Provincia_CollectionReport = new Select(CollectionReport_Page.Provincia_CollectionReport());
        String Provincia = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Provincia);
        Provincia_CollectionReport.selectByVisibleText(Provincia);
        Log.info(Provincia+" value has been selected in dropdown" );
        
        Select ServicoFiscal_CollectionReport = new Select(CollectionReport_Page.ServicoFiscal_CollectionReport());
        String ServicoFiscal = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ServicoFiscal);
        ServicoFiscal_CollectionReport.selectByVisibleText(ServicoFiscal);
        Log.info(ServicoFiscal+" value has been selected in dropdown" );
        
        Select Utilizador_CollectionReport = new Select(CollectionReport_Page.Utilizador_CollectionReport());
        String Utilizador = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Utilizador);
        Utilizador_CollectionReport.selectByVisibleText(Utilizador);
        Log.info(Utilizador+" value has been selected in dropdown" );
        
        Select Grupodeimposto_CollectionReport = new Select(CollectionReport_Page.Grupodeimposto_CollectionReport());
        String Grupodeimposto = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Grupodeimposto);
        Grupodeimposto_CollectionReport.selectByVisibleText(Grupodeimposto);
        Log.info(Grupodeimposto+" value has been selected in dropdown" );
        
        Select TipodeImposto_CollectionReport = new Select(CollectionReport_Page.TipodeImposto_CollectionReport());
        String TipodeImposto = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeImposto);
        TipodeImposto_CollectionReport.selectByVisibleText(TipodeImposto);
        Log.info(TipodeImposto+" value has been selected in dropdown" );
        
        CollectionReport_Page.FormadeLiquidacao_CollectionReport().click();
        String FormadeLiquidacao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_FormadeLiquidacao);
        BaseClass.driver.findElement(By.xpath("//*[text()='"+FormadeLiquidacao+"']")).click();
        Log.info(FormadeLiquidacao+" value has been selected in dropdown" );
        
        
        Select TipodeFicheiro_CollectionReport = new Select(CollectionReport_Page.TipodeFicheiro_CollectionReport());
        String TipodeFicheiro = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeFicheiro);
        TipodeFicheiro_CollectionReport.selectByVisibleText(TipodeFicheiro);
        Log.info(TipodeFicheiro+" value has been selected in dropdown" );
        
        CollectionReport_Page.VerRelatorio_CollectionReport().click();
        Log.info("View report button has been clicked" );
        
        
    }
}
