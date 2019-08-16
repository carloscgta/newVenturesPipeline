package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class Efectuarpagamentos_Page extends BaseClass{
    private static WebElement element = null;
   
public Efectuarpagamentos_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement Menu_Pagamentos() throws Exception{
    try{
    	element = driver.findElement(By.id("IM_menuButton"));
    
        Log.info("Menu button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Menu button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Pagamentos() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Pagamentos']"));
    
        Log.info("Pagamentos Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pagamentos Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Efectuarpagamentos() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Efectuar pagamentos']"));
    
        Log.info("Efectuar pagamentos Navigation is found");
    }catch (Exception e){
    	Log.error("Efectuar pagamentos Navigation is not found");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement NIFSearch() throws Exception{
    try{
    	element = driver.findElement(By.id("payments_taxpayerNIF_search"));
        Log.info("NIFSearch button is found");
    }catch (Exception e){
    	Log.error("NIF Search button is not found");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement PersonName() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Contribuinte']/following::td/span"));
        Log.info("PersonName field is found");
    }catch (Exception e){
    	Log.error("PersonName field is not found");
   		throw(e);
   		}
   	return element;	
}

public static WebElement AccountName() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Conta']/following::td/span"));
        Log.info("AccountName field is found");
    }catch (Exception e){
    	Log.error("AccountName field is not found");
   		throw(e);
   		}
   	return element;	
}


}
