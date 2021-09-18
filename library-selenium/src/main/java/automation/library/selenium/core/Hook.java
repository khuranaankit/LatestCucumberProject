package automation.library.selenium.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.StringJoiner;
import automation.library.common.TestContext;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

//import com.jayway.jsonpath.ReadContext;
public class Hook {
	
	
		//first techStack
		@Before(order = 3)
		public void setUp(Scenario scenario) throws FileNotFoundException{
		//public static void main(String[] args) throws FileNotFoundException {
			System.out.println("Inside Hook 1");
			
			
			//***************Write code to read techstack.json*******************
			
			//StringJoiner jsonPath = new StringJoiner(".");
			//jsonPath.add("$");
			//jsonPath.add("staticData");
			
			
			//ReadContext jsonFile = null;
			//To read json file for test data
			//jsonFile = JsonPath.parse(new FileInputStream(Constants.FEATUREFILEPATH + scenario.getName() +".json"));
			
			//Map result = jsonFile.read(jsonPath.toString(), Map.class);
			
			//TestContext.getInstance().testDataPut("accountId",result.get("accountId"));
			//TestContext.getInstance().testDataPut("accountNumber",result.get("accountNumber"));
			
			//To read techStack 
			//jsonFile = JsonPath.parse(new FileInputStream(Constants.FEATUREFILEPATH + scenario.getName() +".json"));
			
		
			
		}
		
		@After(order = 2)
		public void tearDown() {
			
			System.out.println("Inside After Hook 2");
			
			
		}
}