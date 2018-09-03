package com.cogniphi.MuthootServillance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import UTILITY.BaseClass;
import UTILITY.SafeActions;

public class HomePage extends BaseClass {

	public static SafeActions safeAction = new SafeActions(driver);

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	private static final Logger log = Logger.getLogger(HomePage.class.getName());
	SafeActions action = new SafeActions(driver);

	public static void verifyHomePageMainMenuLinks() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements(By.xpath(reader.get("mainMenu_xpath")));
		for (WebElement element : list) {
			if (element.isDisplayed()) {
				String text = element.getText();
				log.info("Main Menu Elements Are :" + text);
			}
		}
	}

	public static void verifyHomePageQuickLinks() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAttribute("class").equals("quickLinks")) {
				String text = list.get(i).getAttribute("title");
				log.info("Quick Link Elements Are :" + text);
			}
		}

	}

	public static void getERTSmmaryPage() {
		driver.findElement(By.xpath(reader.get("report_xpath"))).click();
		log.info("Clicked on REPORTS Menu");
		driver.findElement(By.xpath(reader.get("ertsummary_xpath"))).click();
		log.info("Clicked on ERT SUMMARY SubMenu");
		String text = driver.findElement(By.xpath(reader.get("ertsummarypageTitle"))).getText();
		Assert.assertEquals(text, "ERT Summary Report", "Does not Match");
		log.info("Page Title -" + text + "-Verified Successfully");
	}

	public static void navigateToAdministration() {
		driver.findElement(By.xpath(reader.get("administration_xpath"))).click();
	}

	public static void openERT_Tab() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reader.get("ert_xpath"))));
		// driver.findElement(By.xpath(reader.get("ert_xpath"))).click();
		safeAction.click_on_the_field((reader.get("ert_xpath")), "ERT Tab", 1000);
	}

	public static void fetchOfflinevehicleCount() {
		driver.findElement(By.xpath(reader.get("home_xpath"))).click();
	}

	public static void openBranchDashboard() {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reader.get("branchDashboard"))));
		// driver.findElement(By.xpath(reader.get("branchDashboard"))).click();
		safeAction.click_on_the_field((reader.get("branchDashboard")), "ERT Tab", 1000);
	}

	public static void navigateToHomePage() {

		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reader.get("branchDashboard"))));
		safeAction.click_on_the_field((reader.get("home_xpath")), "HOME Tab", 1000);

	}
	public static void navigateToERTPage() {

		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reader.get("ert_xpath"))));
		safeAction.click_on_the_field((reader.get("ert_xpath")), "ERT Tab", 1000);

	}

}
