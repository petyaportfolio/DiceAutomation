package com.dice;

import org.testng.annotations.Test;

import com.dice.base.BaseTest;

public class SecondTest extends BaseTest {
	
	@Test
	public void secondTest() {
		driver.get("https://www.linkedin.com/");
		System.out.println("Opening LinkedIn");
	}

}
