package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class TaxpayerStatusChange_Page extends BaseClass{
    private static WebElement element = null;
   
public TaxpayerStatusChange_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement Menu() throws Exception{
    try{
    	element = driver.findElement(By.id("IM_menuButton"));
    
        Log.info("Menu button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Menu button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement GestaodeTrabalho() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Gestão de Trabalho']"));
    
        Log.info("Gestão de Trabalho navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Gestão de Trabalho navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Alteracaodeestadodocontribuinte() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Alteração de estado do contribuinte']"));
    
        Log.info("Alteração de estado do contribuinte Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Alteração de estado do contribuinte Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	

public static WebElement Acrescentar() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Acrescentar']"));
    
        Log.info("Acrescentar Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Acrescentar Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement NIFSearch() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_statusChangeInfo_NIF_search"));
    
        Log.info("NIFSearch Button is found on the Home Page");
    }catch (Exception e){
    	Log.error("NIFSearch Button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement PersonID() throws Exception{
    try{
    	element = driver.findElement(By.id("boGroup_legalName"));
    
        Log.info("PersonID field is found on the Home Page");
    }catch (Exception e){
    	Log.error("PersonID field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}


}
