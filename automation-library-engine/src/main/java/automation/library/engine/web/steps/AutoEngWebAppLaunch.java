package automation.library.engine.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import automation.library.engine.core.objectmatcher.ObjectFinder;
import automation.library.engine.web.base.BaseWebSteps;

public class AutoEngWebAppLaunch extends BaseWebSteps{
	@Given("^the web application \"([^\"]*)\" is launched in a \"([^\"]*)\"")
	public void theWebApplicationLaunchInA(String appName, String location) throws IOException {
		launchApplication(appName, location);
	}
	
	
	/*@When("^the user clicks the \"([^\"]*)\" element at the \"([^\"]*)\" page$")
	public void theUserClicksTheElementAtThePage(String objectName, String pageObj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException, NoSuchMethodException, SecurityException, IOException{
	    launchApplication(objectName, pageObj);
	    
	    
	}*/
}
