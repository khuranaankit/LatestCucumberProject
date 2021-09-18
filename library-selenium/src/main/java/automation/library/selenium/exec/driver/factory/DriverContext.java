package automation.library.selenium.exec.driver.factory;

import org.openqa.selenium.WebDriver;
import automation.library.common.*;
import java.io.FileInputStream;
import java.util.*;


public class DriverContext {
	
	DriverManager browserDriverManager;
	private static ThreadLocal<DriverContext> instance = ThreadLocal.withInitial(DriverContext::new);
	public Map<String, String> techStack = null;
	private DriverContext() {
		
	}
	
	public static synchronized DriverContext getInstance() {
		return instance.get();
		
	}
	
	public Map<String, String> getTechStack(){
		return this.techStack;
	}
	public WebDriver getDriver() {
		if(browserDriverManager == null) {
			browserDriverManager = DriverFactory.createDriver();
		}
		return browserDriverManager.getDriver();
	}
}
