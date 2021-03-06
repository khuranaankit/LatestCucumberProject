package com.test.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.driver.manager.DriverManager;
import com.pageObjects.PageObjects;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class testStepDefinition {
	String URL;
	WebDriver driver;
	@Before
	public void setUp() {
		URL="http://demowebshop.tricentis.com";
		driver= DriverManager.getDriver();
		PageObjects po = new PageObjects();
		PageFactory.initElements(driver, PageObjects.class);
	}
	@Given("User login with URL and click on login link")
	public void User_login_with_URL_and_click_on_login_link() {
		driver.get(URL);
		PageObjects.loginLink.click();
	}
	
	@When("User Enters the login Credential and click on login button")
	public void User_Enters_the_login_Credential_and_click_on_login_button() {
		PageObjects.emailTextBox.sendKeys("Kannan1@gmail.com");
		PageObjects.passwordTextBox.sendKeys("test1234");
		PageObjects.loginButton.click();
	}
	
	@Then("User Validates the title of the page")
	public void User_Validates_the_title_of_the_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Demo Web Shop", title);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
