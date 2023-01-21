package com.bankingroject.loginpage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bankingroject.base.BaseClass;

public class LoginPageTest extends BaseClass{
	
//	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		launchWebsite();
		
	}
    @AfterMethod
	public void tearDown() {
    	driver.close();
    }
	
    @Test
   public void testTitle()
    {
    	String pageTitle = driver.getTitle();
    	if(pageTitle.equalsIgnoreCase("GTPL Bank Home Page"))
    	{
    		System.out.println("We are on correct page");
    	}
    	else
    	{
    		System.out.println("We are wrong page");
    	}
    }
    	  @Test
    	   public void testUrl()
    	    {
    	    	String pageUrl = driver.getCurrentUrl();
    	    	if(pageUrl.equalsIgnoreCase("GTPL Bank Home Page"))
    	    	{
    	    		System.out.println("We are on correct url");
    	    	}
    	    	else
    	    	{
    	    		System.out.println("We are wrong url");
    	    	}
    	 
    	    
    	    
    }
	
}
