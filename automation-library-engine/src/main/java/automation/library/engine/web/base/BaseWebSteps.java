package automation.library.engine.web.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.LogManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import automation.library.api.core.Constants;
import automation.library.selenium.exec.driver.factory.DriverContext;

public class BaseWebSteps {
	Logger log = (Logger) LogManager.getLogManager().getLogger("logs");
	protected void launchApplication(String appName, String location) throws IOException {
		final String propsFilePath = Constants.ENVIRONMENTPATH + "/UAT.properties";
		
		//Read from Property file
		FileReader reader=new FileReader(propsFilePath);  
	     
	    Properties p=new Properties();  
	    p.load(reader);
		String URL = p.getProperty(appName);
		System.out.println("URL to be invoked" + URL);
		
		if(URL !=null) {
		    final JavascriptExecutor js = (JavascriptExecutor) getDriver();
			if(location.equals("NewWindow")) {
				getDriver().get(URL);
			}
			if(location.equals("NewTab")){
				
				js.executeScript("window.open('"+ URL +"','_blank')");
				
				ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
				getDriver().switchTo().window(tabs.get(tabs.size()-1));
				
				
				
			}
			
		}
	}
	
	public WebDriver getDriver() {
		//log.debug("Obtaining the driver for current thread");
		return DriverContext.getInstance().getDriver();
		
	}

}
