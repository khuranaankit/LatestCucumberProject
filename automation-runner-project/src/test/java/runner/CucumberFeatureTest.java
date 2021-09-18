package runner;


import automation.library.engine.BaseTestEngine;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = {"@postiveCucumberResponse,@webClickTest"})
public class CucumberFeatureTest extends BaseTestEngine{
	
}

