package com.cucumber.boots.feature.web.user;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/user/RegisterUser.feature",
		plugin = { "pretty", "html:target/cucumber", "json:target_json/cucumber.json", "junit:taget_junit/cucumber.xml" },
		tags = { }
		)

public class RunUserTest{
	
}