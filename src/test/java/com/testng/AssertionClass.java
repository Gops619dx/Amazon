package com.testng;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// Run ALL
public class AssertionClass {

    // SoftAssert
    @Test
    private void signIn() {
        String actual = "Gopi";
        String expected = "Gopi Kannan ";

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actual, expected);
        System.out.println("Verification Successfully Done");
    }

    // HardAssert
    @Test
    private void login() {
        String actual = "Gops619dx";
        String expected = "Gops619dx";
        assertEquals(actual, expected);
        System.out.println("Validation Successfully Done");
    }
}
