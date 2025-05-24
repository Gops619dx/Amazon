package com.base;

import org.testng.AssertJUnit;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {

	public static WebDriver driver;
	public static Exports extentReports;
	public static File file;

	protected static WebDriver lanuchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During Browser launch");
		}
		driver.manage().window().maximize();
		return driver;
	}

	protected static void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During Close Browser");
		}
	}

	protected static void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During Quit Browser");
		}
	}

	protected static void closeTab() {
		try {
			driver.close();
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During Closing the tab");
		}
	}

	protected static void lanuchUrl(String lanuchUrl) {
		try {
			driver.get(lanuchUrl);
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During URl launch");
		}
	}

	protected static void windowNavigate(String nav) {
		try {
			driver.navigate().to(nav);
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During Window Navigate");
		}
	}

	protected static void input(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During Input The TExt");
		}
	}

	protected static void clearInput(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During Clearing The TExt");
		}
	}

	protected static void clickElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During Clicking The Element");
		}
	}

	protected static void windowAction(String type) {
		try {
			if (type.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			} else if (type.equalsIgnoreCase("back")) {
				driver.navigate().back();
			} else if (type.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			}
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During Window Actions");
		}
	}

	protected static void selectOptions(WebElement element, String type, String value) {
		try {
			Select select = new Select(element);
			if (type.equalsIgnoreCase("text")) {
				select.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("index")) {
				select.selectByIndex(Integer.parseInt(value));
			} else if (type.equalsIgnoreCase("value")) {
				select.selectByValue(value);
			}
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During Selection method");
		}
	}

	protected static void deSelectOptions(WebElement element, String type, String value) {
		try {
			Select select = new Select(element);
			if (type.equalsIgnoreCase("text")) {
				select.deselectByVisibleText(value);
			} else if (type.equalsIgnoreCase("index")) {
				select.deselectByIndex(Integer.parseInt(value));
			} else if (type.equalsIgnoreCase("value")) {
				select.deselectByValue(value);
			}
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur During Deselection method");
		}
	}

	protected static void takeScreenshot(String location) {
		Date currentDate = new Date();
		String dataFile = "";
		File screenShot = null;
		try {
			dataFile = currentDate.toString().replace(" ", "").replace(":", "");
			screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenShot, new File(location + dataFile + ".png"));
		} catch (Exception e) {
			AssertJUnit.fail("Error: Occur while Taking ScreenShot");
		}
	}
	protected static void explicitWait(WebElement element, String waitType, int timeInSec) {

	try {
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(timeInSec));
		if (waitType.equalsIgnoreCase("visible")) {
			mywait.until(ExpectedConditions.visibilityOf(element));
		}else if (waitType.equalsIgnoreCase("clickable")) {
			mywait.until(ExpectedConditions.elementToBeClickable(element));
		}else if (waitType.equalsIgnoreCase("presence")) {
			mywait.until(ExpectedConditions.presenceOfElementLocated((By)element));
		}
	} catch (Exception e) {
		AssertJUnit.fail("Error: Occur During wait method");	}
	}
 

	    public static WebDriver launchBrowser(String browserName) {
	        if (browserName.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        }
	        // Add other browsers if needed
	        return driver;
	    }

	    public static void launchUrl(String url) {
	        driver.get(url);
	        driver.manage().window().maximize();
	    }

	    public WebDriver getDriver() {
	        return driver;
	    }
	    
	    public static void extentReportStart(String location) {
	    	extentReports = new ExtentReports();
	        File file = new File(location);
	        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
	        extentReports.attachReporter(sparkReporter);
	        extentReports.setSystemInfo("OS", System.getProperty("os.name"));
	        extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
		}
	    
	    public static void extentReportTearDown(String location) throws IOException {
	        extentReports.flush();
	        file = new File(location);
	        Desktop.getDesktop().browse((file).toURI());
	    }
	    
	    public String takeScreenshot() throws IOException {
	        TakesScreenshot screenshot = (TakesScreenshot) driver;
	        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        File scrFile = screenshot.getScreenshotAs(OutputType.FILE);
	        File destFile = new File("Screenshot_" + timeStamp + ".png");
	        FileUtils.copyFile(scrFile, destFile);
	        return destFile.getAbsolutePath();
	    }

}
