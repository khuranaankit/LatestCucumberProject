package automation.library.api;

import java.util.HashMap;
import java.util.Map;
import com.intuit.karate.Runner;

public class BaseAPISteps {
	
	public static Map callAPI(String pathTofeatureFile, HashMap args)
	{
		Map<String, Object> result = Runner.runFeature(pathTofeatureFile, args, true);
		
		return result;
		
	}
	
	
}
