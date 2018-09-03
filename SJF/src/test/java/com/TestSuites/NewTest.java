package com.TestSuites;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Page.Module.ERT;
import com.Page.Module.Home;
import com.Page.Module.LogIn;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class NewTest extends BaseClass {
	LogIn logIn = new LogIn();
	Home home = new Home();
	ERT ert = new ERT();

	@Test(groups = "sanity")
	public void TC_001_HomePage_verification() throws Exception {
		
		logIn.login();
		home.verifyMainMenuLinks();
	}
	@Test(groups = {"sanity", "Regression"})
	public void TC_002_verify_Schedule_Uploading() throws Exception {
		
		ert.naviagetToBulkUpload();
		ert.uploadScheduleFile();
		ert.savDetails();

	}

	@Test(groups = {"Regression"})
	public void TC_003_verifyCheckin_Checkout() throws Exception {
		ert.naviagteToBranchDashBoard();
		ert.verifyBranch();
	}
	

	@AfterTest
	public void afterTest() throws ATUTestRecorderException {
		
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  //driver.quit();
		 
	}

}
