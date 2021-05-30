package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.BaseTest;

public class LoginPage extends BaseTest {
	
	long waitTime = 20;
	
	/* LOGIN PAGE LOCATORS */
	
	@FindBy(id="formBasicUsername")
	WebElement username;
	
	@FindBy(id="formBasicPassword")
	WebElement password;
	
	@FindBy(id="formBasicCheckbox")
	WebElement checkMeOutCheckbox;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginBtn;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	/* LOGIN PAGE USER ACTIONS */
	
	public boolean isUserNameInputBoxDisplayed() {
		
		explicitWait(waitTime, username);
		return username.isDisplayed();
	}
	
	public boolean isPasswordInputBoxDisplayed() {
		
		explicitWait(waitTime, username);
		return password.isDisplayed();
	}
	
	public boolean isCheckMeOutCheckboxDisplayed() {
		
		explicitWait(waitTime, checkMeOutCheckbox);
		return checkMeOutCheckbox.isDisplayed();
	}
	
	public boolean isLoginbtnDisplayed() {
		
		explicitWait(waitTime, loginBtn);
		return loginBtn.isDisplayed();
	}
	
	public boolean isLoginBtnDisabledUntilUserSelectsCheckbox() {
		
		explicitWait(waitTime, loginBtn);
		return loginBtn.isEnabled();
	}
	
	public boolean isLoginBtnEnabledAfterUserSelectsCheckbox() {
		
		explicitWait(waitTime, checkMeOutCheckbox);
		checkMeOutCheckbox.click();
		return loginBtn.isEnabled();
	}
	
	public HomePage validUserNamePasswordLogin(String userName, String userPassword) {
		
		username.sendKeys(userName);
		password.sendKeys(userPassword);
		checkMeOutCheckbox.click();
		loginBtn.click();
		return new HomePage();
	}
	

}
