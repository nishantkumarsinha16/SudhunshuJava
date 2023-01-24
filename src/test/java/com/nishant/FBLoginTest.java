package com.nishant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.browser.util.Browser;

public class FBLoginTest {

	WebDriver driver;

	@BeforeTest
	public void befor() {
		Browser browser = new Browser();
		driver = browser.openBrowser("zyz");
		
		System.out.println("befor Test");
	}

	@Test
	public void loginFacebookPage() {

	}
	
	@AfterTest
	public void after() {
		driver.close();
	}

}
