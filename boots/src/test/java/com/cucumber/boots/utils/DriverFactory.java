package com.cucumber.boots.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	protected static WebDriver driver;


    public DriverFactory() {
        initialize();
    }

    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }

    private void createNewDriverInstance() {
    	 String browser = new PropertyReader().readProperty("browser");
         if (browser.equals("firefox")) {
             driver = new FirefoxDriver();
             
             
         }else  if (browser.equals("chrome")) {
        	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//BrowserDrivers//chromedriver.exe");
         
			driver = new ChromeDriver();			
			Log.info("Chrome Driver Instance loaded successfully.");
         }else  if (browser.equals("IE")) {
        	//To Load IE driver Instance.
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//BrowserDrivers//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
				Log.info("IE Driver Instance loaded successfully.");
         }        
         else {
             System.out.println("can't read browser type");
         }
         	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }

	
	
		
		

}
