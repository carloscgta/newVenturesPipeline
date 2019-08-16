package agt.psrm.appModules.appModules_NIFSearch.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import agt.psrm.appModules.appModules_NIFSearch.pageObjects.test.utility.Log;

public class LogIn_Page extends BaseClass {
	
    private static WebElement element = null;
    
    public LogIn_Page(WebDriver driver){
        	super(driver);
    }     
    public static WebElement txtbx_UserName() throws Exception{
    	try{
            element = driver.findElement(By.cssSelector("#userId"));
            Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        }
    
    public static WebElement txtbx_Password() throws Exception{
    	try{
        	element = driver.findElement(By.cssSelector("#password"));
            Log.info("Password text box is found on the Login page");
    	}catch (Exception e){
    		Log.error("Password text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
    }
    
    public static WebElement btn_LogIn() throws Exception{
    	try{
        	element = driver.findElement(By.cssSelector("#loginButton"));
            Log.info("Submit button is found on the Login page");
    	}catch (Exception e){
    		Log.error("Submit button is not found on the Login Page");
       		throw(e);
       		}
       	return element;
    }
}
