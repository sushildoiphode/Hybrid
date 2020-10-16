package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ijmeet.keywords.FEKeywords;

public class SignUpPage {
	@FindBy(css= "input#name")
	private WebElement fullName;
	@FindBy(xpath = "//button[text()='  Sign Up ']")
	private WebElement signUpBtn;
	@FindBy(css = "div.recaptcha-checkbox-border")
	private WebElement captcha;
	@FindBy(css = "label#company_name-error-server")
	private WebElement companyNameError;
	
	/*
	 * //Constructor public SignUpPage(){
	 * PageFactory.initElements(FEKeywords.driver, this); }
	 */
	
	public void enterFirstName(String firstName) {
		fullName.sendKeys(firstName);
	}
	public void clickOnCaptcha() {
		captcha.click();
	}
	public void clickOnSignupButton() {
		signUpBtn.click();
	}
	public boolean isEnterCompanyNameVisible() {
		return companyNameError.isDisplayed();
	}

}
