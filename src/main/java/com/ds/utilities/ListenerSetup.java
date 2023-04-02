package com.ds.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ds.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		logger.info("test case execution fail - "+result.getName());
		UtilClass.TakeSS(result.getName()+"-"+System.currentTimeMillis());
		logger.info("teke screenshot - ");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		logger.info("test case execution skipped - "+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		logger.info("test case execution start - "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		logger.info("test case execution sucsses - "+result.getName());
	}
	

}
