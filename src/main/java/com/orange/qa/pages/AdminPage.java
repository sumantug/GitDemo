package com.orange.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.orange.qa.base.TestBase;



public class AdminPage extends TestBase{

	
	@FindBy(xpath="//div/h1[contains(text(),'System Users')]")
	WebElement systemusersLabel;
	
	//@FindBy(xpath="//a[text()='deepa']//ancestor::table")
	//WebElement usersLabel;
	
	@FindBy(id="btnAdd")
	WebElement addUsersButton;
	
	@FindBy(xpath="//div/h1[text()='Add User']")
	WebElement addUserLabel;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement employeeName;
	
	@FindBy(id="systemUser_userName")
	WebElement userName;
	
	@FindBy(id="systemUser_status")
	WebElement status;
	
	@FindBy(id="systemUser_password")
	WebElement password;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id="btnSave")
	WebElement saveButton;
	
	public AdminPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifySystemUsersLabel(){
		return systemusersLabel.isDisplayed();
	}
	
	
	public void selectUserByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//preceding::td[1]/input[@type='checkbox']")).click();
		
	}
	
	public boolean verifyNewUsers(){
		addUsersButton.click();
		return addUserLabel.isDisplayed();
		
	}
	
	
	
	
	public void createNewUser(String userType,String empName,String uname,String statusVal,String pwd){
		Select select=new Select(driver.findElement(By.xpath("//*[@id='systemUser_userType']")));
		select.selectByVisibleText(userType);
		employeeName.sendKeys(empName);
		userName.sendKeys(uname);
		Select sel=new Select(status);
		sel.selectByVisibleText(statusVal);
		password.sendKeys(pwd);
		confirmPassword.sendKeys(pwd);
		saveButton.click();
	}
	
	
	
	
	
	
	
	
	
}
