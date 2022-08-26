package stepdef;

import base.BaseClass;

//import org.hooks.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
@Before
public void beforeScenario() {
browserConChrome();
openApplication("https://www.facebook.com");
maximizeWindow();
}
@After
public void afterScenario() {
	closeBrowser();
}
}
