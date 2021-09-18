package com.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium-Framework\\library-selenium\\webDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
}
