package pageobjects;

import automation.library.engine.core.objectmatcher.CommonPageObject;

public class HomePage extends CommonPageObject{
	
	private String signUpLink= "//a[contains(text(),'SignUp')]";
	
	public String signUpLink()
	{ 
		return signUpLink;
	}
	
	
}
