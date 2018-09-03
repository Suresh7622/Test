package com.Page.Locators;

import org.openqa.selenium.By;

public interface LogInLocators {
	//------------------------------------------------Locators-------------------------------------------------
	public static final By userName = By.id("username");
	public static final By password = By.id("password");
	public static final By logIn = By.name("submit");
	
	//-------------------------------------------------DATA-------------------------------------------------------
    public static final String userNameData = "ohead@krcr.com";
    public static final String passwordData = "krcrAdmin";
}
