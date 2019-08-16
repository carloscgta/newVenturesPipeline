package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class GestaodeContribuintesInadimplentes_Page extends BaseClass{
    private static WebElement element = null;
   
public GestaodeContribuintesInadimplentes_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement Menu_Inadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.id("IM_menuButton"));
    
        Log.info("Menu button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Menu button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement GestaodeTrabalho_Inadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Gestão de Trabalho']"));
    
        Log.info("Gestão de Trabalho navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("Gestão de Trabalho navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement GestaodeContribuintesInadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Gestão de Contribuintes Inadimplentes']"));
    
        Log.info("TaxFormTab Navigation is found on the Home Page");
    }catch (Exception e){
    	Log.error("TaxFormTab Navigation is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	

public static WebElement PesquisarPor_Inadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.id("multiQueryZoneFilters1"));
    
        Log.info("Pesquisar Por field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pesquisar Por Field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Nome_Inadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F1"));
    
        Log.info("Nome field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Nome Field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement PrimeiroNome_Inadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F2"));
    
        Log.info("Primeiro Nome field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Primeiro Nome Field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement UltimoNome_Inadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F3"));
    
        Log.info("Último Nome field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Último Nome Field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement TipodeIdentificacao_Inadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F4"));
    
        Log.info("Tipo de Identificação field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tipo de Identificação Field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement NºIdentificacao_Inadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.id("filter1.F5"));
    
        Log.info("Nº Identificação field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Nº Identificação Field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}


public static WebElement Pesquisar_Inadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.id("anTLZ1Refresh"));
        Log.info("Pesquisar button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Pesquisar button is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement InformacoesdoFluxodoProcesso_Inadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[@class='pseudoLink']"));
        Log.info("Informações do Fluxo do Processo field is found");
    }catch (Exception e){
    	Log.error("Informações do Fluxo do Processo field is not found");
   		throw(e);
   		}
   	return element;	
}

public static WebElement Nome() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[@class='grid paddedCell explorerGrid nowrap reg cursorDefault']"));
        Log.info("Nome field is found");
    }catch (Exception e){
    	Log.error("Nome field is not found");
   		throw(e);
   		}
   	return element;	
}

public static WebElement PersonID_Inadimplentes() throws Exception{
    try{
    	element = driver.findElement(By.id("personId"));
        Log.info("personId field is found");
    }catch (Exception e){
    	Log.error("personId field is not found");
   		throw(e);
   		}
   	return element;	
}
}
