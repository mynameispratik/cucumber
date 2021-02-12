package com.example.cucumber1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions( plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
monochrome = true,
features = "src/test/resources")
public class UserTest {

	
	
}
