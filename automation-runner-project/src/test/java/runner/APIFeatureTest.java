package runner;


import org.junit.runner.RunWith;



import automation.library.engine.BaseTestAPIEngine;
import cucumber.api.CucumberOptions;



@CucumberOptions(tags = {"@Postive_200"},
				features = {"classpath:features"})
public class APIFeatureTest extends BaseTestAPIEngine{
	
}

