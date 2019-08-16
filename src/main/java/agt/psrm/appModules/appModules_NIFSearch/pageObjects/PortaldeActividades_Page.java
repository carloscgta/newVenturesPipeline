package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class PortaldeActividades_Page extends BaseClass{
    private static WebElement element = null;
   
public PortaldeActividades_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement Actividade() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Actividade']"));
    
        Log.info("TaxFormTab Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("TaxFormTab Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 
public static WebElement CompleteName() throws Exception{
    try{
    	element = driver.findElement(By.id("fullNameValue"));
    
        Log.info("Complete Name text box is found");
    }catch (Exception e){
    	Log.error("Complete Name text box is not found");
   		throw(e);
   		}
   	return element;
} 	

public static WebElement PrimeiroNome() throws Exception{
    try{
    	element = driver.findElement(By.id("firstNameValue"));
    
        Log.info("firstNameValue field is found");
    }catch (Exception e){
    	Log.error("firstNameValue field is not found");
   		throw(e);
   		}
   	return element;
}

public static WebElement UltimoNome() throws Exception{
    try{
    	element = driver.findElement(By.id("lastNameValue"));
    
        Log.info("lastNameValue field is found");
    }catch (Exception e){
    	Log.error("lastNameValue field is not found");
   		throw(e);
   		}
   	return element;
} 

public static WebElement TipodeID() throws Exception{
    try{
    	element = driver.findElement(By.id("personIdType"));
    
        Log.info("TipodeID Dropdown is found");
    }catch (Exception e){
    	Log.error("TipodeID Dropdown is not found");
   		throw(e);
   		}
   	return element;
}

public static WebElement ValordaID() throws Exception{
    try{
    	element = driver.findElement(By.id("personIdValue"));
    
        Log.info("Indentity Number text box is found");
    }catch (Exception e){
    	Log.error("Indentity Number text box is not found");
   		throw(e);
   		}
   	return element;
} 
   
public static WebElement Pesquisar_TipodeID() throws Exception{
    try{
    	element = driver.findElement(By.id("anTLZ1Refresh"));
    
        Log.info("Pesquisar Button is found");
    }catch (Exception e){
    	Log.error("Pesquisar button is not found");
   		throw(e);
   		}
   	return element;
}

public static WebElement IDdaPessoa() throws Exception{
    try{
    	element = driver.findElement(By.cssSelector("span[title=\"Ir Para Person\"]"));
    
        Log.info("ID da Pessoa field is found");
    }catch (Exception e){
    	Log.error("ID da Pessoa field is not found");
   		throw(e);
   		}
   	return element;
}

public static WebElement Nome() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[@id='gridTbl_h_entityName_personName']//following::tr/td[2]"));
    
        Log.info("Nome field is found");
    }catch (Exception e){
    	Log.error("Nome field is not found");
   		throw(e);
   		}
   	return element;
}
}
