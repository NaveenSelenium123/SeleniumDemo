package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void cucumberReports(String json) {
	File f =new File("E:\\projects\\CucumberJVMReport\\target");
	Configuration c =new Configuration(f,"Cucumber 9AM");
	c.addClassifications("Sprint number","5");
	c.addClassifications("Operating System","Windows");
	c.addClassifications("Windows","8");
	c.addClassifications("BrowserName","Google Chrome");
	c.addClassifications("Version number","100");
	List<String> l =new ArrayList<>();
	l.add(json);
	ReportBuilder a =new ReportBuilder(l,c);
	a.generateReports();
	

	}
}
