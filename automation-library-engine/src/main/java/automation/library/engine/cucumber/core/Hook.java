package automation.library.engine.cucumber.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.StringJoiner;

import org.apache.commons.io.FileUtils;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;

import automation.library.api.core.Constants;
import automation.library.common.TestContext;
import automation.library.selenium.exec.driver.factory.DriverContext;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.Parameters;


import static automation.library.selenium.core.Screenshot.grabScreenShot;

public class Hook {
	//To Do List
	//To read all Config files.
	//api screenshot for calling valdation and set features
	//Basic set up for Selenium. -- done for launching browser
	//take screenshot on failure Selenium.--done
	//allure report --> study yourself
	//read techstack --> done
	//take screenshot API feature file.
	//take screenshot of APIValidator and all web methods if possible.
	//Reporting
	//take screenshot of bat file
	//take screenshot of MVN command to run project
	//take screenshot of automation library core if possible
	//take screenshot of each folder structure.
	//Comparable VS Comparator
	//Browser stack
	//Jenkins
	//git commands
	//complexity
	
		//first techStack
		@Before(order = 1)
		public void setUp(Scenario scenario) throws FileNotFoundException{
		//public static void main(String[] args) throws FileNotFoundException {
			System.out.println("Inside Hook 1");
			
			StringJoiner jsonPath = new StringJoiner(".");
			jsonPath.add("$");
			jsonPath.add("staticData");
			
			ReadContext jsonFile = null;
			ReadContext jsonFile1 = null;
			System.out.println(Constants.BASEPATH);
			
			//To read json file for test data
			jsonFile = JsonPath.parse(new FileInputStream(Constants.FEATUREFILEPATH + scenario.getName() +".json"));
			
			Map result = jsonFile.read(jsonPath.toString(), Map.class);
			
			TestContext.getInstance().testDataPut("accountId",result.get("accountId"));
			TestContext.getInstance().testDataPut("accountNumber",result.get("accountNumber"));
			
			//To read techStack 
			jsonFile1 = JsonPath.parse(new FileInputStream(Constants.SELENIUMSTACKPATH + "LOCAL_CHROME.json"));
			Map result1 = jsonFile1.read("$.[0]", Map.class);
			DriverContext.getInstance().techStack = result1;
		
			
		}
		
		@After(order = 1)
		public void tearDown(Scenario scenario) throws IOException {
			
			System.out.println("Inside After Hook 1");
			if(scenario.isFailed()) {
				takeScreenShotOnFailure(scenario);
			}
			DriverContext.getInstance().getDriver().quit();
		}
		
		private void takeScreenShotOnFailure(Scenario scenario) throws IOException {
			
			File file = saveScreenshot(grabScreenShot(DriverContext.getInstance().getDriver()), "C:\\Users\\HP\\Desktop\\Selenium-Framework\\automation-runner-project\\target\\screenshot\\",scenario);
			
		}
		public static File saveScreenshot(File screenshot, String filepath, Scenario scenario) throws IOException {
			File file = new File(filepath + scenario.getName() + "_random.png" );
			FileUtils.moveFile(screenshot, file);
			return file;
		}
}