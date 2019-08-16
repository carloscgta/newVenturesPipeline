package agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	public static WebDriver driver = null;
	public static ChromeOptions chromeOptions;
	
public static WebDriver OpenBrowser(int iTestCaseRow) throws Exception{
	String sBrowserName;
	try{
	sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
	if(sBrowserName.equals("Chrome")){
		/*/usr/bin/chromedriver
		 * usr/bin/chromedriver
		 *  C:/projetos/Automation/Driver/chromedriver.exe
		 * */
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("window-size=1980,860");
		driver = new ChromeDriver(chromeOptions);
		Log.info("New driver instantiated");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    Log.info("Implicit wait applied on the driver for 10 seconds");
	    driver.get(Constant.URL);
	    Log.info("Web application launched successfully");
	    driver.manage().window().maximize();
		}
	
	}catch (Exception e){
		Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
	}
	return driver;
}

//By Carlos 
public static WebDriver OpenBrowser02() throws Exception{
	
	try{
		// C:\projetos\Automation\Driver
		System.setProperty("webdriver.chrome.driver","C:/projetos/Automation/Driver/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		Log.info("New driver instantiated");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    Log.info("Implicit wait applied on the driver for 10 seconds");
	    driver.get(Constant.URL);
	    Log.info("Web application launched successfully");
	    driver.manage().window().maximize();
		
	
	}catch (Exception e){
		Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
	}
	return driver;
}

 public static String currentDate() {    
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
	   LocalDateTime now = LocalDateTime.now(); 
	   String date = dtf.format(now);
	   return date;
	  }    

public static String getTestCaseName(String sTestCase)throws Exception{
	String value = sTestCase;
	try{
		int posi = value.indexOf("@");
		value = value.substring(0, posi);
		posi = value.lastIndexOf(".");	
		value = value.substring(posi + 1);
		return value;
			}catch (Exception e){
		Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());
		throw (e);
				}
		}

 public static void waitForElement(WebElement element)
 {	 
	 WebDriverWait wait = new WebDriverWait(driver, 10);
     wait.until(ExpectedConditions.elementToBeClickable(element));
     }
 public static void waitForVisibleElement(WebElement element){
	 
	 WebDriverWait wait = new WebDriverWait(driver, 20);
     wait.until(ExpectedConditions.visibilityOf(element));
 	}
 public static void takeScreenshot(WebDriver driver, String sTestCaseName) throws Exception{
		try{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + sTestCaseName+System.currentTimeMillis() +"-Evidencia.jpg"));	
		} catch (Exception e){
			Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
			throw new Exception();
		}
	}
 
 public static void takeScreenshot02(WebDriver driver) throws Exception{
		try{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot+System.currentTimeMillis() +"Test-Evidencia.jpg"));	
		} catch (Exception e){
			Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
			throw new Exception();
		}
	}
 
 public static void ScrollBar(int size) {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("window.scrollBy(0,"+size+")");
 }
 
 public static void newWindowSwitch() {
	 String parantWindow = driver.getWindowHandle();
	 Set<String> allWindows = driver.getWindowHandles();
	 for(String currentWindow : allWindows) {
		 if (!currentWindow.equals(parantWindow)) {
			 driver.switchTo().window(currentWindow);
		 }
	 }
 }
 
 public static void ParantWindowSwitch(String parant) {
	 driver.switchTo().window(parant);
 }
}
