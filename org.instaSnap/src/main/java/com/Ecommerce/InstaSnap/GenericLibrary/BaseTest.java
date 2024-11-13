package com.Ecommerce.InstaSnap.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	@BeforeClass
	public void BrowserSetup() {
		Reporter.log("Browser Launched Succesfully", true);
	}

	@BeforeMethod
	public void login() {
		Reporter.log("Login Successful", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Log out Successful", true);
	}

	@AfterClass
	public void TerminateBrowser() {
		Reporter.log("Browser Closed Succesfully", true);
	}
}
