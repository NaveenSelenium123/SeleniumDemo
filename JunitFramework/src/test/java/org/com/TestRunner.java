package org.com;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(Test1.class,Test2.class,Test3.class);
		//To get the run count
		int runCount = r.getRunCount();
		System.out.println("Run count" +runCount);	
		
	//To get the failure count
	int failureCount = r.getFailureCount();
	System.out.println("Failure count:" +failureCount);
	
	// To get the run time
	long runTime = r.getRunTime();
	System.out.println("Run Time:" +runTime);
	
	// To get the ignore count
	int ignoreCount = r.getIgnoreCount();
	System.out.println("Ignore count:" +ignoreCount);
	
	// To get the Failures
	List<Failure> failures = r.getFailures();
	for (Failure failure : failures) {
		System.out.println(failure);	
	}
	}
}
