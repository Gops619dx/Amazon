package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {

    @BeforeSuite
    private void propertySetting() {
        System.out.println("PROPERTY SETTING");
    }

    @BeforeTest
    private void browserLaunch() {
        System.out.println("BROWSER LAUNCH");
    }

    @BeforeClass
    private void urlLaunch() {
        System.out.println("URL LAUNCH");
    }

    @BeforeMethod
    private void logIn() {
        System.out.println("LOGIN");
    }

    @Test
    private void women() {
        System.out.println("WOMEN");
    }

    @Test
    private void men() {
        System.out.println("MEN");
    }

    @Test
    private void kids() {
        System.out.println("KIDS");
    }

    @AfterMethod
    private void logout() {
        System.out.println("LOGOUT");
    }

    @AfterClass
    private void screenshot() {
        System.out.println("SCREENSHOT");
    }
    @AfterTest
    private void browserclose() {
        System.out.println("BROWSER CLOSE");
    }
    @AfterSuite
    private void terminateBrowser() {
        System.out.println("TERMINATE BROWSER");
    }
   
}
