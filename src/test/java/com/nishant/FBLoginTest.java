package com.nishant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.browser.util.Browser;

public class FBLoginTest {

	WebDriver driver;

	@Test
	public void loginFacebookPage() {
		Browser b = new Browser();
		driver = b.openChromeDriver();
		driver.findElement(By.id("email")).sendKeys("nishant Sinha");
		driver.findElement(By.id("pass")).sendKeys("123344");
		driver.findElement(By.name("login")).click();
		driver.close();

	}

}
