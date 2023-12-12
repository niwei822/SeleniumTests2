package com.apex.web.search.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.web.search.test.SearchConstant;
import com.apex.web.test.core.ApexBasePage;


public class SearchPage extends ApexBasePage implements SearchConstant {
	@FindBy(name=SEARCH_BOX_LOCATOR)
	WebElement searchBox;
	@FindBy(name=SEARCH_BTN_LOCATOR)
	WebElement searchBtn;
	
	public SearchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setSearchBoxData(String searchkeyWord) {
		searchBox.sendKeys(searchkeyWord);
}
	public void clickOnSearchBtn() {
		searchBtn.click();
	}
	
	public void performSearch(String searchkeyWord) throws InterruptedException {
		setSearchBoxData(searchkeyWord);
		Thread.currentThread();
		Thread.sleep(TIMEOUT_2000);
		clickOnSearchBtn();
	}
	
}
