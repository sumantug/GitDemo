package com.orange.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.qa.base.TestBase;
import com.orange.qa.pages.AdminPage;
import com.orange.qa.pages.DashboardPage;
import com.orange.qa.pages.DirectoryPage;
import com.orange.qa.pages.HomePage;
import com.orange.qa.pages.LeavePage;
import com.orange.qa.pages.LoginPage;
import com.orange.qa.pages.MaintenancePage;
import com.orange.qa.pages.MyInfoPage;
import com.orange.qa.pages.PIMPage;
import com.orange.qa.pages.PerformancePage;
import com.orange.qa.pages.RecruitmentPage;
import com.orange.qa.pages.TimePage;

public class MaintenancePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MaintenancePage maintenancePage;

	MaintenancePageTest() throws IOException{
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		maintenancePage=homePage.clickOnMaintenanceLink();
	}
	
	@Test
	public void checkMaintenancePage() throws InterruptedException {
		
		maintenancePage.checkDisplayPurgeEmployeeRecord();
		maintenancePage.checkDisplaybuttonVerify();
		maintenancePage.checkinputConfirmPassword();
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
