package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
                                      //snippets=SnippetType.CAMELCASE
@RunWith(Cucumber.class)         //plugin="json",plugin="pretty",plugin="html:src\\test\\resources\\Facebook"
                                 //plugin="json:src\\test\\resources\\Facebook.json",plugin="junit:src\\test\\resources\\Facebook.xml"
@CucumberOptions(features="src\\test\\resources",glue="org.step",plugin="junit:src\\test\\resources\\Facebook.xml",
monochrome=true,dryRun=false,snippets=SnippetType.UNDERSCORE)
public class TestRunner {

}
