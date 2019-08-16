package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class TaxForm_Page extends BaseClass{
    private static WebElement element = null;
   
public TaxForm_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement CheckForm_Registration() throws Exception{
    try{
    	element = driver.findElement(By.cssSelector("input.oraButton.oraDefault"));
    
        Log.info("Check Form is found on the Home Page");
    }catch (Exception e){
    	Log.error("Check Form is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Save_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Gravar']"));
    
        Log.info("Save button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Save button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement SavenContinue_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Save & Continue']"));
    
        Log.info("Save & Continue button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Save & Continue button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 		
	
public static WebElement Cancel_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Cancel']"));
    
        Log.info("Tipo de Identificação field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tipo de Identificação field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 		

public static WebElement Validar_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Validar']"));
    
        Log.info("Validar button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Validar button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Publicar_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Publicar']"));
    
        Log.info("Publicar button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Publicar button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement ImprimirComprovativodeCadastro_Registration() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@value='Imprimir Comprovativo de Cadastro']"));
    
        Log.info("Imprimir Comprovativo de Cadastro button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Imprimir Comprovativo de Cadastro button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Menu_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("IM_menuButton"));
    
        Log.info("Menu button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Menu button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Forms_TaxFrom() throws Exception{
    try{
    	element = driver.findElement(By.cssSelector("#CI_MAINMENU_topMenuItem0x3 > span"));
    
        Log.info("Forms button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Forms  button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement TaxFormTab() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Formulário Fiscal']"));
    
        Log.info("TaxFormTab Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("TaxFormTab Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Add_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.xpath("/html/body/div[1]/ul/li[2]/span[1]"));
        Log.info("Add tax form is found on the Home Page");
    }catch (Exception e){
    	Log.error("Add tax form is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement formType_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("formType"));
        Log.info("formType field is found on the Home Page");
    }catch (Exception e){
    	Log.error("formType field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement oKButton_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("ok"));
        Log.info("OK Button is found on the Home Page");
    }catch (Exception e){
    	Log.error("OK button is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement receiveDate_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("receiveDate"));
        Log.info("receiveDate field is found on the Home Page");
    }catch (Exception e){
    	Log.error("receiveDate field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement NIFasCurrent_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxpayerDetails_nif_asCurrent"));
        Log.info("NIF field is found on the Home Page");
    }catch (Exception e){
    	Log.error("NIF field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement personID_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxpayerDetails_personId_asCurrent_fkReferenceInfo"));
        Log.info("personID field is found on the Home Page");
    }catch (Exception e){
    	Log.error("personID field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement account_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxpayerDetails_account_asCurrent_fkReferenceInfo"));
        Log.info("account field is found on the Home Page");
    }catch (Exception e){
    	Log.error("account field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement taxCategory_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxDetails_taxCategory_asCurrent"));
        Log.info("taxCategory field is found on the Home Page");
    }catch (Exception e){
    	Log.error("taxCategory field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement taxType_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxDetails_taxType_asCurrent"));
        Log.info("taxType field is found on the Home Page");
    }catch (Exception e){
    	Log.error("taxType field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement collection_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxDetails_collection_asCurrent"));
        Log.info("collection field is found on the Home Page");
    }catch (Exception e){
    	Log.error("collection field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement assessmentForm_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxDetails_assessmentForm_asCurrent"));
        Log.info("assessmentForm field is found on the Home Page");
    }catch (Exception e){
    	Log.error("assessmentForm field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement assessmentType_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxDetails_assessmentType_asCurrent"));
        Log.info("assessmentType field is found on the Home Page");
    }catch (Exception e){
    	Log.error("assessmentType field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement frequency_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxDetails_frequency_asCurrent"));
        Log.info("taxCategory field is found on the Home Page");
    }catch (Exception e){
    	Log.error("taxCategory field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement year_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxDetails_year_asCurrent"));
        Log.info("Year field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Year field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement period_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxDetails_period_asCurrent"));
        Log.info("period field is found on the Home Page");
    }catch (Exception e){
    	Log.error("period field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement dueDate_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxDetails_dueDate_asCurrent"));
        Log.info("dueDate field is found on the Home Page");
    }catch (Exception e){
    	Log.error("dueDate field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement manualCalculation_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_amountPayable_manualCalculation_asCurrent"));
        Log.info("manualCalculation field is found on the Home Page");
    }catch (Exception e){
    	Log.error("manualCalculation field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement taxableValue_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_amountPayable_taxableValue_asCurrent"));
        Log.info("taxableValue field is found on the Home Page");
    }catch (Exception e){
    	Log.error("taxableValue field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement taxableRate_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_amountPayable_taxableRate_asCurrent"));
        Log.info("taxableRate field is found on the Home Page");
    }catch (Exception e){
    	Log.error("taxableRate field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement realEstateIncomeNIF_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_realEstateIncomeTax_realEstateIncomeNIF_asCurrent"));
        Log.info("realEstateIncomeNIF field is found on the Home Page");
    }catch (Exception e){
    	Log.error("realEstateIncomeNIF field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement accountfkRef_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_realEstateIncomeTax_account_asCurrent_fkReferenceInfo"));
        Log.info("account field is found on the Home Page");
    }catch (Exception e){
    	Log.error("account field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement nameDesignationLessee_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_realEstateIncomeTax_nameDesignationLessee_asCurrent_fkReferenceInfo"));
        Log.info("nameDesignationLessee field is found on the Home Page");
    }catch (Exception e){
    	Log.error("nameDesignationLessee field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement propertyNumber_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_realEstateIncomeTax_propertyNumber_asCurrent"));
        Log.info("propertyNumber field is found on the Home Page");
    }catch (Exception e){
    	Log.error("propertyNumber field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement issueDate_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxDetails_issueDate_asCurrent"));
        Log.info("issueDate field is found on the Home Page");
    }catch (Exception e){
    	Log.error("issueDate field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement OtherRevenuesNIF_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherRevenues_OtherRevenuesNIF_asCurrent"));
        Log.info("OtherRevenuesNIF field is found on the Home Page");
    }catch (Exception e){
    	Log.error("OtherRevenuesNIF field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement nameOfInstitution_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherRevenues_nameOfInstitution_asCurrent_fkReferenceInfo"));
        Log.info("nameOfInstitution field is found on the Home Page");
    }catch (Exception e){
    	Log.error("nameOfInstitution field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement accountfkReferenceInfo_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_otherRevenues_account_asCurrent_fkReferenceInfo"));
        Log.info("account field is found on the Home Page");
    }catch (Exception e){
    	Log.error("account field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement SearchNIF_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_taxpayerDetails_nif_asCurrent_search"));
        Log.info("Search NIF Button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Search NIF Button is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
}
