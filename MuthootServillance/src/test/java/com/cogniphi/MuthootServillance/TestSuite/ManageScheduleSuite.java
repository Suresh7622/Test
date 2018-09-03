package com.cogniphi.MuthootServillance.TestSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cogniphi.MuthootServillance.ERTPage;
import com.cogniphi.MuthootServillance.LogInPage;



import UTILITY.BaseClass;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class ManageScheduleSuite extends BaseClass{
	
  @Test
  public void TC001_verifyManageschedule() {
	  ERTPage.openManageSchedule();
	  
  }
  @Test
  public void TC002_verifyManageschedule() {
	 //ERTPage.verifyTheVehicles();
	   ERTPage.scheduleForAllERts();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  @BeforeClass
	public void beforeClass() throws ATUTestRecorderException {
		LogInPage.chrome_LogIn();
	}
  @AfterClass
	public void afterClass() {
		// BaseClass.closeBrowser();
	}
}
