package com.swaglabs.config;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "",
		glue = "com.swaglabs.SD"		
		)

public class TestRunner {

}
