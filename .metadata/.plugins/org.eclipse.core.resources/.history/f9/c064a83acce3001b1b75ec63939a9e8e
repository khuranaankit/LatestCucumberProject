package com.runner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 glue = {"com.test.cucumber"},
		 plugin= {"html:cucumber-report/report1.html"},
		 features= {"src/test/resources/features"},
		 dryRun=false
		)
public class Runner {


}
