package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.Configuration;

import net.masterthought.cucumber.ReportBuilder;

public class CucumberReporting {

	public static void report(String json) {

		File f = new File("C:\\Users\\Bharani\\eclipse-workspace\\Data\\target");

		net.masterthought.cucumber.Configuration config = new net.masterthought.cucumber.Configuration(f, "report");
		config.addClassifications("chomebrowser", "win 10");
		List<String> li=new ArrayList<String>();
		li.add(json);
		ReportBuilder builder = new ReportBuilder(li, config);
		builder.generateReports();
		
	}

}
