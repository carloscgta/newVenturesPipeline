package agt.psrm.appModules.appModules_NIFSearch.pageObjects.test;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.extras.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import agt.psrm.appModules.SignIn_Action;
import agt.psrm.appModules.appModules_NIFSearch.SearchTax_Action;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.BaseClass;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Constant;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.ExcelUtils;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;
import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Utils;
@Test ()
public class NIFSearch_SearchTax {
	public WebDriver driver;
	public static String sTestCaseName;
	private int iTestCaseRow;
	
	  @BeforeMethod
	  public void beforeMethod() throws Exception {
		  	DOMConfigurator.configure("log4j.xml");
		  	sTestCaseName = this.toString();
		  	sTestCaseName = Utils.getTestCaseName(this.toString());
			Log.startTestCase(sTestCaseName);
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"NIFSearch");
			iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			driver = Utils.OpenBrowser(iTestCaseRow);
			
			/*System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
			Log.info("New driver instantiated");
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    Log.info("Implicit wait applied on the driver for 10 seconds");
		    driver.get(Constant.URL);
		    Log.info("Web application launched successfully");
		    driver.manage().window().maximize();*/
			
			
			new BaseClass(driver);  
	        }
	  
	  @Test
	  public void degree360View() throws Exception {
		  try{
			SignIn_Action.Execute(iTestCaseRow);
			
			SearchTax_Action.Execute(iTestCaseRow);
			ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
			 Utils.takeScreenshot(driver, sTestCaseName);

		  }catch (Exception e){
			 ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
			 Utils.takeScreenshot(driver, sTestCaseName);
			  Log.error(e.getMessage());
			  throw (e);
		  }
			
	  }
	  @AfterMethod
	  public void afterMethod() {
		   Log.endTestCase(sTestCaseName);
		   driver.close();
	  		}
}
