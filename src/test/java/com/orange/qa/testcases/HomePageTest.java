package com.orange.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
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

//press Ctrl+Shift+o when we want to import TestBase class

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	AdminPage adminPage;
	DashboardPage dashboardPage;
	DirectoryPage directoryPage;
	LeavePage leavePage;
	MaintenancePage maintenancePage;
	MyInfoPage myinfoPage;
	PerformancePage performancePage;
	PIMPage pimPage;
	RecruitmentPage recruitmantPage;
	TimePage timePage;
	
	HomePageTest() throws IOException{
		super();
	}
	
	//test cases should be separated --independent of each other
	//Before each test cases --launch the browser and login
	//@test--execute test case
	//After each test cases --close the browser
	
	@BeforeMethod
	public void setUp(){
		initialization();
		adminPage=new AdminPage();
		dashboardPage=new DashboardPage();
		directoryPage=new DirectoryPage();
		leavePage=new LeavePage();
		maintenancePage=new MaintenancePage();
		myinfoPage=new MyInfoPage();
		performancePage=new PerformancePage();
		pimPage=new PIMPage() ;
		recruitmantPage=new RecruitmentPage();
		timePage=new TimePage();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=-1)
	public void verifyLinksTest() throws InterruptedException {
		adminPage=homePage.clickOnAdminLink();
		Thread.sleep(10000);
		directoryPage=homePage.clickOnDirectoryLink();
		Thread.sleep(10000);
		leavePage=homePage.clickOnLeaveLink();
		maintenancePage=homePage.clickOnMaintenanceLink();
		myinfoPage=homePage.clickOnMyInfoLink();
		performancePage=homePage.clickOnPerformanceLink();
		pimPage=homePage.clickOnPIMLink();
		recruitmantPage=homePage.clickOnRecruitmentLink();
		timePage=homePage.clickOnTimeLink();
		timePage.timestartingDaysValues();
		Thread.sleep(10000);
		
	}
	
	@Test(priority=1)
	public void verifyUserNameTest(){
		Assert.assertTrue(homePage.verifyCorrectUserName(),"User field is displayed");
		Assert.assertTrue(homePage.verifyUserNameLink(),"User field link is enabled");
	}
	
	@Test(priority=2)
	public void verifyUserLogOutTest(){
		
		Assert.assertTrue(homePage.verifyLogOutLink(),"Log Out Link is enabled");
	}
	
	@Test(priority=3)
	public void verifyAdminLinkTest(){
		adminPage=homePage.clickOnAdminLink();
		
	}
	/*@Test(priority=3)
	public void verifyDashboardLinkTest(){
		dashboardPage=homePage.clickOnDashboardLink();
		
	}
	@Test(priority=3)
	public void verifyDirectoryLinkTest(){
		directoryPage=homePage.clickOnDirectoryLink();
		
	}
	@Test(priority=3)
	public void verifyLeaveLinkTest(){
		leavePage=homePage.clickOnLeaveLink();
		
	}
	@Test(priority=3)
	public void verifyMaintenanceLinkTest(){
		maintenancePage=homePage.clickOnMaintenanceLink();
		
	}
	@Test(priority=3)
	public void verifyMyInfoLinkTest(){
		myinfoPage=homePage.clickOnMyInfoLink();
		
	}
	@Test(priority=3)
	public void verifyPerformanceLinkTest(){
		performancePage=homePage.clickOnPerformanceLink();
		
	}
	@Test(priority=3)
	public void verifyPIMLinkTest(){
		pimPage=homePage.clickOnPIMLink();
		
	}
	@Test(priority=3)
	public void verifyRecruitmentLinkTest(){
		recruitmantPage=homePage.clickOnRecruitmentLink();
		
	}
	@Test(priority=3)
	public void verifyTimeLinkTest(){
		timePage=homePage.clickOnTimeLink();
		
	}*/
	
	
	
	
	@Test(priority=4)
	public void verifyUserLogOut(){
		homePage.clickOnLogOutLink();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	
}
