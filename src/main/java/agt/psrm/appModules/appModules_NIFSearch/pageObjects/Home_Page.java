package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class Home_Page extends BaseClass{
    private static WebElement element = null;
   
public Home_Page(WebDriver driver){
    	super(driver);
}    

public static WebElement lnk_LogOut() throws Exception{
    try{
    	element = driver.findElement(By.xpath("//*[@id='navbar']/ul/li[5]"));
    
        Log.info("Log Out link is found on the Home Page");
    }catch (Exception e){
    	Log.error("Log Out link is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

}
