package agt.psrm.appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.CollectionReport_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class DetalhadodeLiquidacaoporContribuinte_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	Thread.sleep(8000);
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	
    	BaseClass.driver.switchTo().frame(0);
    	
    	CollectionReport_Page.Menu_CollectionReport().click();
    	Log.info("Menu tab has been clicked");
    	
    	CollectionReport_Page.CollectionReport().click();
    	Log.info("Collection Report tab has been clicked");
    	
    	CollectionReport_Page.RelatorioDetalhadodeLiquidacaoporContribuinte_CollectionReport().click();
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
		
		//CollectionReport_Page.NIF_CollectionReport().clear();
		String NIF = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIF);
		CollectionReport_Page.NIF_CollectionReport().sendKeys(DatadeInicio);
		Log.info(NIF + " is entered in End Date text box");
		
		if(!"".equals(CollectionReport_Page.personName_CollectionReport().getText())) {
			Log.info("Pessoa field is displayed: Validation success");
		}
		else
		{
			Log.info("Pessoa field is not displayed: Validatio failed");
		}
		
		Select Conta_CollectionReport = new Select(CollectionReport_Page.Conta_CollectionReport());
        String Conta = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ContaCR);
        Conta_CollectionReport.selectByVisibleText(Conta);
        Log.info(Conta+" value has been selected in dropdown" );
        
		Select Grupodeimposto_CollectionReport = new Select(CollectionReport_Page.GrupodeimpostoPR_CollectionReport());
        String Grupodeimposto = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Grupodeimposto);
        Grupodeimposto_CollectionReport.selectByVisibleText(Grupodeimposto);
        Log.info(Grupodeimposto+" value has been selected in dropdown" );
        
        Select TipodeImposto_CollectionReport = new Select(CollectionReport_Page.TipodeImpostoPR_CollectionReport());
        String TipodeImposto = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeImposto);
        TipodeImposto_CollectionReport.selectByVisibleText(TipodeImposto);
        Log.info(TipodeImposto+" value has been selected in dropdown" );
        
        Select EstadodaDLI_CollectionReport = new Select(CollectionReport_Page.EstadodaDLI_CollectionReport());
        String EstadodaDLI = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_EstadodaDLI);
        EstadodaDLI_CollectionReport.selectByVisibleText(EstadodaDLI);
        Log.info(EstadodaDLI+" value has been selected in dropdown" );
      
        BaseClass.driver.findElement(By.id("generatePayReport_formAssessment")).click();
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
