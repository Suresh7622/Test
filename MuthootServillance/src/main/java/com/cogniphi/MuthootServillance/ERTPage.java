package com.cogniphi.MuthootServillance;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UTILITY.BaseClass;
import UTILITY.SafeActions;

public class ERTPage extends BaseClass {
	private static final Logger log = Logger.getLogger(ERTPage.class.getName());
	public static SafeActions safeAction = new SafeActions(driver);

	public static void uploadScheduleFile() throws InterruptedException {

		safeAction.implicitWait(100);
		safeAction.click_on_the_field(reader.get("ERTSchedule"), "ERTSchedule", 1000);
		log.info("Clicked on ERT Schedule");
		safeAction.driverWait(reader.get("BulkUpload"), 300);
		safeAction.click_on_the_field(reader.get("BulkUpload"), "BulkUpload", 1000);
		log.info("Clicked on Bulk Upload");
		safeAction.enter_text_in_texbox(reader.get("chooseFile"), reader.get("filePathFromDrive"), "ChooseFile");
		log.info("Selected File");
		Thread.sleep(3000);
		safeAction.driverWait(reader.get("uploadButton"), 300);

		safeAction.click_on_the_field(reader.get("uploadButton"), "uploadButton", 1000);
		log.info("Uploaded the File");
		driver.switchTo().alert().accept();

		log.info("Accepted the alert");

	}

	public static void clickOnSave() {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reader.get("selectSave"))));
		driver.findElement(By.xpath(reader.get("selectSave"))).click();
		log.info("Clicked on save");
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		log.info("Accepted the alert");
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		log.info("Accepted the 2nd alert");
	}

	public static void openBranchDashBoard() {

		safeAction.click_on_the_field(reader.get("live"), "LIVE LINK", 1000);
		log.info("Selected Live");
		driver.findElement(By.xpath(reader.get("branchDashBoard"))).click();
		log.info("Navigated to branch dashboard");
	}

	public static void openManageSchedule() {
		HomePage.navigateToERTPage();
		log.info("Clicked on ERT");
		safeAction.click_on_the_field(reader.get("ERTSchedule"), "ERTSchedule", 1000);
		log.info("Clicked on ERTSchedule");
		safeAction.click_on_the_field(reader.get("manageschedule"), "ManageSchedule", 1000);
		log.info("Clicked on ManageSchedule");
		//safeAction.getText(reader.get("title"));
		if(safeAction.getText(reader.get("title")).contains("Trip Schedule"))
			log.info("Page title successfully verified");
		else
			System.err.println("This is not the Trip Schedule page");
	}
	
	public static void verifyTheVehicles() {
		safeAction.getElementsFromDropdown(reader.get("vehicleFilter"), "vehicleFilter");
	}
	static List<String> erts;
	public static void scheduleForAllERts() {
		erts = new ArrayList<String>();
		int count = safeAction.getElementsFromDropdown(reader.get("vehicleFilter"), "selectByText").size();
		for (int i = 0; i < count; i++) {
			String text = safeAction.getElementsFromDropdown(reader.get("vehicleFilter"), "selectByText").get(i);
			erts.add(i, text);
		}
		for (int i = 0; i < erts.size(); i++) {
			safeAction.select_value_in_dropdownByText(reader.get("vehicleFilter"), erts.get(i), "selectByText");
			//safeAction.click_on_the_field(loc, elementName, timeout);
		}
		
	}

}
