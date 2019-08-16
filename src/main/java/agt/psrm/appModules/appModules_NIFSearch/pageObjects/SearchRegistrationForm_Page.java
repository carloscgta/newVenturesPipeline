package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class SearchRegistrationForm_Page extends BaseClass{
    private static WebElement element = null;
   
public SearchRegistrationForm_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement Menu_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("IM_menuButton"));
    
        Log.info("Menu button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Menu button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Forms_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.cssSelector("#CI_MAINMENU_topMenuItem0x3 > span"));
    
        Log.info("Forms button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Forms  button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement RegistrationFormTab() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Formulário de Registo']"));
    
        Log.info("RegistrationFormTab Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("RegistrationFormTab Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Search_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Pesquisar']"));
        Log.info("Search tax form is found on the Home Page");
    }catch (Exception e){
    	Log.error("Search tax form is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement PesquisarPor_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("multiQueryZoneFilters1"));
        Log.info("Search Type is found on the Home Page");
    }catch (Exception e){
    	Log.error("Search Type is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement NomeCompleto_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("fullNameValue"));
        Log.info("Complete Name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Complete Name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement PrimeiroNome_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("firstNameValue"));
        Log.info("First Name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("First Name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement UltimoNome_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("lastNameValue"));
        Log.info("Last Name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Last Name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement TipodeID_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("personIdType"));
        Log.info("Person ID Type is found on the Home Page");
    }catch (Exception e){
    	Log.error("Person ID Type is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement ValordaID_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("personIdValue"));
        Log.info("Person ID value is found on the Home Page");
    }catch (Exception e){
    	Log.error("Person ID Value is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement DatadeRecepcao_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("startDate"));
        Log.info("Date of Receipt Field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Date of Receipt field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement Ate_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("endDate"));
        Log.info("Up until field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Up until field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement TipodeFormulario_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("formType"));
        Log.info("Type of form field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Type of form field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
public static WebElement Estado_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("boStatus"));
        Log.info("boStatus field is found on the Home Page");
    }catch (Exception e){
    	Log.error("boStatus field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement Enderecofisico_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("physicalAddress"));
        Log.info("physicalAddress field is found on the Home Page");
    }catch (Exception e){
    	Log.error("physicalAddress field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement municipality_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("municipality"));
        Log.info("municipality is found on the Home Page");
    }catch (Exception e){
    	Log.error("municipality is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement taxOffice_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("taxOffice"));
        Log.info("taxOffice is found on the Home Page");
    }catch (Exception e){
    	Log.error("taxOffice is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement externalFormBatchId_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("externalFormBatchId"));
        Log.info("external Form Batch Id field is found on the Home Page");
    }catch (Exception e){
    	Log.error("external Form Batch Id field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement formBatchHeader_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("formBatchHeader"));
        Log.info("form Batch Header field is found on the Home Page");
    }catch (Exception e){
    	Log.error("form Batch Header field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement IdentificadordoDocumento_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F1"));
        Log.info("Identificador do Documento field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Identificador do Documento field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement Pesquisar_RegistrationForm() throws Exception{
    try{
    	element = driver.findElement(By.id("anTLZ1Refresh"));
        Log.info("Pesquisar button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pesquisar button is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement PersonName() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[@class='grid paddedCell explorerGrid nowrap reg cursorDefault']"));
        Log.info("Person name is found");
    }catch (Exception e){
    	Log.error("Person name is not found");
   		throw(e);
   		}
   	return element;	
}
}
