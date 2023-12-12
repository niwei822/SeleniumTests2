package com.apex.web.test.core;

import org.openqa.selenium.WebDriver;

public class ApexBasePage {
	
	protected WebDriver driver = null;
	
	public ApexBasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
