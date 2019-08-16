package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class CertidaodeDivida_Page extends BaseClass{
    private static WebElement element = null;
   
public CertidaodeDivida_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement Menu_ertidaodeDivida() throws Exception{
    try{
    	element = driver.findElement(By.id("IM_menuButton"));
    
        Log.info("Menu button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Menu button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	

public static WebElement CertidaodeDivida() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Certidăo de Dívida']"));
    
        Log.info("CertidăodeDívidaTab Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("CertidăodeDívidaTab Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement CertidaodeNaoDevedor_CertidaodeDivida() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Certidăo de Năo Devedor']"));
        Log.info("Certidăo de Năo Devedor Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Certidăo de Năo Devedor Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement CertidaodeDevedor_CertidaodeDivida() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Certidăo de Devedor']"));
        Log.info("Certidăo de Devedor Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Certidăo de Devedor Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
 

public static WebElement NIFSearch_CertidaodeNaoDevedor() throws Exception{
    try{
    	element = driver.findElement(By.id("generateNonDebitTaxPReport_nif_search"));
        Log.info("NIFSearch button is found on the Home Page");
    }catch (Exception e){
    	Log.error("NIFSearch button is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement NIFSearch_CertidaodeDevedor() throws Exception{
    try{
    	element = driver.findElement(By.id("generateDebitTaxPReport_nif_search"));
        Log.info("NIFSearch button is found on the Home Page");
    }catch (Exception e){
    	Log.error("NIFSearch button is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}  

public static WebElement Pessoa() throws Exception{
    try{
    	element = driver.findElement(By.id("personName"));
    	//element = driver.findElement(By.xpath("//*[@id='PER_ID']//following::td"));
    	
        Log.info("Person name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Person name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 
}
