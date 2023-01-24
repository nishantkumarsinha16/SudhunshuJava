package com.browser.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;

	public WebDriver openBrowser(String browser) {

		switch (browser) {
		case "chrome":
			chromeBrowser();
			break;
		case "firefox":
			fireFoxBrowser();
			break;
		default:
			chromeBrowser();

		}
		driver.get("https://material.angular.io/components/categories");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;

	}

	private void chromeBrowser() {
		driver = new ChromeDriver();
	}

	private void fireFoxBrowser() {
		driver = new FirefoxDriver();

	}

}
