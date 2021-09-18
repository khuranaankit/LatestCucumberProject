package automation.library.engine.api.steps;

import java.util.HashMap;

import java.util.Map;

import automation.library.common.TestContext;
import automation.library.engine.api.base.BaseAPISteps;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import com.google.common.base.Verify;

public class AutoEngAPIValidate extends BaseAPISteps{
	HashMap<String, Object> args = new HashMap<String, Object>();
	Map<String, Object> result = new HashMap<String, Object>();
		
	@Then("^the user validates the API response attribute \"([^\"]*)\" within parentAtrribute \"([^\"]*)\" from the JSON payload is \"([^\"]*)\" to \"([^\"]*)\"$")
	public void theUserValidatesTheJSONResponseAttributeWithParent(String attributeName, String parentAttributeName, String comparisonOperator, String expectedValue)
	{
		String actualValue = retreiveValueFromAPIResponse("fw.lastAPIResponse", parentAttributeName, attributeName);
		
		if(actualValue.equalsIgnoreCase(expectedValue)) {
			Assert.assertTrue(actualValue.equals(expectedValue));
			
			
		   System.out.println("\nScenario Passed Expected Value: " + expectedValue + " matches the Actual Value: " + actualValue + "\n");
		   System.out.println(TestContext.getInstance().testDataGet("accountId"));
		   System.out.println(TestContext.getInstance().testDataGet("accountNumber"));
		   
		}
	}

}
