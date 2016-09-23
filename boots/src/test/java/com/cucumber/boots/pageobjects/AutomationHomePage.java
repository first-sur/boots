
package com.cucumber.boots.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class AutomationHomePage extends BaseClass{

	public AutomationHomePage(WebDriver driver){
		super(driver);
	}    

	
	@FindBy(how=How.LINK_TEXT, using="Login")
	public  static WebElement login;
	
	@FindBy(how=How.LINK_TEXT, using="Register")
	public  static WebElement register;
	
			
	
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	