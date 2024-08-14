package com.insta.yash.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToInsta {
 WebDriver driver;
 public LoginToInsta(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
 	@FindBy(xpath = "//input[@name='username']")
 	private WebElement usernameTextfield;
 	
 	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	@FindBy(xpath = "//input[@name='password']")
 	private WebElement passwordTextfield;
 	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
 	@FindBy(xpath = "//button[@type='submit']")
 	private WebElement loginButton;
}
