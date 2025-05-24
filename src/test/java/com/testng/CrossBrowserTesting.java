package com.testng;

import org.testng.annotations.Test;
import com.base.Base_class;

public class CrossBrowserTesting extends Base_class {

    @Test(priority=3)
    private void chromeLaunch() {
        lanuchBrowser("chrome");
        lanuchUrl("https://www.instagram.com/?hl=en");
        System.out.println("BROWSER ID " + Thread.currentThread().getId());
    }

    @Test(priority = -5)
    private void fireFox() {
        lanuchBrowser("firefox");
        lanuchUrl("https://www.instagram.com/?hl=en");
        System.out.println("BROWSER ID " + Thread.currentThread().getId());
    }

    @Test(priority = -3)
    private void Edge() {
        lanuchBrowser("Edge");
        lanuchUrl("https://www.instagram.com/?hl=en");
        System.out.println("BROWSER ID " + Thread.currentThread().getId());
    }
    
    

}
