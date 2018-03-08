package com.dice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dice.base.BasePageObject;

public class LogInPage extends BasePageObject <LogInPage>{
	private static final String URL  = "https://www.dice.com/dashboard/login";
	
	public LogInPage (WebDriver driver) {
		super(driver);
	
}
	public void openLogInPage (){
		getPage (URL);
	}
	private By emailField = By.xpath("//input[@id='email']");
	private By passwordField = By.xpath("//input [@id ='password']");
	private By button = By.xpath("//button[@type = 'submit']");
	
	public void fillEmailAndPassword(String email, String password){
		type (email,emailField);
		type (password, passwordField);
	}
	
	public ProfilePage pushSignInButton (){
		click (button);
		return new ProfilePage (driver);
		
	}
	
	
}
