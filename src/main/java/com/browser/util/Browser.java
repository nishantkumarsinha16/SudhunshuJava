package com.browser.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public WebDriver driver;

	public WebDriver openChromeDriver() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		return driver;

	}

}
