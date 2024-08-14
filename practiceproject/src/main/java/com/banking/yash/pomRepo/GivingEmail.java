package com.banking.yash.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GivingEmail {
	WebDriver driver;
	public GivingEmail(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "emailid")
	private WebElement emailtextfield;
	
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}
	@FindBy(name = "btnLogin")
	private WebElement submitButton;
	
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
}
