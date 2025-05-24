package com.listener;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.base.Base_class;
import com.runner.Base_Class;

public class Extent_Report_Test {

	public static Extent_Report_Test extenttest;

	@BeforeSuite
	public void extentTestReportStartup() {
		Base_class base = new Base_class();

	};
	base.extentReportStart(null);

}

	@AfterSuite
	public void extentReportEnd() throws IOException {
		Base_Class base = new Base_Class() {
		};
		base.extentReportTearDown(null);
	}
}


