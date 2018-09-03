package com.Pages;

import java.awt.Robot;import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.interactions.Actions;

import com.Page.Locators.ERTLocators;
import com.SeleniumActions.SafeActions;

public class ERTPage implements ERTLocators{
	SafeActions sa = new SafeActions();
	
	public void clickOnERT() throws InterruptedException {
		sa.safeClick(ERT);
	}
	
	public void clickOnBulkUpload() throws InterruptedException {
		
		sa.safeWebDriverWait(BulkUpload, 120);
		sa.safeClick(BulkUpload);
	}
	
	public void clickOnERTSchedule() throws Exception {
		
		sa.safeClick(ERTSchedule);
	}
	
	public void selectScheduleFile() throws InterruptedException {
		sa.pageLoadTimeOut(120);
		String path = "ert 03 kch.xlsx";
		sa.safeType(ChooseFile, path);
	}
	
	public void clickOnEnter() throws Exception {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void clickOnUploadButton() throws InterruptedException {
		Thread.sleep(15000);
		sa.safeClick(Upload);
	}
	
	public void acceptAlert() {
		sa.acceptAlert();
	}
	
	public void clickOnSave() throws InterruptedException {
		sa.safeWebDriverWait(Save, 100);
		sa.safeClick(Save );
		sa.pageLoadTimeOut(180);
	}
	
	public void clickOnBranchDashBoard() throws Exception {
		sa.safeWebDriverWait(BranchDashBoard, 100);
		sa.safeClick(BranchDashBoard);
	}
	
	public void clickOnStartbeat() throws InterruptedException {
		sa.safeClick(startBeat);
	}
	public void clickOnLive() throws Exception {
		Thread.sleep(15000);
		sa.mouseClick(Live);
		sa.safeClick(Live);
	}
	
	public void clickOnCheck() throws Exception {
		sa.safeWebDriverWait(CheckIn, 300);
		sa.safeClick(CheckIn);
	}
	public static String sameHour() {
		String DayBefore = "";
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.HOUR, 1);
		Date before = cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("hh");
		DayBefore = formatter.format(before);
		return DayBefore;
	}
	
	public static String minutes(int minutes) {
		String DayBefore = "";
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, minutes);
		Date before = cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("mm");
		DayBefore = formatter.format(before);
		return DayBefore;
	}
	public void selectTimeTocheckIn() throws Exception {
		sa.safeWebDriverWait(selectTime, 100);
		sa.safeType(selectTime, sameHour());
		sa.safeType(selectTime, minutes(10));
		sa.safeType(selectTime, "PM");
	}
	
	public void selectTimeToCheckout() throws Exception {
		sa.safeWebDriverWait(selectTime, 100);
		sa.safeType(selectTime, sameHour());
		sa.safeType(selectTime, minutes(10));
		sa.safeType(selectTime, "PM");
	}
	
	public void clickOnPopupCheckin() throws Exception {
		sa.safeWebDriverWait(popupCheckIn, 100);
		sa.safeClick( popupCheckIn);
		Thread.sleep(10000);
	}
	public void clickOnPopupCheckOut() throws Exception {
		sa.safeWebDriverWait(popupCheckOut, 100);
		sa.safeClick(popupCheckOut);
	}
	public void clickOnCheckOut() throws Exception {
		sa.safeClick(CheckOut);
	}
	
	public void waitUntilAlertPresent() {
		sa.waitForAlert(120);
	}
	

}
