package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends BaseTest {

	LoginPage loginPage;
	String username = "admin";
	String password = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InN1cnlhQHNraWxsZW56YS5jb20iLCJpYXQiOjE2MTEzMTc2Njh9.HVMcJZZJh8_EAhB_mcSeGLfZZarE5ZgnEgbbAxSu99g";
	HomePage homePage;

	@BeforeMethod
	public void setup() {

		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.validUserNamePasswordLogin(username, password);

	}

	@Test(priority = 1)
	public void isBankNameInputBoxDisplayedTest() {

		Assert.assertTrue(homePage.isBankNameInputBoxDisplayed());
	}

	@Test(priority = 2)
	public void isBankIfscInputBoxDisplayedTest() {

		Assert.assertTrue(homePage.isBankIfscInputBoxDisplayed());
	}

	@Test(priority = 3)
	public void isBankAccountNoInputBoxDisplayedTest() {

		Assert.assertTrue(homePage.isBankAccountNoInputBoxDisplayed());
	}

	@Test(priority = 4)
	public void isBankAccountHolderNameInputBoxDisplayedTest() {

		Assert.assertTrue(homePage.isBankAccountHolderNameInputBoxDisplayed());
	}

	@Test(priority = 5)
	public void isSubmitKycBtnDisplayedTest() {

		Assert.assertTrue(homePage.isSubmitKycBtnDisplayed());
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
