package com.Page.Locators;

import org.openqa.selenium.By;

public interface ERTLocators {
	
	public static final By ERT = By.xpath("//span[contains(text(), 'ERT')]");
	public static final By BranchDashBoard = By.xpath("//*[contains(text(), 'Branch Dashboard')]");
	public static final By ERTSchedule = By.xpath("//span[contains(text(), 'ERT Schedule')]");
	public static final By BulkUpload = By.xpath("//span[contains(text(), 'Bulk Upload')]");
	public static final By ChooseFile = By.id("fileupload");
	public static final By Upload = By.xpath("//input[@id='btnUpload']");
	public static final By Save = By.id("saveSchedule");
	public static final By CheckIn = By.xpath("//input[@value='Check In']");
	public static final By selectTime = By.xpath("//*[@id='timeval']");
	public static final By popupCheckIn = By.id("btnCheck");
	public static final By popupCheckOut = By.id("btnCheck");
	public static final By CheckOut = By.xpath("//input[@value='Check Out']");
	public static final By Live = By.xpath("//span[contains(text(), 'Live')]");
	public static final By startBeat = By.xpath("//input[@value='Start Beat']");
	
	
	
	

	
	

	
	
	

}
