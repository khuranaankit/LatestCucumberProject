package automation.library.engine.api.base;

import java.util.HashMap;

import java.util.Map;
import automation.library.common.TestContext;

public class BaseAPISteps extends automation.library.api.BaseAPISteps{
	
	public static Map callAPIWithoutTag(String pathTofeatureFile, HashMap args)
	{
		Map<String, Object> result = callAPI(pathTofeatureFile, args);
		
		return result;
		
	}
	
	public String retreiveValueFromAPIResponse(String payloadKeyName,String parentAttributeName, String attributeName) {
		Map<String, Object> result = new HashMap<String, Object>();
		HashMap<String, Object> args = new HashMap<String, Object>();
		
		String featureName = String.format("%s%s.feature", "storeAttribute","WithParent");
		
		
		args.put("parentAttributeName", parentAttributeName);
		args.put("attributeName", attributeName);
		args.put("response", TestContext.getInstance().testDataGet(payloadKeyName));
		String featureToRun = "classpath:services/store/" + featureName;
		
		result = callAPIWithoutTag(featureToRun ,args);
		
		String valToStore = String.valueOf(result.get("valToStore"));
		return valToStore;
	}
}
