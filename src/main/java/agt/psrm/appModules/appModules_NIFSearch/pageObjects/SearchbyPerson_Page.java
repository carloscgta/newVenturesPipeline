package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class SearchbyPerson_Page extends BaseClass{
    private static WebElement element = null;
   
public SearchbyPerson_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement NomedaPessoa() throws Exception{
    try{
    	element = driver.findElement(By.id("ENTITY_NAME"));
    
        Log.info("Person Name text box is found");
    }catch (Exception e){
    	Log.error("Person Name text box is not found");
   		throw(e);
   		}
   	return element;
} 	

public static WebElement Pesquisar_NomedaPessoa() throws Exception{
    try{
    	element = driver.findElement(By.id("BU_Alternate_search"));
    
        Log.info("Pesquisar Button is found");
    }catch (Exception e){
    	Log.error("Pesquisar button is not found");
   		throw(e);
   		}
   	return element;
}

public static WebElement Pessoa() throws Exception{
    try{
    	element = driver.findElement(By.id("PER_ID"));
    
        Log.info("Pessoa field is found");
    }catch (Exception e){
    	Log.error("Pessoa field is not found");
   		throw(e);
   		}
   	return element;
} 

public static WebElement Pesquisar_Pessoa() throws Exception{
    try{
    	element = driver.findElement(By.id("BU_Main_search"));
    
        Log.info("Pesquisar Button is found");
    }catch (Exception e){
    	Log.error("Pesquisar button is not found");
   		throw(e);
   		}
   	return element;
}

public static WebElement TipodeID() throws Exception{
    try{
    	element = driver.findElement(By.id("ID_TYPE_CD"));
    
        Log.info("TipodeID Dropdown is found");
    }catch (Exception e){
    	Log.error("TipodeID Dropdown is not found");
   		throw(e);
   		}
   	return element;
}

public static WebElement NumerodaID() throws Exception{
    try{
    	element = driver.findElement(By.id("PER_ID_NBR"));
    
        Log.info("Indentity Number text box is found");
    }catch (Exception e){
    	Log.error("Indentity Number text box is not found");
   		throw(e);
   		}
   	return element;
} 
   
public static WebElement Pesquisar_TipodeID() throws Exception{
    try{
    	element = driver.findElement(By.id("BU_Alternate2_search"));
    
        Log.info("Pesquisar Button is found");
    }catch (Exception e){
    	Log.error("Pesquisar button is not found");
   		throw(e);
   		}
   	return element;
}

public static WebElement NomedaPessoa_Result() throws Exception{
    try{
    	element = driver.findElement(By.id("SEARCH_RESULTS:0$ENTITY_NAME"));
    
        Log.info("Person Name result is found");
    }catch (Exception e){
    	Log.error("Person Name result is not found");
   		throw(e);
   		}
   	return element;
}
}
