package com.dice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.dice.base.BasePageObject;
import com.dice.base.BaseTest;
import com.dice.pages.LogInPage;

public class LoginTest extends BaseTest {


	@Test
	public void logInTest(){
		LogInPage logInPage = new LogInPage (driver);
		
		//open log in page
		logInPage.openLogInPage();
		//fill e-mail and password
		logInPage.fillEmailAndPassword("petyagavrilova@outlook.com", "goodluck9");
		//push sign in button
		logInPage.pushSignInButton();
		
		
		
		
		
		
	}
}
