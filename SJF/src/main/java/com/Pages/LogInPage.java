package com.Pages;

import com.Base.BaseClass;
import com.Page.Locators.LogInLocators;
import com.SeleniumActions.SafeActions;

public class LogInPage implements LogInLocators{
	
	SafeActions sa = new SafeActions();
	public void logInToApplication() throws InterruptedException, Exception {
		
		BaseClass.beforeTest("chrome");
		sa.safeType(userName, userNameData);
		sa.safeType(password, passwordData);
		sa.safeClick(logIn);
		sa.maximize();
		sa.pageLoadTimeOut(300);
		
	}
}
