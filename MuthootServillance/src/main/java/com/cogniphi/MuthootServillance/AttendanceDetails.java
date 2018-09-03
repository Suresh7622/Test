package com.cogniphi.MuthootServillance;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import UTILITY.BaseClass;
import UTILITY.SafeActions;

public class AttendanceDetails extends BaseClass {
	// static WebDriver driver;
	private static final Logger log = Logger.getLogger(AttendanceDetails.class.getName());
	public static SafeActions safeAction = new SafeActions(driver);

	public static void open_Attendance_Details_Page() throws InterruptedException {

		safeAction.click_on_the_field(reader.get("attendanceDetails"), "AttendanceDeatails", 12000);
		log.info("Clicked on Attendance details");

	}

	public static void validate_Actual_with_expected() {
		String actual = safeAction.collectData(reader.get("title"), "elementName");
		Assert.assertEquals(actual, "Attendance Details");
		log.info("The Title verified successfully. So, this is Attendance details page.");

	}

	static void markPerson(String eRTName, int personOrder) {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		safeAction.markAsperERTAndPerson(eRTName, personOrder);
		log.info("Clicked on ERT " + eRTName + " Person " + personOrder +" Attendance field");
		safeAction.click_on_the_field(reader.get("confirm"), "ConfirmationButton", 1000);
		log.info("Clicked on Confirmation");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reader.get("ok"))));
		safeAction.click_on_the_field(reader.get("ok"), "SuccessAlert", 1000);
		log.info("accepted the alert");
		if (safeAction.checkCondition(eRTName, personOrder).equals(false)) {
			log.info("Manual Attendance is not working for ERT " + eRTName + " Person " + personOrder + "");
			Assert.fail("Mark Attendance is not working for ERT " + eRTName + " person " + personOrder);
		}
		/*
		 * else { log.info("Mark Attendance is not working for ERT"+eRTName+"person"+
		 * personOrder);
		 * Assert.fail("Mark Attendance is not working for ERT"+eRTName+"person"+
		 * personOrder); }
		 */
	} 
	public static void clearAsPerERTAndPerson(String string, int personNumber) {
		try {
			if (driver
					.findElement(By.xpath(reader.get("identifyPage") + string
							+ reader.get("identifyVehicle") + personNumber + reader.get("identifyPerson")))
					.getText().equals("Clear Attendance")) {
				driver.findElement(By.xpath(reader.get("identifyPage") + string
						+ reader.get("identifyVehicle") + personNumber + reader.get("identifyPerson"))).click();
				log.info("clicked on Clear Attendance for ERT " + string + " person " + personNumber);
				WebDriverWait wait = new WebDriverWait(driver, 300);
				safeAction.click_on_the_field(reader.get("confirm"), "ConfirmationButton", 1000);
				log.info("Clear confirmed");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reader.get("ok"))));
				safeAction.click_on_the_field(reader.get("ok"), "SuccessAlert", 1000);
				log.info("accepted the alert");
			} else {
				log.info("Clear Attendance is not available for ERT " + string + " person " + personNumber);
			}
		} catch (NoSuchElementException e) {
			log.info("Clear Attendance is not available for ERT " + string + "person " + personNumber);
		}
	}

	public static void mark8thERT_FirstPerson() {
		markPerson("08", 1);

	}

	public static void markSecondERT_FirstPerson() {
		markPerson("02", 1);

	}

	public static void markFourthERT_FirstPerson() {
		markPerson("04", 1);

	}

	public static void markFifthERT_FirstPerson() {
		markPerson("05", 1);

	}

	public static void markSeventhERT_FirstPerson() {
		markPerson("07", 1);

	}

	static void demarkPerson(String eRTName, int pesronOrder) {
		// safeAction.refreshThePage();

		clearAsPerERTAndPerson(eRTName, pesronOrder);
	}

	public static void unMark8thERT_FirstPerson() {

		demarkPerson("08", 1);

	}

	public static void unMarkSecondERT_FirstPerson() {
		demarkPerson("02", 1);

	}

	public static void unMarkFourthERT_FirstPerson() {
		demarkPerson("04", 1);

	}

	public static void unMarkFifthERT_FirstPerson() {
		demarkPerson("05", 1);

	}

	public static void unMarkSeventhERT_FirstPerson() {
		demarkPerson("07", 1);

	}

	public static void unMark_First_ERT_FirstPerson() {
		demarkPerson("03", 1);

	}

	public static void mark8thERT_SecondPerson() {
		markPerson("08", 2);

	}

	public static void markSecondERT_SecondPerson() {
		markPerson("02", 2);

	}

	public static void markFourthERT_SecondPerson() {
		markPerson("04", 2);

	}

	public static void markFifthERT_SecondPerson() {
		markPerson("05", 2);

	}

	public static void markSeventhERT_SecondPerson() {
		markPerson("07", 2);

	}

	public static void unMark8thERT_SecondPerson() {

		demarkPerson("08", 2);

	}

	public static void unMarkSecondERT_SecondPerson() {
		demarkPerson("02", 2);

	}

	public static void unMarkFourthERT_SecondPerson() {
		demarkPerson("04", 2);

	}

	public static void unMarkFifthERT_SecondPerson() {
		demarkPerson("05", 2);

	}

	public static void unMarkSeventhERT_SecondPerson() {
		demarkPerson("07", 2);

	}

	public static void unMark_First_ERT_SecondPerson() {
		demarkPerson("03", 2);

	}

	public static void mark8thERT_ThirdPerson() {
		markPerson("08", 3);

	}

	public static void markSecondERT_ThirdPerson() {
		markPerson("02", 3);

	}

	public static void markFourthERT_ThirdPerson() {
		markPerson("04", 3);

	}

	public static void markFifthERT_ThirdPerson() {
		markPerson("05", 3);

	}

	public static void markSeventhERT_ThirdPerson() {
		markPerson("07", 3);

	}

	public static void unMark8thERT_ThirdPerson() {
		demarkPerson("08", 3);

	}

	public static void unMarkSecondERT_ThirdPerson() {
		demarkPerson("02", 3);

	}

	public static void unMarkFourthERT_ThirdPerson() {
		demarkPerson("04", 3);

	}

	public static void unMarkFifthERT_ThirdPerson() {
		demarkPerson("05", 3);

	}

	public static void unMarkSeventhERT_ThirdPerson() {
		demarkPerson("07", 3);

	}

	public static void unMark_First_ERT_ThirdPerson() {
		demarkPerson("03", 3);

	}

	public static void scrollUp() {
		safeAction.scrollUp();
	}

	public static void select_Reason(String eRTName, int personOrder) {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		safeAction.markAsperERTAndPerson(eRTName, personOrder);
		log.info("Clicked on ERT " + eRTName + " Person " + personOrder + "Attendance field");
		safeAction.click_on_the_field(reader.get("confirm"), "ConfirmationButton", 1000);
		log.info("Confirm the alert");
		safeAction.select_value_in_dropdownByText(reader.get("reasondropdown"), "Device offline", "ReasonDropdown");
		log.info("Selected the Reason");
		safeAction.click_on_the_field(reader.get("submit"), "Submit Button", 1000);
		log.info("Clicked on Submit");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reader.get("ok"))));
		safeAction.click_on_the_field(reader.get("ok"), "SuccessAlert", 3000);
		log.info("accepted the alert");
		if (safeAction.checkCondition(eRTName, personOrder).equals(false)) {
			log.info("Manual Attendance is not working for ERT " + eRTName + " Person " + personOrder + "");
			Assert.fail("Mark Attendance is not working for ERT " + eRTName + " person " + personOrder);
		}
	}

	public static void mark_FirstERT_FirstPerson() {
		select_Reason("03", 1);
	}

	public static void mark_FirstERT_SecondPerson() {
		select_Reason("03", 2);
	}

	public static void mark_FirstERT_ThirdPerson() {
		select_Reason("03", 3);
	}

	public static String returnStatus(String eRTName) {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		String path = reader.get("vehicle_status_stHalf") + eRTName + reader.get("vehicle_status_ndHalf");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
		String text = safeAction.readData(path, "title");
		return text;
	}

	public static void select_Reason_For_Working_For_All(String eRTName, int personOrder) {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		safeAction.markAsperERTAndPerson(eRTName, personOrder);
		log.info("Clicked on ERT " + eRTName + " Person " + personOrder + "Attendance field");
		safeAction.click_on_the_field(reader.get("confirm"), "ConfirmationButton", 1000);
		log.info("Confirm the alert");
		safeAction.select_value_in_dropdownByText(reader.get("reasondropdown"), "Device offline", "selectByText");
		log.info("Selected the Reason");
		safeAction.click_on_the_field(reader.get("submit"), "Submit Button", 1000);
		log.info("Clicked on Submit");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reader.get("ok"))));
		safeAction.click_on_the_field(reader.get("ok"), "SuccessAlert", 3000);
		log.info("accepted the alert");

		if (safeAction.checkCondition(eRTName, personOrder).equals(false))
			log.info("Manual Attendance is not working for ERT " + eRTName + " Person " + personOrder + "");

		else
			log.info("Manual Attendance registered for ERT " + eRTName + " Person " + personOrder + "");

	}

	static void markPerson_For_All_erts(String eRTName, int personOrder) {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		safeAction.markAsperERTAndPerson(eRTName, personOrder);
		log.info("Clicked on ERT " + eRTName + " Person " + personOrder + "Attendance field");
		safeAction.click_on_the_field(reader.get("confirm"), "ConfirmationButton", 2000);
		log.info("Clicked on Confirmation");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reader.get("ok"))));
		safeAction.click_on_the_field(reader.get("ok"), "SuccessAlert", 1000);
		log.info("accepted the alert");
		if (safeAction.checkCondition(eRTName, personOrder).equals(false))
			log.info("Manual Attendance is not working for ERT " + eRTName + " Person " + personOrder + "");

		else
			log.info("Manual Attendance registered for ERT " + eRTName + " Person " + personOrder + "");

	}

	static List<String> ertId = new ArrayList<String>();

	public static void markAttendanceForAllGuard() throws InterruptedException {
		ertId.addAll(safeAction.getStatusOfEachVehicle());
		// System.out.println(ertId.size());
		for (int i = 0; i < ertId.size(); i++) {
			if (ertId.get(i).equals("06"))
				((JavascriptExecutor) driver).executeScript("window.scrollBy(50,150)");

			/*if (ertId.get(i).equals("15")) {
				safeAction.refreshThePage();
				((JavascriptExecutor) driver).executeScript("window.scrollBy(500,1000)");
			}*/
			/*
			 * else if(ertId.get(i).equals("10")) { ((JavascriptExecutor)
			 * driver).executeScript("window.scrollBy(250,500)"); } else { continue; }
			 */
			if (returnStatus(ertId.get(i)).equals("Working")) {
				for (int j = 1; j < 4; j++) {

					select_Reason_For_Working_For_All(ertId.get(i), j);
					
				}

			} else {
				for (int j = 1; j < 4; j++) {

					markPerson_For_All_erts(ertId.get(i), j);
				}

			}
			// System.out.println("ERT " + ertId.get(i));
			// returnStatus(ertId.get(i));

		}
		// System.out.println(safeAction.getStatusOfEachVehicle().size());
	}

}
