package pageobjects;

import automation.library.engine.core.objectmatcher.CommonPageObject;

public class SamplePage extends CommonPageObject{
	
	private String userNameTextBoxXPath = "//input[@name='username']";
	private String passwrodTextBoxXPath = "//input[@name='password']";
	private String loginBtnXPath = "//input[@name='login']";
	
	public String userNameTextBox()
	{ 
		return userNameTextBoxXPath;
	}
	
	public String passwordTextBox()
	{ 
		return passwrodTextBoxXPath;
	}

	public String loginBtn()
	{ 
		return loginBtnXPath;
	}


}
