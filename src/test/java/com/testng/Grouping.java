package com.testng;


import org.testng.annotations.Test;

// Run All
public class Grouping {

    @Test(groups = "YEZDI", priority = 1)
    private void adventure() {
        System.out.println("YEZDI ADVENTURE");
    }

    @Test(groups = "YEZDI", priority = 2)
    private void roadster() {
        System.out.println("YEZDI ROADSTER");
    }

    @Test(groups = "YEZDI", priority = 3)
    private void scrambler() {
        System.out.println("YEZDI SCRAMBLER");
    }

    

    @Test(groups = "SKODA", priority = 5)
    private void slavia() {
        System.out.println("SKODA SLAVIA");
    }

    @Test(groups = "SKODA", priority = 6)
    private void kylaq() {
        System.out.println("SKODA KYLAQ");
    }

    @Test(groups = "SKODA", priority = 7)
    private void kushaq() {
        System.out.println("SKODA KUSHAQ");
    }
}
