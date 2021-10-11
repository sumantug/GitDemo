package com.orange.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.orange.qa.base.TestBase;

public class TimePage extends TestBase{
	public static Select select;

	@FindBy(xpath="//select[@id='time_startingDays']")
	public WebElement startingDaysList;
	
	
	public void timestartingDaysValues() {
		startingDaysList.click();
		startingDaysList.findElement(By.xpath("//[text()='Monday']")).click();
		
		
	}
}
