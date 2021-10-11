package com.orange.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.qa.base.TestBase;
import com.orange.qa.pages.HomePage;
import com.orange.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	LoginPageTest() throws IOException{
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage=new LoginPage();
	}
	@Test(priority=1)
	public void loginpageTitleTest(){
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='divLogo']/img"))));		
				
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"OrangeHRM");
	}
	
	@Test(priority=2)
	public void hrmLogoImageTest(){
		boolean actual=loginPage.validateHRMImage();
		Assert.assertTrue(actual);
	}
	
	@Test(priority=3)
	public void loginTest(){
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
