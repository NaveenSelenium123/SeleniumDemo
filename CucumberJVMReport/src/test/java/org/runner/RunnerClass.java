package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.step",
plugin={"json:src\\test\\resources\\Facebook\\fb.json"})
public class RunnerClass {
@AfterClass
public static void report() {
JVMReport.cucumberReports("src\\test\\resources\\Facebook\\fb.json");	
}
}
