package com.qsp.vtiger.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplementationClass implements IRetryAnalyzer {

	int count = 1;
	int limit = 3;
	public boolean retry(ITestResult result) {
		
		while(limit>=count) {
			count ++;
			return true;
		}
		
		// TODO Auto-generated method stub
		return false;
	}

}
