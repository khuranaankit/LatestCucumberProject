package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	
	@FindBy(xpath="//a[@href='/login']")
	public static WebElement loginLink;
	
	@FindBy(xpath="//input[@name='Email']")
	public static WebElement emailTextBox;
	
	@FindBy(xpath="//input[@name='Password']")
	public static WebElement passwordTextBox;

	@FindBy(xpath="//input[@type='submit' and @value='Log in']")
	public static WebElement loginButton;
}
