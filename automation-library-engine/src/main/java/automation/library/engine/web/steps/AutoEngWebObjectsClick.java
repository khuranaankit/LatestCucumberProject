package automation.library.engine.web.steps;

import java.lang.reflect.InvocationTargetException;
import automation.library.engine.core.objectmatcher.ObjectFinder;
import automation.library.web.steps.BaseStepsWebClick;
import io.cucumber.java.en.When;


public class AutoEngWebObjectsClick extends BaseStepsWebClick{

		
	@When("^the user clicks the \"([^\"]*)\" element at the \"([^\"]*)\" page$")
	public void theUserClicksTheElementAtThePage(String objectName, String pageObj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException, NoSuchMethodException, SecurityException, InterruptedException {
	    String xPath = ObjectFinder.getObject(objectName, pageObj);
	    clickElement(xPath);

	}
	
}
