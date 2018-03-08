package com.dice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeTest
	protected void methodSetUp() {
		System.out.println("Method Set Up");
		driver = new FirefoxDriver();
	}

	@AfterTest
	protected void methodTearDown() {
		System.out.println("Method Tear Down");
		driver.quit();
	}

}
