package automation.library.selenium.exec.driver.managers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import automation.library.selenium.exec.driver.factory.DriverManager;

public class ChromeDriverManager extends DriverManager{

	@Override
	protected void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium-Framework\\library-selenium\\webDrivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("incognito");
		//options.addArguments("incognito");
		
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		
			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
