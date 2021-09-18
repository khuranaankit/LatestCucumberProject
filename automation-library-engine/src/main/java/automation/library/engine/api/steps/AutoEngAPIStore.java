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

public class AutoEngAPIStore extends BaseAPISteps{
	
	@And("^the user store \"([^\"]*)\" within parent attribute \"([^\"]*)\" from the JSON payload at dictionary key \"([^\"]*)\"")
	public void theUserStoreFromAPIPayloadWithParent(String attributeName, String parentAttributeName, String dictionaryKey)
	{
		  String valToStore = retreiveValueFromAPIResponse("fw.lastAPIResponse", parentAttributeName, attributeName);
	      TestContext.getInstance().testDataPut(dictionaryKey, valToStore);
	}
	
	
}
