package com.orange.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
import com.orange.qa.util.TestUtil;

public class AdminPageTest extends TestBase{
 
	LoginPage loginPage;
	HomePage homePage;
	AdminPage adminPage;
	String sheetName="Users";
	AdminPageTest() throws IOException{
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage=new LoginPage();
		adminPage=new AdminPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		adminPage=homePage.clickOnAdminLink();
	}
	
	@Test(priority=1)
	public void verifyAdminPageLabel(){
		Assert.assertTrue(adminPage.verifySystemUsersLabel(), "System Users label is missing");
	}
	
	@Test(priority=2)
	public void selectSingleUserTest(){
		adminPage.selectUserByName("deepa");
	}
	
	@Test(priority=3)
	public void selectMultipleUserTest(){
		adminPage.selectUserByName("deepa");
		adminPage.selectUserByName("Vibha");
	}
	
	@DataProvider
	public Object[][] getUsersTestData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	/*
	 * @Test(priority=3,dataProvider="getUsersTestData") public void
	 * validateCreateNewUser(String userType,String empName,String uname,String
	 * statusVal,String pwd){ Assert.assertTrue(adminPage.verifyNewUsers()
	 * ,"Add new users is not working correctly");
	 * //adminPage.createNewUser("Admin","Vibha galgali","Vibha","Enabled",
	 * "VibhaDeepa2019$"); adminPage.createNewUser(userType, empName, uname,
	 * statusVal, pwd);
	 
	}*/
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	
	
}
