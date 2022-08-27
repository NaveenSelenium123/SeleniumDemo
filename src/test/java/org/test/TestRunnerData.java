package org.test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="src\\test\\resources",glue="org\\step\\StepDefinitionData.java",monochrome=true)
@CucumberOptions(features="src\\test\\resources",glue="org\\dataforRunner",monochrome=true)
public class TestRunnerData {

}
