package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ITest {
	
	 WebDriver driver;

	    @BeforeMethod
	    public void beforeTest() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com/");
	    }

	    @AfterMethod
	    public void afterTest() {
	        driver.quit();
	    }

	    @Test(retryAnalyzer = ReTest.class)
	    public void testMethod() {
	        String title = driver.getTitle();
	        assertEquals(title, "google");
	    }


}
