package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;

public class DashboardPage extends TestBase{

	@FindBy(xpath="//div/h1[contains(text(),'Dashboard')]")
		WebElement dashboardLabel;
	
	@FindBy(xpath="//div[@class=\"quickLaunge\"]/a/span[text()='My Timesheet']")
	WebElement  myTimesheet;
	
	@FindBy(xpath="//div[@class=\"quickLaunge\"]/a/span[text()='My Leave']")
	WebElement  myLeave;
	
	@FindBy(xpath="//div[@class=\"quickLaunge\"]/a/span[text()='Apply Leave']")
	WebElement  applyLeave;
	
	@FindBy(xpath="//div[@class=\"quickLaunge\"]/a/span[text()='Timesheets']")
	WebElement  timeSheets;
	
	@FindBy(xpath="//div[@class=\"quickLaunge\"]/a/span[text()='Leave List']")
	WebElement  leaveList;
	
	@FindBy(xpath="//div[@class=\"quickLaunge\"]/a/span[text()='Assign Leave']")
	WebElement  assignLeave;
	
	public boolean verifydashboardLabel(){
		return dashboardLabel.isDisplayed();
		
	}
	
	public DashboardPage(){
		PageFactory.initElements(driver, this);
	}
	
}
