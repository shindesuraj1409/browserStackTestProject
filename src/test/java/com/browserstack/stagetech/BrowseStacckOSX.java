package com.browserstack.stagetech;



import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowseStacckOSX {
  public static final String USERNAME = "shindesuraj1";
  public static final String AUTOMATE_KEY = "4q2zsp2JvvgUpf1LqhUA";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
  public WebDriver driver;
  @BeforeMethod
  public void setup() throws MalformedURLException
  {
	  DesiredCapabilities caps = new DesiredCapabilities();
	    
	    caps.setCapability("os", "OS X");
	    caps.setCapability("os_version", "Mojave");
	    caps.setCapability("browser", "Safari");
	    caps.setCapability("browser_version", "12.1");
	    
	    caps.setCapability("name", "Safari Test");
	    
	    driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("http://www.google.com");
  
  }
  
  @Test
  public void serachOnBrowser()
  {
	  WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
 
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
           
  
}
