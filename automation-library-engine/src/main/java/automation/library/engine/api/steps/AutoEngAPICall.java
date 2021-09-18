package automation.library.engine.api.steps;

import java.util.HashMap;

import java.util.Map;


import automation.library.common.TestContext;
import automation.library.engine.api.base.BaseAPISteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AutoEngAPICall extends BaseAPISteps{
	
	@Given("^the user sends request to the \"([^\"]*)\" API$")
	public void theUserSendsRequestToTheAPI(String feature)
	{			
		Map<String, Object> result = new HashMap<String, Object>();
		
		HashMap<String, Object> args = new HashMap<String, Object>();
		args.put("featureName",feature);
		args.put("tagName", "PositiveAPIResponse");
		result = callAPIWithoutTag("classpath:apiObjects/services/" + feature + ".feature",args);
		
		TestContext.getInstance().testDataPut("fw.lastAPIResponse", result.get("response"));
		TestContext.getInstance().testDataPut("fw.responseStatus", result.get("responseStatus"));
			
	}
	
	
}
