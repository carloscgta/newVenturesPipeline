package agt.psrm.appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.Degree360View_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

//This is called Modularization, when we club series of actions in to one Module
//For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/   
 public class Degree360View_Action {
 	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
 	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
 	// For use of Functions & Parameters, please see http://www.toolsqa.com/function-parameters/
     public static void Execute(int iTestCaseRow) throws Exception{
     	
     	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     	Thread.sleep(8000);
     	BaseClass.driver.switchTo().frame(0);
     	BaseClass.driver.switchTo().frame(3);
     	Degree360View_Page.NomeCompleto().clear();
     	String CompleteName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NomeCompleto);
         Degree360View_Page.NomeCompleto().sendKeys(CompleteName);
         Log.info(CompleteName+" is entered in CompleteName text box" );
         
         Degree360View_Page.PrimeiroNome().clear();
     	String FirstName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PrimeiroNome);
         Degree360View_Page.PrimeiroNome().sendKeys(FirstName);
         Log.info(FirstName+" is entered in FirstName text box" );
         
         Degree360View_Page.UltimoNome().clear();	
     	String LastName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Sobrenome	);
         Degree360View_Page.UltimoNome().sendKeys(LastName);
         Log.info(LastName+" is entered in FirstName text box" );
         
         Select TipodeIdentificacaodropdown = new Select(Degree360View_Page.TipodeIdentificacao());
         String TipodeIdentificacaoValue = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodeIdentificacao);
         TipodeIdentificacaodropdown.selectByVisibleText(TipodeIdentificacaoValue);
         Log.info(TipodeIdentificacaoValue+" value has been selected in dropdown" );
         
         Degree360View_Page.NºIdentificacao().clear();	
     	String NºIdentificacao = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_CodigodoID);
         Degree360View_Page.NºIdentificacao().sendKeys(NºIdentificacao);
         Log.info(NºIdentificacao+" is entered in FirstName text box" );
         
         /*Select TipodeImpostoTipdropdown = new Select(Degree360View_Page.TipodeImposto());
         String TipodeImpostoValue = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_TipodoImposto);
         TipodeImpostoTipdropdown.selectByVisibleText(TipodeImpostoValue);
         Log.info(TipodeImpostoValue+" value has been selected in dropdown" );*/
         
         Degree360View_Page.Pesquisar().click();
         Log.info("Search button has been clicked");
         
         Degree360View_Page.NomeResult(iTestCaseRow).click();
         Log.info("Name field in result section has been clicked");
         Thread.sleep(10000);
   
     }
 }
