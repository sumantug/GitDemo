package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;

public class MaintenancePage extends TestBase{
	public MaintenancePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//*[text()='Purge Employee Records']")
	private WebElement headingPurgeEmployeeRecord;
	
	@FindBy(xpath="//input[@id='confirm_password']")
	private WebElement inputConfirmPassword;
	
	@FindBy(xpath=".//input[@value='Verify']")
	private WebElement buttonVerify;
	
	public void checkDisplayPurgeEmployeeRecord() {
		System.out.println("Heading PurgeEmployeeRecord is displayed:"+headingPurgeEmployeeRecord.isDisplayed());
		highlightElement(headingPurgeEmployeeRecord);
		
	}
	public void checkDisplaybuttonVerify() {
		System.out.println("Verify button is displayed:"+buttonVerify.isDisplayed());
		System.out.println("Verify button is enabled:"+buttonVerify.isEnabled());
		highlightElement(buttonVerify);
	}
	public void checkinputConfirmPassword() {
		System.out.println("Verify button is enabled:"+inputConfirmPassword.isEnabled());
		inputConfirmPassword.click();
		highlightElement(inputConfirmPassword);
	}
}
