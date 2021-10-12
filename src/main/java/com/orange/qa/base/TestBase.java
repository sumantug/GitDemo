package com.orange.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.orange.qa.util.TestUtil;
import com.orange.qa.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static JavascriptExecutor js;

	public TestBase(){
		 try {
			 prop= new Properties();
			 FileInputStream fis=new FileInputStream("C:\\Users\\sumantu\\workspace\\Test2\\src\\main\\"
					 +"java\\com\\orange\\qa\\config\\config.properties");
			 prop.load(fis);	 
		 }catch (FileNotFoundException e) {
			 e.printStackTrace();	 
			 }  
		 catch (IOException e) {
		 e.printStackTrace();
		 } 
	}
	public static void highlightElement(WebElement elem) {
		js = (JavascriptExecutor) driver;
		if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid yellow'",elem);
	        try {
	        	Thread.sleep(5000);
	        	((JavascriptExecutor)driver).executeScript("arguments[0].setattributes('style','')",elem);
	        }catch(Exception e) {
	        	e.printStackTrace();
	        }
		}	
		}
	
	public static void initialization(){
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sumantu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if (browserName.equals("IE")) {
			driver=new InternetExplorerDriver();
		}
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sumantu\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIMEOUT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		e_driver=new EventFiringWebDriver(driver);
		//Now create object of EventListenerHandler to register it with EventFiringWebDriver
		eventListener=new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;
		
	}

}
