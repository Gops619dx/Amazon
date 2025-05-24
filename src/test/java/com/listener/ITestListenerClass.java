package com.listener;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.Base_class;



public class ITestListenerClass extends Base_class implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
	    try {
	        Extent_Report_Test.extenttest.pass(result.getMethod() + " : " + "Test Pass",
	        		MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void onTestFailure(ITestResult result) {
	    try {
	    	Extent_Report_Test.extenttest.pass(result.getMethod() + " : " + "Test Fail",	           
	    			MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

}
