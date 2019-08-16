package agt.psrm.appModules.appModules_NIFSearch;

import java.util.concurrent.TimeUnit;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.ContactodoCliente_Page;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Utils;

public class ContactodoCliente_Action {
	
    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	BaseClass.driver.manage().window().maximize();
    	
    	BaseClass.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	Thread.sleep(4000);
    	BaseClass.driver.switchTo().frame(0);
    	
    	ContactodoCliente_Page.Menu().click();
    	Log.info("Menu tab has been clicked");
    	
    	ContactodoCliente_Page.GestaodeTrabalho().click();
    	Log.info("GestaodeTrabalho Navigation has been clicked");
    	
    	ContactodoCliente_Page.ContactodoCliente().click();
    	Log.info("ContactodoCliente Navigation has been clicked");
    	
    	ContactodoCliente_Page.Pesquisar().click();
    	Log.info("Search navigation has been clicked");
    	
    	BaseClass.driver.switchTo().defaultContent();
    	BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(3);

    	ContactodoCliente_Page.Pessoas_Search().click();
    	Log.info("Search navigation has been clicked");
    	

    	//String parantWindow = BaseClass.driver.getWindowHandle();
    	Thread.sleep(1000);
        Utils.newWindowSwitch(); 
       // System.out.println(BaseClass.driver.getWindowHandle());
        System.out.println(BaseClass.driver.getTitle());
        SearchbyPerson_Action.Execute(iTestCaseRow);
        
        
       /*
        Alert alert = BaseClass.driver.switchTo().alert();
        alert.accept();
        
        Utils.ParantWindowSwitch(parantWindow);

        BaseClass.driver.switchTo().frame(0);
        BaseClass.driver.switchTo().frame(3);
        
        String PersonName = ContactodoCliente_Page.PessoaDetails().getText();
        if(!"".equalsIgnoreCase(PersonName)) {
        	
        	ExcelUtils.setCellData(PersonName, iTestCaseRow, Constant.Col_PersonName);
        	Reporter.log("Person with New NIF is displayed : Validation Success");
        }
        else {
        	Reporter.log("Person with New NIF is not displayed : Validation Failed");
        }
    	*/
    	
}
}