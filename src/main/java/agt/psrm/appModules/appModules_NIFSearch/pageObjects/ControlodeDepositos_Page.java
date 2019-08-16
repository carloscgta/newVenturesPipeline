package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class ControlodeDepositos_Page extends BaseClass{
    private static WebElement element = null;
   
public ControlodeDepositos_Page(WebDriver driver){
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
public static WebElement ControlodeDepositos() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Controlo de Depósitos']"));
    
        Log.info("Controlo de Depósitos Navigation is found");
    }catch (Exception e){
    	Log.error("Controlo de Depósitos Navigation is not found");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement Pesquisar_Pagamentos() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Pesquisar']"));
        Log.info("Pesquisar navigation is found");
    }catch (Exception e){
    	Log.error("Pesquisar navigation is not found");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement Add_Pagamentos() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Adicionar']"));
        Log.info("Adicionar navigation is found");
    }catch (Exception e){
    	Log.error("Adicionar navigation is not found");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement ContadePagamentos_Values() throws Exception{
    try{
    	element = driver.findElement(By.id("ACCT_ID"));
        Log.info("Conta de Pagamentos value is found");
    }catch (Exception e){
    	Log.error("Conta de Pagamentos value is not found");
   		throw(e);
   		}
   	return element;	
}

public static WebElement MontantedePagamento_dropdown() throws Exception{
    try{
    	element = driver.findElement(By.id("PAY_AMT_FLTR_FLG"));
        Log.info("Montante de Pagamento dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Montante de Pagamento dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement MontantedePagamento_Values1() throws Exception{
    try{
    	element = driver.findElement(By.id("PAY_AMT_FROM"));
        Log.info("Montante de Pagamento values 1 is found on the Home Page");
    }catch (Exception e){
    	Log.error("Montante de Pagamento values 1 is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement MontantedePagamento_Values2() throws Exception{
    try{
    	element = driver.findElement(By.id("PAY_AMT_FROM"));
        Log.info("Montante de Pagamento values 2 is found on the Home Page");
    }catch (Exception e){
    	Log.error("Montante de Pagamento values 2 is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement ContadaEntidadePagadora_dropdown() throws Exception{
    try{
    	element = driver.findElement(By.id("TNDR_ACCT_FLTR_FLG"));
        Log.info("Conta da Entidade Pagadora dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Conta da Entidade Pagadora dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement ContadaEntidadePagadora_Value() throws Exception{
    try{
    	element = driver.findElement(By.id("PAYOR_ACCT_ID"));
        Log.info("Conta da Entidade Pagadora value is found on the Home Page");
    }catch (Exception e){
    	Log.error("Conta da Entidade Pagadora value is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement MontantedoMetododePagamento_Dropdown() throws Exception{
    try{
    	element = driver.findElement(By.id("TNDR_AMT_FLTR_FLG"));
        Log.info("Montante do Método de Pagamento dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Montante do Método de Pagamento dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement MontantedoMetododePagamento_Values1() throws Exception{
    try{
    	element = driver.findElement(By.id("TENDER_AMT_FROM"));
        Log.info("Montante do Método de Pagamento Values 1 is found on the Home Page");
    }catch (Exception e){
    	Log.error("Montante do Método de Pagamento Values 1 is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement MontantedoMetododePagamento_Values2() throws Exception{
    try{
    	element = driver.findElement(By.id("TENDER_AMT_TO"));
        Log.info("Montante do Método de Pagamento Values 2 is found on the Home Page");
    }catch (Exception e){
    	Log.error("Montante do Método de Pagamento Values 2 is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement OrigemdoMetododePagamento_dropdown() throws Exception{
    try{
    	element = driver.findElement(By.id("TNDR_SRCE_FLTR_FLG"));
        Log.info("Origem do Método de Pagamento dropdowns is found on the Home Page");
    }catch (Exception e){
    	Log.error("Origem do Método de Pagamento dropdowns is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement OrigemdoMetododePagamento_Value() throws Exception{
    try{
    	element = driver.findElement(By.id("TNDR_SOURCE_CD"));
        Log.info("Origem do Método de Pagamento Value is found on the Home Page");
    }catch (Exception e){
    	Log.error("Origem do Método de Pagamento Value is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement MICRID_Dropdown() throws Exception{
    try{
    	element = driver.findElement(By.id("TNDR_MICR_FLTR_FLG"));
        Log.info("MICRID dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("MICRID dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement MICRID_Value() throws Exception{
    try{
    	element = driver.findElement(By.id("MICR_ID"));
        Log.info("MICRID dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("MICRID dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement DatadePagamento_Dropdown() throws Exception{
    try{
    	element = driver.findElement(By.id("PAY_DT_FLTR_FLG"));
        Log.info("Data de Pagamento dropdown is found on the Home Page");
    }catch (Exception e){
    	Log.error("Data de Pagamento dropdown is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
} 

public static WebElement DatadePagamento_Value1() throws Exception{
    try{
    	element = driver.findElement(By.id("PAY_DT_FROM"));
        Log.info("Data de Pagamento Value 1 is found on the Home Page");
    }catch (Exception e){
    	Log.error("Data de Pagamento Value 1 is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}

public static WebElement DatadePagamento_Value2() throws Exception{
    try{
    	element = driver.findElement(By.id("PAY_DT_TO"));
        Log.info("Data de Pagamento Value 2 is found on the Home Page");
    }catch (Exception e){
    	Log.error("Data de Pagamento Value 2 is not found on the Home Page");
   		throw(e);
   		}
   	return element;	
}
public static WebElement Search() throws Exception{
    try{
    	element = driver.findElement(By.id("BU_SRCH"));
        Log.info("Search button is found");
    }catch (Exception e){
    	Log.error("Search Button is not found");
   		throw(e);
   		}
   	return element;	
} 

}
