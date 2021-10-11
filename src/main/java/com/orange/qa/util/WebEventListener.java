package com.orange.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.orange.qa.base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener{

	public void beforeNavigateTo(String url,WebDriver driver){
		System.out.println("Before navigating to: '"+url+ "'");
	}
	public void afterNavigateTo(String url,WebDriver driver){
		System.out.println("Navigated to: '"+url+ "'");
	}
	public void beforeChangeValueOf(WebElement element,WebDriver driver){
		System.out.println("Value of the: "+element.toString()+ "before any changes made");
	}
	public void afterChangeValueOf(WebElement element,WebDriver driver){
		System.out.println("Element value changed to: "+element.toString());
	}
	public void beforeCickOn(WebElement element,WebDriver driver){
		System.out.println("Trying to click on: "+element.toString());
	}
	public void afterCickOn(WebElement element,WebDriver driver){
		System.out.println("Clicked on: "+element.toString());
	}
	public void beforeNavigateBack(WebDriver driver){
		System.out.println("Before Navigating back to the previous page");
	}
	public void afterNavigateBack(WebDriver driver){
		System.out.println("After Navigated back to the previous page");
	}
	public void beforeNavigateForward(WebDriver driver){
		System.out.println("Before Navigating forward to the next page");
	}
	public void afterNavigateForward(WebDriver driver){
		System.out.println("After Navigated forward to the next page");
	}
	public void onException(Throwable error,WebDriver driver){
		System.out.println("Exception occured: " +error);
		try {
			TestUtil.takeScreenshotAtEndOfTest();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void beforeFindBy(By by,WebElement element,WebDriver driver){
		System.out.println("Trying to find Element By :" +by.toString());
	}
	public void afterFindBy(By by,WebElement element,WebDriver driver){
		System.out.println("Found Element By :" +by.toString());
	}
	
	public void beforeScript(String script,WebDriver driver){
		
	}
	public void afterScript(String script,WebDriver driver){
		
	}
	public void beforeAlertAccept(WebDriver driver){
		
	}
	public void afterAlertAccept(WebDriver driver){
		
	}
	public void beforeAlertDismiss(WebDriver driver){
		
	}
	public void afterAlertDismiss(WebDriver driver){
		
	}
	public void beforeNavigateRefresh(WebDriver driver){
		
	}
	public void afterNavigateRefresh(WebDriver driver){
		
	}
	public void beforeChangeValueOf(WebElement element,WebDriver driver,CharSequence[] keysToSend){
		
	}
	public void afterChangeValueOf(WebElement element,WebDriver driver,CharSequence[] keysToSend){
		
	}
	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
}
