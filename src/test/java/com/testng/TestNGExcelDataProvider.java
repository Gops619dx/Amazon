 package com.testng;

import java.time.Duration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGExcelDataProvider {

    @DataProvider(name = "excelDataProvider")
    public Object[][] dataProviderMethod() {
        String filePath = System.getProperty("user.dir") + "\\Excel\\TestData.xlsx";
        String sheetName = "data";
        return ExcelUtility.getExceldata(filePath, sheetName);
    }

    @Test(dataProvider = "excelDataProvider")
    private void login(String username, String password) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).submit();

        System.out.println("Username : " + username + " | Password : " + password);
    }
}
