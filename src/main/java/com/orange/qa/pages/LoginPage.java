package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;
import com.orange.qa.pages.HomePage;

public class LoginPage extends TestBase{
	
	//Initializing the Page Object
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory or Object Repository
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	@FindBy(xpath="//*[@id='divLogo']/img")
	public WebElement hrmLogo;
	
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateHRMImage(){
		return hrmLogo.isDisplayed();
	}
	
	public HomePage login(String uname,String pwd){
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
		return new HomePage();
	}

}
