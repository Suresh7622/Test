package com.Page.Module;

import com.Pages.ERTPage;

public class ERT {
	
	ERTPage ert = new ERTPage();
	
	public void naviagetToBulkUpload() throws Exception {
		
		ert.clickOnERT();
		ert.clickOnERTSchedule();
		ert.clickOnBulkUpload();
	}
	
	public void uploadScheduleFile() throws Exception {
		
		ert.selectScheduleFile();
		ert.clickOnUploadButton();
		ert.acceptAlert();
	}
	
	public void savDetails() throws Exception {
		
		ert.clickOnSave();
		ert.acceptAlert();
		ert.waitUntilAlertPresent();
		ert.acceptAlert();
	}
	
	public void naviagteToBranchDashBoard() throws Exception {
		
		ert.clickOnLive();
		ert.clickOnBranchDashBoard();
	}
	
	public void verifyBranch() throws Exception {
		
		ert.clickOnCheck();
		ert.selectTimeTocheckIn();
		ert.clickOnPopupCheckin();
		ert.waitUntilAlertPresent();
		ert.acceptAlert();
		ert.clickOnCheckOut();
		ert.selectTimeToCheckout();
		ert.clickOnPopupCheckOut();
		ert.waitUntilAlertPresent();
		ert.acceptAlert();
		
	}
	  

}
