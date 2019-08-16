package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class SearchTaxForm_Page extends BaseClass{
    private static WebElement element = null;
   
public SearchTaxForm_Page(WebDriver driver){
    	super(driver);
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
public static WebElement Search_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Pesquisar']"));
        Log.info("Search tax form is found on the Home Page");
    }catch (Exception e){
    	Log.error("Search tax form is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement PesquisarPor_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("multiQueryZoneFilters1"));
        Log.info("Search Type is found on the Home Page");
    }catch (Exception e){
    	Log.error("Search Type is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement NomeCompleto_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("fullNameValue"));
        Log.info("Complete Name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Complete Name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement PrimeiroNome_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("firstNameValue"));
        Log.info("First Name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("First Name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement UltimoNome_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("lastNameValue"));
        Log.info("Last Name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Last Name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement TipodeID_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("personIdType"));
        Log.info("Person ID Type is found on the Home Page");
    }catch (Exception e){
    	Log.error("Person ID Type is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement ValordaID_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("personIdValue"));
        Log.info("Person ID value is found on the Home Page");
    }catch (Exception e){
    	Log.error("Person ID Value is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement DatadeRecepcao_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F1"));
        Log.info("Date of Receipt Field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Date of Receipt field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement Ate_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F2"));
        Log.info("Up until field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Up until field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement TipodeFormulario_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("formType"));
        Log.info("Type of form field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Type of form field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement Estado_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boStatus"));
        Log.info("boStatus field is found on the Home Page");
    }catch (Exception e){
    	Log.error("boStatus field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement taxFormFilingType_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("taxFormFilingType"));
        Log.info("taxFormFilingType is found on the Home Page");
    }catch (Exception e){
    	Log.error("taxFormFilingType is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement Enderecofisico_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("physicalAddress"));
        Log.info("physicalAddress field is found on the Home Page");
    }catch (Exception e){
    	Log.error("physicalAddress field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement municipality_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("municipality"));
        Log.info("municipality is found on the Home Page");
    }catch (Exception e){
    	Log.error("municipality is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement taxOffice_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("taxOffice"));
        Log.info("taxOffice is found on the Home Page");
    }catch (Exception e){
    	Log.error("taxOffice is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement externalFormBatchId_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("externalFormBatchId"));
        Log.info("external Form Batch Id field is found on the Home Page");
    }catch (Exception e){
    	Log.error("external Form Batch Id field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement formBatchHeader_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("formBatchHeader"));
        Log.info("form Batch Header field is found on the Home Page");
    }catch (Exception e){
    	Log.error("form Batch Header field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement IdentificadordoDocumento_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F1"));
        Log.info("Identificador do Documento field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Identificador do Documento field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement Pesquisar_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("anTLZ1Refresh"));
        Log.info("Pesquisar button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pesquisar button is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement PersonName_TaxForm() throws Exception{
    try{
    	element = driver.findElement(By.id("anTLZ1Refresh"));
        Log.info("PersonName field is found on the Home Page");
    }catch (Exception e){
    	Log.error("PersonName field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}
}
