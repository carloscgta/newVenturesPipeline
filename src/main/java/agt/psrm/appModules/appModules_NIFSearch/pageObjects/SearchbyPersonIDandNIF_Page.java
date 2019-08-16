package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class SearchbyPersonIDandNIF_Page extends BaseClass{
    private static WebElement element = null;
   
public SearchbyPersonIDandNIF_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement NomesdasPessoas() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F1"));
    
        Log.info("Person Name text box is found");
    }catch (Exception e){
    	Log.error("Person Name text box is not found");
   		throw(e);
   		}
   	return element;
} 	

public static WebElement TipodeIdentificacao() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F2"));
    
        Log.info("Identity Type dropdown is found");
    }catch (Exception e){
    	Log.error("Identity Type Dropdown is not found");
   		throw(e);
   		}
   	return element;
} 

public static WebElement NºIdentificacao() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F3"));
    
        Log.info("Indentity Number text box is found");
    }catch (Exception e){
    	Log.error("Indentity Number text box is not found");
   		throw(e);
   		}
   	return element;
} 

public static WebElement Conta() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F4"));
    
        Log.info("Conta text box is found");
    }catch (Exception e){
    	Log.error("Conta text box is not found");
   		throw(e);
   		}
   	return element;
} 

public static WebElement Pesquisar() throws Exception{
    try{
    	element = driver.findElement(By.id("anTLZ1Refresh"));
    
        Log.info("Pesquisar Button is found");
    }catch (Exception e){
    	Log.error("Pesquisar button is not found");
   		throw(e);
   		}
   	return element;
}

public static WebElement Conta_Result() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[@class='paddedCell explorerGrid nowrap reg clickable']"));
    
        Log.info("Conta result is found");
    }catch (Exception e){
    	Log.error("Conta Result is not found");
   		throw(e);
   		}
   	return element;
}

public static WebElement Name_Result() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[@class='paddedCell explorerGrid nowrap reg clickable']//following::td"));
    
        Log.info("Name result is found");
    }catch (Exception e){
    	Log.error("Name Result is not found");
   		throw(e);
   		}
   	return element;
}
}
