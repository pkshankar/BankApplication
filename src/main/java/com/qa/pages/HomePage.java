package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.BaseTest;

public class HomePage extends BaseTest {

	long waitTime = 20;

	/* HOME PAGE LOCATORS */

	@FindBy(id = "bankName")
	WebElement bankName;

	@FindBy(id = "bankIFSC")
	WebElement bankIfsc;

	@FindBy(id = "bankAccountno")
	WebElement bankAccountno;

	@FindBy(id = "bankAccountHolder")
	WebElement bankAccountHolderName;

	@FindBy(xpath = "//button[text()='Submit KYC']")
	WebElement submitKycBtn;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	/* HOME PAGE USER ACTIONS */

	public boolean isBankNameInputBoxDisplayed() {

		explicitWait(waitTime, bankName);
		return bankName.isDisplayed();
	}

	public boolean isBankIfscInputBoxDisplayed() {

		explicitWait(waitTime, bankIfsc);
		return bankIfsc.isDisplayed();
	}

	public boolean isBankAccountNoInputBoxDisplayed() {

		explicitWait(waitTime, bankAccountno);
		return bankAccountno.isDisplayed();
	}

	public boolean isBankAccountHolderNameInputBoxDisplayed() {

		explicitWait(waitTime, bankAccountHolderName);
		return bankAccountHolderName.isDisplayed();
	}

	public boolean isSubmitKycBtnDisplayed() {

		explicitWait(waitTime, submitKycBtn);
		return submitKycBtn.isDisplayed();
	}

}
