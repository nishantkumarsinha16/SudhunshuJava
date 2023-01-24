package com.pages;

import org.openqa.selenium.By;

import com.browser.util.Browser;

public class Component extends Browser {	

	public boolean verifyPageTitle() {
		return driver.getTitle().equals("Components | Angular Material");

	}
	
	public void fillBasicInput() {
		
	}

}
