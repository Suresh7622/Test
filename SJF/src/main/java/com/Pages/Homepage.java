package com.Pages;

import java.util.List;

import com.Page.Locators.HomePageLocators;
import com.SeleniumActions.SafeActions;

public class Homepage implements HomePageLocators{
	
	SafeActions sa = new SafeActions();
	static List<String> values; 
public void verifyHomePageMainmenuLinks() throws InterruptedException {
	
	values = sa.getAllElements("mainMenu", mainMenuLoc, 1000);
	System.out.println(values);
}

public void ClickOnHome() throws InterruptedException {
	sa.safeClick(Home);
}

}
