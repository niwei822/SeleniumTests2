package com.apex.web.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.web.search.page.SearchPage;
import com.apex.web.test.core.ApexBaseWebTest;

public class SearchTest extends ApexBaseWebTest implements SearchConstant{
	@Test
	public void TestwithTextInput() throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/cecilyli/Documents/chromedriver");
        
       SearchPage page = new SearchPage(driver);
       page.performSearch("popular books");
        
        Assert.assertEquals(page.getTitle(), "popular books - Google Search");
        Assert.assertTrue(page.getCurrentUrl().contains("https://www.google.com")); 

	}
	
	@Test
	public void TestwithNumberInput() throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/cecilyli/Documents/chromedriver");
        
       SearchPage page = new SearchPage(driver);
       page.performSearch("123");
        
        Assert.assertEquals(page.getTitle(), "123 - Google Search");
        Assert.assertTrue(page.getCurrentUrl().contains("https://www.google.com")); 

	}
}
