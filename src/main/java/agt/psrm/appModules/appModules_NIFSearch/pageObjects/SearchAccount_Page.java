package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class SearchAccount_Page extends BaseClass{
    private static WebElement element = null;
   
public SearchAccount_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement Menu_Registo() throws Exception{
    try{
    	element = driver.findElement(By.id("IM_menuButton"));
    
        Log.info("Menu button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Menu button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Registo() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Registo']"));
    
        Log.info("Registo Nevigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Registo Nevigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Conta() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Conta']"));
    
        Log.info("Conta Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Conta Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement SearchConta() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Pesquisar']"));
        Log.info("Acrescentar Conta Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Acrescentar Conta Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement Pessoas_SearchConta() throws Exception{
    try{
    	element = driver.findElement(By.id("PERSONS_TLBL"));
        Log.info("Pessoas Tab is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pessoas Tab is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement SearchPessoa_SearchConta() throws Exception{
    try{
    	element = driver.findElement(By.id("IM_ACCT_PER$PER_ID"));
        Log.info("Search Person button is found");
    }catch (Exception e){
    	Log.error("Search Person button is not found");
   		throw(e);
   		}
   	return element;	
}

public static WebElement PessoaDetails_SearchConta() throws Exception{
    try{
    	element = driver.findElement(By.id("ACCT_PER$ENTITY_INFO"));
        Log.info("Search Person button is found");
    }catch (Exception e){
    	Log.error("Search Person button is not found");
   		throw(e);
   		}
   	return element;	
}

}

