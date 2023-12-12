package com.apex.web.user.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.web.test.core.ApexBaseWebTest;

public class LoginTest extends ApexBaseWebTest implements LoginConstant{

	@Test
	public void TestwithCorrectLogin() throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/cecilyli/Documents/chromedriver");
        
        WebElement mail = driver.findElement(By.linkText("Gmail"));
        mail.click();
        WebElement signin = driver.findElement(By.linkText("Sign in"));
        signin.click();
        //#identifierId
        WebElement email = driver.findElement(By.id("identifierId"));
        email.sendKeys("c18244510@gmail.com");
        Thread.currentThread();
		Thread.sleep(2000);
        WebElement next = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        next.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));

        WebElement pw = driver.findElement(By.xpath("//input[@name='password']"));
        pw.sendKeys("Test@123");
        WebElement next2 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]"));
        next2.click();
        
        Thread.currentThread();
		Thread.sleep(TIMEOUT_2000);
        
        
        Assert.assertEquals(driver.getTitle(), "Inbox - c18244510@gmail.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("https://mail.google.com")); 

	}
}
