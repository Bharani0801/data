package org.test;

import org.base.CucumberReporting;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\adactin.feature"},
							glue= {"org.step"},monochrome=true,plugin= {"pretty","C:\\Users\\Bharani\\eclipse-workspace\\Data\\target\\sample.json"})
public class TestRunner {
	

}
