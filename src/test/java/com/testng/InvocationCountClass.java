package com.testng;

import org.testng.annotations.Test;

import com.base.Base_class;

public class InvocationCountClass extends Base_class {

	@Test(invocationCount = 10)
	private void chrome() {
		lanuchBrowser("chrome");
		launchUrl("https://www.google.com/");
		System.out.println("Browser ID: " + Thread.currentThread().getId());

	}
}
