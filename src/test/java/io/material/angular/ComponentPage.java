package io.material.angular;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.browser.util.Browser;
import com.pages.Component;

public class ComponentPage {

	WebDriver driver;
	Component component = new Component();

	@BeforeClass
	public void beforeTest() {
		System.out.println("beforeTest");
		Browser browser = new Browser();
		driver = browser.openBrowser("zyz");
	}

	@Test
	public void validateOverview() throws InterruptedException {
		System.out.println("===============" + component.verifyPageTitle());
		Assert.assertTrue(component.verifyPageTitle());
		driver.findElement(By.xpath("//span[@class='mdc-button__label' and text()='Ok, Got it']")).click();

		Thread.sleep(1000);

		String dynamicName = "List";
		String storeXpath = String.format("//span[contains(text(),'%s')]", dynamicName);		
		String s = "//span[contains(text(),'"+dynamicName+"')]";		
		System.out.println(storeXpath);
		driver.findElement(By.xpath(storeXpath)).click();
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Ex. Pizza']"));
		element.clear();
		element.sendKeys("testData-1");

	}

	@Test
	public void test2() {

		System.out.println("Test-2");

	}

	@AfterClass
	public void afterTest() {
		// driver.close();
	}

}
