package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class HistoricodaContaCorrente_Page extends BaseClass{
    private static WebElement element = null;
   
public HistoricodaContaCorrente_Page(WebDriver driver){
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
	
public static WebElement HistoricodeContaCorrente() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Histórico de Conta Corrente']"));
    
        Log.info("Histórico de Conta Corrente Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Histórico de Conta Corrente Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement NIFSearch() throws Exception{
    try{
    	element = driver.findElement(By.id("taxPLegacyNIF_search"));
        Log.info("Search tax form is found on the Home Page");
    }catch (Exception e){
    	Log.error("Search tax form is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement PersonName() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[@class='paddedCell explorerGrid nowrap reg clickable']//following::td[2]/span"));
    	
    	
        Log.info("PersonName is found on the Home Page");
    }catch (Exception e){
    	Log.error("PersonName is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement AccountName() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[@class='paddedCell explorerGrid nowrap reg clickable']//following::td[1]/span"));
        Log.info("AccountName field is found on the Home Page");
    }catch (Exception e){
    	Log.error("AccountName field is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 


}
