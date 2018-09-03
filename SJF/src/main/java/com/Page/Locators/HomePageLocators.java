package com.Page.Locators;

import org.openqa.selenium.By;

public interface HomePageLocators {
	
	public static final By mainMenuLoc = By.xpath("//div/a/span");
	
	public static final By AttendanceDetails = By.xpath("//span[contains(text(), 'Attendance Details')]");
	public static final By Home = By.xpath("//span[contains(text(), 'Home')]");

}
