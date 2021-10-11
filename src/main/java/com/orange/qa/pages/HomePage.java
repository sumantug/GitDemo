package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'sumantu')]")
	WebElement usernameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logoutLink;
	
	@FindBy(xpath="//a/b[contains(text(),'Admin')]")
	WebElement adminLink;
	
	@FindBy(xpath="//a/b[contains(text(),'PIM')]")
	WebElement pimLink;
	
	@FindBy(xpath="//a/b[contains(text(),'Leave')]")
	WebElement leaveLink;
	
	@FindBy(xpath="//a/b[contains(text(),'Time')]")
	WebElement timeLink;
	
	@FindBy(xpath="//a/b[contains(text(),'Recruitment')]")
	WebElement recruitmentLink;
	
	@FindBy(xpath="//a/b[contains(text(),'My Info')]")
	WebElement myinfoLink;
	
	@FindBy(xpath="//a/b[contains(text(),'Performance')]")
	WebElement performanceLink;
	
	@FindBy(xpath="//a/b[contains(text(),'Dashboard')]")
	WebElement dashboardLink;
	
	@FindBy(xpath="//a/b[contains(text(),'Directory')]")
	WebElement directoryLink;
	
	@FindBy(xpath="//a/b[contains(text(),'Maintenance')]")
	WebElement maintenanceLink;
	
	//Initializing the Page Object
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
		
	public boolean verifyCorrectUserName(){
		return usernameLabel.isDisplayed();
	}
	
	public boolean verifyUserNameLink(){
		return usernameLabel.isEnabled();
	}
	
	public boolean verifyLogOutLink(){
		usernameLabel.click();
		return logoutLink.isEnabled();
	}
	public boolean verifyLogOutField(){
		usernameLabel.click();
		return logoutLink.isDisplayed();
	}
	
	public void clickOnLogOutLink(){
		usernameLabel.click();
		logoutLink.click();
		
	}
	
	public AdminPage clickOnAdminLink(){
		adminLink.click();
		return new AdminPage();
	}
	
	
	public PIMPage clickOnPIMLink(){
		pimLink.click();
		return new PIMPage();
	}
	
	public LeavePage clickOnLeaveLink(){
		leaveLink.click();
		return new LeavePage();
	}
	
	public TimePage clickOnTimeLink(){
		timeLink.click();
		return new TimePage();
	}
	public RecruitmentPage clickOnRecruitmentLink(){
		recruitmentLink.click();
		return new RecruitmentPage();
	}
	public MyInfoPage clickOnMyInfoLink(){
		myinfoLink.click();
		return new MyInfoPage();
	}
	public PerformancePage clickOnPerformanceLink(){
		performanceLink.click();
		return new PerformancePage();
	}
	public DashboardPage clickOnDashboardLink(){
		dashboardLink.click();
		return new DashboardPage();
	}
	public DirectoryPage clickOnDirectoryLink(){
		directoryLink.click();
		return new DirectoryPage();
	}
	public MaintenancePage clickOnMaintenanceLink(){
		maintenanceLink.click();
		return new MaintenancePage();
	}
		

}
