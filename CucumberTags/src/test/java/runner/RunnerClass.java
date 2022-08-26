package runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FacebookTag.feature",
glue="step",
tags= {"@Regression"},dryRun=false,plugin= {"json:\\src\\test\\resources\\Facebook\\fb.json"})
public class RunnerClass {
	

}
