package com.SeleniumActions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Base.BaseClass;

public class SafeActions extends BaseClass{
	
	private static final Logger log = Logger.getLogger(SafeActions.class.getName());
	
	public void safeClick(By locator, String WebElementName,int waitTime)
	{
		
		try
		{
				WebElement element = driver.findElement(locator);
				element.click();	
	                        element.sendKeys("welcome");
				log.info("Clicked on the  " + WebElementName);
		}
		catch(StaleElementReferenceException e)
		{
			Assert.fail(WebElementName + " is not attached to the page document - StaleElementReferenceException");
		}
		catch (NoSuchElementException e)
		{
			Assert.fail(WebElementName + " was not found in DOM in time - "+waitTime+" Seconds"+" - NoSuchElementException");
		}
		catch(Exception e)
		{
			Assert.fail(WebElementName + " was not found on the web page");
		}
	}
	
	public void safeClick(By locator) {
		
		driver.findElement(locator).click();
		
	}
	
	public void mouseClick(By locator) {
		Actions as = new Actions(driver);
		as.moveToElement(driver.findElement(locator)).build().perform();
		
	}
	
	
	public void pageLoadTimeOut(int timeOut) {
		driver.manage().timeouts().pageLoadTimeout(timeOut, TimeUnit.SECONDS);
	}

	public void safeType(By locator, String textData) throws InterruptedException {
		
		driver.findElement(locator).sendKeys(textData);
		
	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public void safeImplecitWait(int timeOut) {
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	}
	public void safeWebDriverWait(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	static List<String> values ; 
	public List<String> getAllElements(String elementName, By locator, int timeout) throws InterruptedException {
		Thread.sleep(timeout);
		values = new ArrayList<String>();
		List<WebElement> list = driver.findElements(locator);
		for(WebElement all : list) {
			values.add(all.getText());
		}
		return values;
	}
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void waitForAlert(int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
