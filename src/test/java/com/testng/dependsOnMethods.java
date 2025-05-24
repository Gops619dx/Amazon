package com.testng;

import org.testng.annotations.Test;

import com.base.Base_class;

//All
public class dependsOnMethods extends Base_class {

	@Test(priority = 2, dependsOnMethods = "Two")
	private void One() {
		System.out.println("SONY");
	}

	@Test(priority = 1, dependsOnMethods = "Four")
	private void Two() {
		System.out.println("SAMSUNG");
	}

	@Test(priority = 4)
	private void Three() {
		System.out.println("MOTO");
	}

	@Test(priority = 3)
	private void Four() {
		System.out.println("ONE PLUS");
	}
}
