package com.invafresh.novel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NovelTest {

	public WebDriver driver;

	@Test
	public void pageTitleNovels() {
		Assert.assertEquals("Novels", driver.getTitle());
	}

	@Test
	public void paragraph1() {
		Assert.assertEquals(1, driver.findElements(By.xpath("//article")).size());
	}

	@Test
	public void paragraph2() {
		Assert.assertEquals(1, driver.findElements(By.xpath("//article/p")).size());
	}

	@Test
	public void paragraph3() {
		Assert.assertEquals(1, driver.findElements(By.xpath("//article/p[1]/img")).size());
	}

}
