package com.ijmeet.stepdefinitions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ijmeet.keywords.FEKeywords;
import com.ijmeet.pages.HomePage;
import com.ijmeet.pages.SignUpPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps {
	HomePage home;
	SignUpPage signup;
	
	@Before("@First")
	public void openSetup() throws InterruptedException {
		FEKeywords.openBrowser("Chrome");
		FEKeywords.LaunchUrl("https://www.ijmeet.com/");
		Thread.sleep(5000);	
		home=PageFactory.initElements(FEKeywords.driver, HomePage.class);
		signup=PageFactory.initElements(FEKeywords.driver, SignUpPage.class);
		Thread.sleep(5000);
	}
	
	@Given("User goes to SignUp Page")
	public void gotoSignUpPage() throws InterruptedException {
		home.clickOnSignUp();
	}
	@When("User enters first name as {word}")
	public void enterFullName(String word) {
		signup.enterFirstName(word);
	}
	@And("He click on Signup Button on Signup page")
	public void clickOnSignupBtn() throws InterruptedException {
		Thread.sleep(5000);
		signup.clickOnCaptcha();
		Thread.sleep(3000);
		signup.clickOnSignupButton();	
	}
	@Then("He should not able to signup")
	public void companyNameErrorVisibility() {
		Assert.assertTrue(signup.isEnterCompanyNameVisible());
	}
}
