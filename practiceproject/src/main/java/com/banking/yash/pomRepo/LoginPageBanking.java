package com.banking.yash.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageBanking {
	WebDriver driver;
	public LoginPageBanking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@xpath='1']")
	private WebElement uid;
	public WebElement getUid() {
		return uid;
	}
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "//input[@value='LOGIN']")
	private WebElement loginbtn;
	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
