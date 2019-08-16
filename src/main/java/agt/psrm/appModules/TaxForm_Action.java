package agt.psrm.appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.TaxForm_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Utils;

public class TaxForm_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(8000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	TaxForm_Page.Menu_TaxForm().click();
    	Log.info("Menu tab has been clicked");
    	
    	TaxForm_Page.Forms_TaxFrom().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	TaxForm_Page.TaxFormTab().click();
    	Log.info("Forms Navigation has been clicked");
    	
    	TaxForm_Page.Add_TaxForm().click();
    	Log.info("Add new registration form Navigation has been clicked");
    	
    	BaseClass.driver.switchTo().frame(1);
    	
    	/*TaxForm_Page.formType_TaxForm().clear();	
    	String formType = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TaxType);
    	TaxForm_Page.formType_TaxForm().sendKeys(formType);
        Log.info(formType+" is entered in Name text box" );
        TaxForm_Page.formType_TaxForm().sendKeys(Keys.TAB);
        TaxForm_Page.oKButton_TaxForm().click();
        Log.info("OK button has been clicked");*/
        
        Utils.waitForVisibleElement(TaxForm_Page.receiveDate_TaxForm());
        TaxForm_Page.receiveDate_TaxForm().clear();
        TaxForm_Page.receiveDate_TaxForm().sendKeys(Utils.currentDate());
        Log.info("receiveDate has been clicked");
        
        TaxForm_Page.NIFasCurrent_TaxForm().clear();	
    	String NIFasCurrent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIF);
    	TaxForm_Page.NIFasCurrent_TaxForm().sendKeys(NIFasCurrent);
        Log.info(NIFasCurrent+" is entered in Name text box" );
        TaxForm_Page.NIFasCurrent_TaxForm().sendKeys(Keys.TAB);
        if(!"".equalsIgnoreCase(TaxForm_Page.personID_TaxForm().getText())) 
        {
        Log.info("Person ID is displayed successfully");
        }
        else
        {
            Log.info("Person ID is not displayed");
        }	
        
        if(!"".equalsIgnoreCase(TaxForm_Page.account_TaxForm().getText())) 
        	
        {
        Log.info("Account is displayed successfully");
        }
        else
        {
            Log.info("Account is not displayed");
        }	
        
        Select taxCategory_TaxForm = new Select(TaxForm_Page.taxCategory_TaxForm());
        String taxCategory = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_CategoriadoImposto);
        taxCategory_TaxForm.selectByVisibleText(taxCategory);
        Log.info(taxCategory+" value has been selected in dropdown" );
        
        Select taxType_TaxForm = new Select(TaxForm_Page.taxType_TaxForm());
        String taxType = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodoImposto);
        taxType_TaxForm.selectByVisibleText(taxType);
        Log.info(taxType+" value has been selected in dropdown" );
        
        if (!taxCategory.contains("D - Outras Receitas")) {
			Select collection_TaxForm = new Select(TaxForm_Page.collection_TaxForm());
			String collection = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Cobranca);
			collection_TaxForm.selectByVisibleText(collection);
			Log.info(collection + " value has been selected in dropdown");
			Select assessmentForm_TaxForm = new Select(TaxForm_Page.assessmentForm_TaxForm());
			String assessmentForm = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_FormadeLiquidacao);
			assessmentForm_TaxForm.selectByVisibleText(assessmentForm);
			Log.info(assessmentForm + " value has been selected in dropdown");
			Select assessmentType_TaxForm = new Select(TaxForm_Page.assessmentType_TaxForm());
			String assessmentType = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeLiquidacao);
			assessmentType_TaxForm.selectByVisibleText(assessmentType);
			Log.info(assessmentType + " value has been selected in dropdown");
		}
        
		if (taxCategory.contains("A - Impostos Regulares") || taxCategory.contains("B - Imposto de Arrendamento")) {
			Select frequency_TaxForm = new Select(TaxForm_Page.frequency_TaxForm());
			String frequency = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_FrequenciadeDeclaracao);
			frequency_TaxForm.selectByVisibleText(frequency);
			Log.info(frequency + " value has been selected in dropdown");
			
			
			if (!frequency.contains("5. Esporadico")) {
				Select year_TaxForm = new Select(TaxForm_Page.year_TaxForm());
				String year = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Ano);
				year_TaxForm.selectByVisibleText(year);
				Log.info(year + " value has been selected in dropdown");
			}
			if (frequency.contains("1. Mensal") || frequency.contains("2. Trimestral") || frequency.contains("3. Semestral")) {
				Select period_TaxForm = new Select(TaxForm_Page.period_TaxForm());
				String period = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Periodo);
				period_TaxForm.selectByVisibleText(period);
				Log.info(period + " value has been selected in dropdown");
			}
			
			if (frequency.contains("4. Annual") || frequency.contains("5. Esporadico") ) {
									
				TaxForm_Page.dueDate_TaxForm().clear();	
	        	String dueDate = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DatadeValidade);
	        	TaxForm_Page.dueDate_TaxForm().sendKeys(dueDate);
	            Log.info(dueDate+" is entered in Name text box" );
				
			}
			
		}
		if (!taxCategory.contains("D - Outras Receitas")) {
			TaxForm_Page.manualCalculation_TaxForm().click();
			Log.info("Manual Calculation checkbox has been selected");
		}
		TaxForm_Page.taxableValue_TaxForm().clear();	
    	String taxableValue = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ValorTributavel);
    	TaxForm_Page.taxableValue_TaxForm().sendKeys(taxableValue);
        Log.info(taxableValue+" is entered in Name text box" );
        
        /*TaxForm_Page.taxableRate_TaxForm().clear();	
    	String taxableRate = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Taxa);
    	TaxForm_Page.taxableRate_TaxForm().sendKeys(taxableRate);
        Log.info(taxableRate+" is entered in Name text box" );*/
        
        if (taxCategory.contains("B - Imposto de Arrendamento")) {
			TaxForm_Page.realEstateIncomeNIF_TaxForm().clear();
			String realEstateIncomeNIF = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIFdoProprietario);
			TaxForm_Page.realEstateIncomeNIF_TaxForm().sendKeys(realEstateIncomeNIF);
			Log.info(realEstateIncomeNIF + " is entered in Name text box");
			if (!"".equalsIgnoreCase(TaxForm_Page.nameDesignationLessee_TaxForm().getText())) {
				Log.info("Person ID is displayed successfully");
			} else {
				Log.info("Person ID is not displayed");
			}
			if (!"".equalsIgnoreCase(TaxForm_Page.accountfkRef_TaxForm().getText()))

			{
				Log.info("Account is displayed successfully");
			} else {
				Log.info("Account is not displayed");
			}
			TaxForm_Page.propertyNumber_TaxForm().clear();
			String propertyNumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NºdaMatriz);
			TaxForm_Page.propertyNumber_TaxForm().sendKeys(propertyNumber);
			Log.info("propertyNumber is entered in text box");
		}
		if (taxCategory.contains("D - Outras Receitas") || taxCategory.contains("C - Impostos Aduaneiros" ) ) {
			TaxForm_Page.issueDate_TaxForm().clear();
			String issueDate = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_IssueDate);
			TaxForm_Page.issueDate_TaxForm().sendKeys(issueDate);
			Log.info("issueDate is entered in text box");
		}
		
		
		if (taxCategory.contains("D - Outras Receitas")) {
			TaxForm_Page.OtherRevenuesNIF_TaxForm().clear();
			String OtherRevenuesNIF = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NIFdoProprietario);
			TaxForm_Page.OtherRevenuesNIF_TaxForm().sendKeys(OtherRevenuesNIF);
			Log.info(OtherRevenuesNIF + " is entered in Name text box");
			if (!"".equalsIgnoreCase(TaxForm_Page.nameOfInstitution_TaxForm().getText())) {
				Log.info("OtherRevenuesNIF is displayed successfully");
			} else {
				Log.info("OtherRevenuesNIF is not displayed");
			}
			if (!"".equalsIgnoreCase(TaxForm_Page.accountfkReferenceInfo_TaxForm().getText()))

			{
				Log.info("Account is displayed successfully");
			} else {
				Log.info("Account is not displayed");
			} 
		}
		TaxForm_Page.CheckForm_Registration().click();
        Log.info("check form button has been clicked" );
        
        Thread.sleep(10000);
    	
        TaxForm_Page.Save_Registration().click();
        Log.info("Save form button has been clicked" );
        
        Thread.sleep(12000);
        BaseClass.driver.switchTo().defaultContent();
        BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(3);
        BaseClass.driver.switchTo().frame(0);
        TaxForm_Page.Validar_Registration().click();
        Log.info("Validar form button has been clicked" );
        
        Thread.sleep(10000);
        BaseClass.driver.switchTo().defaultContent();
        BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(3);
        BaseClass.driver.switchTo().frame(0);
        TaxForm_Page.Publicar_Registration().click();
        Log.info("Validar form button has been clicked" );
        
        Thread.sleep(10000);
       /* BaseClass.driver.switchTo().defaultContent();
        BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(3);
        BaseClass.driver.switchTo().frame(0);
        TaxForm_Page.ImprimirComprovativodeCadastro_Registration().click();
        Log.info("ImprimirComprovativodeCadastro form button has been clicked" );*/
        
    }
}
