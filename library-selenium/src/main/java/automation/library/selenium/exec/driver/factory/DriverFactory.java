package automation.library.selenium.exec.driver.factory;

import automation.library.selenium.exec.driver.managers.ChromeDriverManager;

public class DriverFactory {
	
	protected static DriverManager createDriver() {
		return new DriverFactory().setDM();
		
	}
	
	public DriverManager setDM() {
		String serverType = DriverContext.getInstance().getTechStack().get("seleniumServer"); //get seleniumServer from techStack from DriverContext.getInstance.getTechStack.get("seleniumServer"));
		String browserType = DriverContext.getInstance().getTechStack().get("browserName");; //get seleniumServer from techStack from DriverContext.getInstance.getTechStack.get("seleniumServer"));

		switch(serverType) {
			case "local":
				 switch(browserType) {
				 case "CHROME":
					 return new ChromeDriverManager();
				 case "IE":
					 return new ChromeDriverManager();
			     default:
			    	 return new ChromeDriverManager();
				 }
			default:
				return new ChromeDriverManager();
		}
		
	}

}
