package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class Degree360View_Page extends BaseClass{
    private static WebElement element = null;
   
public Degree360View_Page(WebDriver driver){
    	super(driver);
} 
/* public static WebElement PessoaTable() throws Exception{
    try{
    	int size = driver.findElements(By.tagName("iframe")).size();
    	System.out.println(size);
    	//driver.switchTo().frame("frame");
    	element = driver.findElement(By.xpath("//table[@id='filterUIFields']"));
    
        Log.info("Pessoa Table is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pessoa Table is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}*/

public static WebElement NomeCompleto() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[@id='fullName']"));
    
        Log.info("NomeCompleto field is found on the Home Page");
    }catch (Exception e){
    	Log.error("NomeCompleto field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement PrimeiroNome() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@id='firstName']"));
    
        Log.info("Primeiro Nome field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Primeiro Nome field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement UltimoNome() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@id='lastName']"));
    
        Log.info("Último Nome field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Último Nome field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 		
	
public static WebElement TipodeIdentificacao() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//select[@id='idType']"));
    
        Log.info("Tipo de Identificação field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tipo de Identificação field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 		

public static WebElement NºIdentificacao() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@id='idValue']"));
    
        Log.info("Nº Identificação field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Nº Identificação field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement TipodeImposto() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//select[@id='taxType']"));
    
        Log.info("Tipo de Imposto field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tipo de Imposto field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Pesquisar() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//input[@id='anTLZ1Refresh']"));
    
        Log.info("Pesquisar field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pesquisar field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement NomeResult(int iTestCaseRow) throws Exception{
    try{
    	String NomeResult = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NomeResult);
    	element = driver.findElement(By.xpath("//tbody[@id='dataExplorerTableBody1']/tr["+NomeResult+"]/td[2]/a/span"));
        Log.info("Nome Result field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Nome Result field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 
}

