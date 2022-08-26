package Data1HeaderRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Facebook1DHeader.feature",glue="Data1HeaderStep",monochrome=true)
public class TestRunner {

}
