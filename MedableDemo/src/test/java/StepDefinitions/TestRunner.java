package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/HP/eclipse-workspace/MedableDemo/src/test/resources/Features",
glue={"StepDefinitions"},monochrome = true,
plugin = { "pretty", "html:target/reports",
		"json:target/reports/cucumber.json",
        "junit:target/reports/cucumber.xml"})

public class TestRunner {


}
