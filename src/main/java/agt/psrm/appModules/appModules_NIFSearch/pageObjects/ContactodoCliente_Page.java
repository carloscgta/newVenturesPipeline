package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class ContactodoCliente_Page extends BaseClass{
    private static WebElement element = null;
   
public ContactodoCliente_Page(WebDriver driver){
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
    
        Log.info("Gestão de Trabalho Nevigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Gestão de Trabalho Nevigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement ContactodoCliente() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Contacto do Cliente']"));
    
        Log.info("Contacto do Cliente Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Contacto do Cliente Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Pesquisar() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Pesquisar']"));
        Log.info("Pesquisar Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pesquisar Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement Pessoas_Search() throws Exception{
    try{
    	element = driver.findElement(By.id("IM_PER_ID"));
        Log.info("Pessoas Search button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pessoas Search button is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement PessoaDetails() throws Exception{
    try{
    	element = driver.findElement(By.id("ENTITY_INFO"));
        Log.info("Search Person button is found");
    }catch (Exception e){
    	Log.error("Search Person button is not found");
   		throw(e);
   		}
   	return element;	
}

}
