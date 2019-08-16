package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class CollectionReport_Page extends BaseClass{
    private static WebElement element = null;
   
public CollectionReport_Page(WebDriver driver){
    	super(driver);
} 

public static WebElement Menu_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("IM_menuButton"));
    
        Log.info("Menu button is found on the Home Page");
    }catch (Exception e){
    	Log.error("Menu button is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 	
public static WebElement CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Relatorio de Arrecadacao']"));
    
        Log.info("Collection Report nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Collection Report nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
} 
public static WebElement RelatorioDetalhadodeLiquidacao_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Relatorio Detalhado de Liquidacao']"));
    
        Log.info("Relatorio Detalhado de Liquidacao nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Detalhado de Liquidacao nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RelatorioDetalhadodeLiquidacoesporEstado_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Relatorio Detalhado de Liquidacoes por Estado']"));
    
        Log.info("Relatorio Detalhado de Liquidacoes por Estado nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Detalhado de Liquidacoes por Estado nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RelatorioDetalhadodeLiquidacaoporContribuinte_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//span[text()='Relatorio Detalhado de Liquidacao por Contribuinte']"));
    
        Log.info("Relatorio Detalhado de Liquidacao por Contribuinte nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Detalhado de Liquidacao por Contribuinte nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RelatorioDetalhadodePagamentos_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x3"));
    
        Log.info("Relatorio Detalhado de Pagamentos nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Detalhado de Pagamentos nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RelatorioConsolidadoporMeiodePagamento_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x4"));
    
        Log.info("Relatorio  Consolidado por Meio de Pagamento nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio  Consolidado por Meio de Pagamento nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RelatorioConsolidadodePagamentosMensais_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x5"));
    
        Log.info("Relatorio Consolidado de Pagamentos Mensais nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Consolidado de Pagamentos Mensais nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RelatorioConsolidadodePagamentoporServicoFiscal_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x6"));
    
        Log.info("Relatorio Consolidado de Pagamento por Servico Fiscal nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Consolidado de Pagamento por Servico Fiscal nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RelatorioConsolidadodePagamentosporCodigodeReceita_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x7"));
    
        Log.info("Relatorio Consolidado de Pagamentos por Codigo de Receita nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Consolidado de Pagamentos por Codigo de Receita nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RelatorioDetalhadodePagamentoporContribuinte_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x8"));
    
        Log.info("Relatorio Detalhado de Pagamento por Contribuinte nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Detalhado de Pagamento por Contribuinte nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RelatorioDetalhadoporPagamentosporBeneficiario_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x9"));
    
        Log.info("Relatorio Detalhado por Pagamentos por Beneficiario nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Detalhado por Pagamentos por Beneficiario nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RelatorioDetalhadodeReversoeseAnulacoes_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x10"));
    
        Log.info("Relatorio Detalhado de Reversoes e Anulacoes nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Detalhado de Reversoes e Anulacoes nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
public static WebElement RelatorioDetalhadodeFaltosos_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x11"));
    
        Log.info("Relatorio Detalhado de Faltosos nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Detalhado de Faltosos nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement RelatorioDetalhadodeJuroseMultas_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x12"));
    
        Log.info("Relatorio Detalhado de Juros e Multas nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Detalhado de Juros e Multas nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement RelatoriodeProdutividade_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x13"));
    
        Log.info("Relatorio de Produtividade (Arrecadacao) nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio de Produtividade (Arrecadacao) nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement RelatorioDetalhadodePagamentosnoMulticaixa_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x14"));
    
        Log.info("Relatorio Detalhado de Pagamentos no Multicaixa nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Relatorio Detalhado de Pagamentos no Multicaixa nav is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement BusinessIntelligence_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("CM_PAY_REPORT_subMenuItem0x15"));
    
        Log.info("Business Intelligence nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Business Intelligence nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement DatadeInicio_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Data de Inicio']//following::input"));
    
        Log.info("Data de Inicio field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Data de Inicio field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}



public static WebElement DatadeFim_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Data de Fim']//following::input"));
    
        Log.info("Business Intelligence nav is found on the Home Page");
    }catch (Exception e){
    	Log.error("Business Intelligence nav  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Visao_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("generateDetlSettelReport_vision"));
    
        Log.info("Visao field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Visao field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement RegiaoTributaria_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Regiao Tributaria']//following::select"));
    
        Log.info("Regiao Tributaria field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Regiao Tributaria field  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Provincia_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Provincia']//following::select"));
    
        Log.info("Provincia field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Provincia field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement ServicoFiscal_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Servico Fiscal']//following::select"));
    
        Log.info("Servico Fiscal field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Servico Fiscal field  is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Utilizador_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Utilizador']//following::select[1]"));
    
        Log.info("Utilizador field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Utilizador field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement EntidadeArrecadadora_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Entidade Arrecadadora']//following::select"));
    
        Log.info("Entidade Arrecadadora field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Entidade Arrecadadora field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Grupodeimposto_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("generateDetlSettelReport_taxGroup"));
    
        Log.info("Grupo de imposto field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Grupo de imposto field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement TipodeImposto_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("generateDetlSettelReport_taxCode"));
    
        Log.info(" TipodeImposto field is found on the Home Page");
    }catch (Exception e){
    	Log.error(" TipodeImposto field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement GrupodeimpostoPR_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("generatePayReport_taxGroup"));
    
        Log.info("Grupo de imposto field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Grupo de imposto field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement TipodeImpostoPR_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("generatePayReport_taxCode"));
    
        Log.info(" TipodeImposto field is found on the Home Page");
    }catch (Exception e){
    	Log.error(" TipodeImposto field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement FormadeLiquidacao_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("generateDetlSettelReport_taxCode"));
    
        Log.info(" Forma de Liquidacao field is found on the Home Page");
    }catch (Exception e){
    	Log.error(" Forma de Liquidacao field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement TipodeFicheiro_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Tipo de Ficheiro']//following::select"));
    
        Log.info(" Tipo de Ficheiro field is found on the Home Page");
    }catch (Exception e){
    	Log.error(" Tipo de Ficheiro field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement VerRelatorio_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("report"));
    
        Log.info(" Ver Relatorio field is found on the Home Page");
    }catch (Exception e){
    	Log.error(" Ver Relatorio field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement NIF_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("generatePayReport_nif"));
    
        Log.info("NIF field is found on the Home Page");
    }catch (Exception e){
    	Log.error("NIF field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement personName_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("personName"));
    
        Log.info("person Name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("person Name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement Conta_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("generatePayReport_account"));
    
        Log.info("Conta field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Conta field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement EstadodaDLI_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Estado da DLI']//following::select"));
    
        Log.info("Estado da DLI field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Estado da DLI field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
	
public static WebElement NIFBen_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("generatePayBenReport_benNif"));
    
        Log.info("Beneficiary NIF field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Beneficiary NIF field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement personNameBen_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("personName"));
    
        Log.info("Beneficiary person Name field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Beneficiary person Name field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement ContaBen_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.id("generatePayBenReport_benAccount"));
    
        Log.info("Conta field Beneficiary is found on the Home Page");
    }catch (Exception e){
    	Log.error("Conta field Beneficiary is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement TipodeAccao_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Tipo de Accao']//following::select"));
    
        Log.info("Tipo de Accao field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tipo de Accao field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement TipodeContribuinte_CollectionReport() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[text()='Tipo de Contribuinte']//following::select"));
    
        Log.info("Tipo de Contribuinte field is found on the Home Page");
    }catch (Exception e){
    	Log.error("Tipo de Contribuinte field is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

}

