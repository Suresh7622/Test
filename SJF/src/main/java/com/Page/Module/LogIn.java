package com.Page.Module;

import com.Pages.LogInPage;

public class LogIn {
	LogInPage logIn = new LogInPage();
	public void login() throws InterruptedException, Exception {
		logIn.logInToApplication();
	}
	
}
