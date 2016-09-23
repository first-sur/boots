package com.cucumber.boots.feature.web.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.boots.pageobjects.AutomationHomePage;
import com.cucumber.boots.utils.DriverFactory;
import com.cucumber.boots.utils.PropertyReader;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StartingSteps extends DriverFactory {
	
	

	    private WebDriver driver;


	    @Before
	    public void beforeScenario() {
	        driver = new DriverFactory().getDriver();
	        String websiteUrl = new PropertyReader().readProperty("websiteUrl");
	        driver.get(websiteUrl);
	        System.out.println("this will run before the actual scenario");
	    }

	    @After
	    public void afterScenario() throws Throwable{
	    	
	        new DriverFactory().destroyDriver();
	        System.out.println("this will run after scneario is finished, even if it failed");
	    }


	   
	    
	    @Given("^user is on home page and clicks Register link$")
	    public void clickRegisterLink() throws Throwable {
	    	PageFactory.initElements(driver, AutomationHomePage.class);
	    	new AutomationHomePage(driver).register.click();
	    	
	    }

	  
}
