package com.cogniphi.MuthootServillance.TestSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cogniphi.MuthootServillance.AttendanceDetails;
import com.cogniphi.MuthootServillance.LogInPage;

import UTILITY.BaseClass;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class AttendanceSuite extends BaseClass {

	@Test(groups = { "Sanity", "Regression" })
	public void TC_001_verify_Attendance_DetailsPage() throws InterruptedException {
		AttendanceDetails.open_Attendance_Details_Page();
		AttendanceDetails.validate_Actual_with_expected();

	}

	/*@Test(groups = "Sanity")
	public void TC_002_verify_Attendance_For_Substitute_Vehicle_1stGuard() throws InterruptedException {
		AttendanceDetails.mark8thERT_FirstPerson();
	}

	@Test(groups = "Sanity")
	public void TC_003_verify_Attendance_For_Substitute_Vehicle_2ndGuard() throws InterruptedException {
		AttendanceDetails.mark8thERT_SecondPerson();
	}

	@Test(groups = "Sanity")
	public void TC_004_verify_Attendance_For_Substitute_Vehicle_3rdGuard() throws InterruptedException {
		AttendanceDetails.mark8thERT_ThirdPerson();
	}

	@Test(groups = "Sanity")
	public void TC_005_unMarkAttendanceFor_Substitute_Vehicle_For_AllGuards() throws InterruptedException {
		AttendanceDetails.unMark8thERT_FirstPerson();
		AttendanceDetails.unMark8thERT_SecondPerson();
		AttendanceDetails.unMark8thERT_ThirdPerson();
	}

	@Test(groups = "Sanity")
	public void TC_006_verify_Attendance_For_Breakdown_Vehicle_1stGuard() throws InterruptedException {
		AttendanceDetails.markSeventhERT_FirstPerson();
	}

	@Test(groups = "Sanity")
	public void TC_007_verify_Attendance_For_Breakdown_Vehicle_2ndGuard() throws InterruptedException {
		AttendanceDetails.markSeventhERT_SecondPerson();
	}

	@Test(groups = "Sanity")
	public void TC_008_verify_Attendance_For_Breakdown_Vehicle_3rdGuard() throws InterruptedException {
		AttendanceDetails.markSeventhERT_ThirdPerson();
	}

	@Test(groups = "Sanity")
	public void TC_009_unMarkAttendanceFor_BreakDown_Vehicle_For_Allguards() throws InterruptedException {
		AttendanceDetails.unMarkSeventhERT_FirstPerson();
		AttendanceDetails.unMarkSeventhERT_SecondPerson();
		AttendanceDetails.unMarkSeventhERT_ThirdPerson();
	}

	@Test(groups = "Sanity")
	public void TC_010_verify_Attendance_For_Service_Vehicle_1stGuard() throws InterruptedException {
		AttendanceDetails.scrollUp();
		AttendanceDetails.markSecondERT_FirstPerson();
	}

	@Test(groups = "Sanity")
	public void TC_011_verify_Attendance_For_Service_Vehicle_2ndGuard() throws InterruptedException {

		AttendanceDetails.markSecondERT_SecondPerson();
	}

	@Test(groups = "Sanity")
	public void TC_012_verify_Attendance_For_Service_Vehicle_3rdGuard() throws InterruptedException {

		AttendanceDetails.markSecondERT_ThirdPerson();
	}

	@Test(groups = "Sanity")
	public void TC_013_unMarkAttendanceFor_Service_Vehicle_For_AllGuards() throws InterruptedException {
		AttendanceDetails.unMarkSecondERT_FirstPerson();
		AttendanceDetails.unMarkSecondERT_SecondPerson();
		AttendanceDetails.unMarkSecondERT_ThirdPerson();
	}

	@Test(groups = "Sanity")
	public void TC_014_verify_Attendance_For_DeviceNotFixed_Vehicle_1stGuard() throws InterruptedException {
		AttendanceDetails.markFourthERT_FirstPerson();
	}

	@Test(groups = "Sanity")
	public void TC_015_verify_Attendance_For_DeviceNotFixed_Vehicle_2ndGuard() throws InterruptedException {
		AttendanceDetails.markFourthERT_SecondPerson();
	}

	@Test(groups = "Sanity")
	public void TC_016_verify_Attendance_For_DeviceNotFixed_Vehicle_3rdGuard() throws InterruptedException {
		AttendanceDetails.markFourthERT_ThirdPerson();
	}

	@Test(groups = "Sanity")
	public void TC_017_unMarkAttendanceFor_DeviceNotFixed_Vehicle_For_AllGuards() throws InterruptedException {
		AttendanceDetails.unMarkFourthERT_FirstPerson();
		AttendanceDetails.unMarkFourthERT_SecondPerson();
		AttendanceDetails.unMarkFourthERT_ThirdPerson();
	}

	@Test(groups = "Sanity")
	public void TC_018_verify_Attendance_For_Accident_Vehicle_1stGuard() throws InterruptedException {
		AttendanceDetails.markFifthERT_FirstPerson();
	}

	@Test(groups = "Sanity")
	public void TC_019_verify_Attendance_For_Accident_Vehicle_2ndGuard() throws InterruptedException {
		AttendanceDetails.markFifthERT_SecondPerson();
	}

	@Test(groups = "Sanity")
	public void TC_020_verify_Attendance_For_Accident_Vehicle_3rdGuard() throws InterruptedException {
		AttendanceDetails.markFifthERT_ThirdPerson();
	}

	@Test(groups = "Sanity")
	public void TC_021_unMarkAttendanceFor_Accident_Vehicle_For_AllGuards() throws InterruptedException {
		AttendanceDetails.unMarkFifthERT_FirstPerson();
		AttendanceDetails.unMarkFifthERT_SecondPerson();
		AttendanceDetails.unMarkFifthERT_ThirdPerson();
	}

	@Test(groups = "Sanity")
	public void TC_022_verify_Attendance_For_DeviceOffline_Vehicle_1stGuard() throws InterruptedException {
		AttendanceDetails.mark_FirstERT_FirstPerson();
	}

	@Test(groups = "Sanity")
	public void TC_023_verify_Attendance_For_DeviceOffline_Vehicle_2ndGuard() throws InterruptedException {
		AttendanceDetails.mark_FirstERT_SecondPerson();

	}

	@Test(groups = "Sanity")
	public void TC_024_verify_Attendance_For_DeviceOffline_Vehicle_3rdGuard() throws InterruptedException {
		AttendanceDetails.mark_FirstERT_ThirdPerson();
	}

	@Test(groups = "Sanity")
	public void TC_025_unMarkAttendanceFor_Working_Vehicle_Device_Offline_For_AllGuards() throws InterruptedException {

		AttendanceDetails.unMark_First_ERT_FirstPerson();
		AttendanceDetails.unMark_First_ERT_SecondPerson();
		AttendanceDetails.unMark_First_ERT_ThirdPerson();
	}
*/
	@Test(groups = "Regression")
	public void TC_0026_status() throws InterruptedException {

		AttendanceDetails.markAttendanceForAllGuard();
	}

	/*
	 * @Test(enabled = false) public void TC_003_schedule_Branches_To_ERTs() throws
	 * InterruptedException {
	 * 
	 * HomePage.openERT_Tab(); ERTPage.uploadScheduleFile(); ERTPage.clickOnSave();
	 * }
	 */

	@BeforeClass
	public void beforeClass() throws ATUTestRecorderException {
		LogInPage.chrome_LogIn();
	}

	@AfterClass
	public void afterClass() {
		// BaseClass.closeBrowser();
	}
}
