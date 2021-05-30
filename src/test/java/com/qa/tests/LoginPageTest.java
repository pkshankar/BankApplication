package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest {

	LoginPage loginPage;

	@BeforeMethod
	public void setUp() {

		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void isUserNameInputBoxDisplayedTest() {

		Assert.assertTrue(loginPage.isUserNameInputBoxDisplayed());
	}

	@Test(priority = 2)
	public void isPasswordInputBoxDisplayedTest() {

		Assert.assertTrue(loginPage.isPasswordInputBoxDisplayed());
	}

	@Test(priority = 3)
	public void isCheckMeOutCheckboxDisplayedTest() {

		Assert.assertTrue(loginPage.isCheckMeOutCheckboxDisplayed());
	}

	@Test(priority = 4)
	public void isLoginbtnDisplayedTest() {

		Assert.assertTrue(loginPage.isLoginbtnDisplayed());
	}

	@Test(priority = 5)
	public void isLoginBtnDisabledUntilUserSelectsCheckboxTest() {

		Assert.assertFalse(loginPage.isLoginBtnDisabledUntilUserSelectsCheckbox());
	}

	@Test(priority = 6)
	public void isLoginBtnEnabledAfterUserSelectsCheckboxTest() {

		Assert.assertTrue(loginPage.isLoginBtnEnabledAfterUserSelectsCheckbox());
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
