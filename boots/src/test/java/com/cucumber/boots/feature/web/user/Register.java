package com.cucumber.boots.feature.web.user;




import org.openqa.selenium.support.PageFactory;

import com.cucumber.boots.pageobjects.AutomationHomePage;
import com.cucumber.boots.utils.DriverFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;


public class Register extends DriverFactory{

    
    public Register()   {
     }   
 
    @When("^she provides the email address as follows and click Register button$")
    public void registerUser(DataTable table) throws Throwable {
    	PageFactory.initElements(driver, AutomationHomePage.class);
    	new AutomationHomePage(driver).register.click();
    	//AutomationHomePage.sign_in.click();
    }
    
    
    
    
   

    
}