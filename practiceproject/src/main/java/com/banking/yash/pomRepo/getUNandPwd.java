package com.banking.yash.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class getUNandPwd {
	WebDriver driver;
	public getUNandPwd(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//td[text()='User ID :']/following-sibling::td")
	private WebElement userName;
	public WebElement getUserName() {
		return userName;
	}
	@FindBy(xpath = "//td[text()='Password :']/following-sibling::td")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(linkText = "Bank Project")
	private WebElement loginToBankLink;
	public WebElement getLoginToBankLink() {
		return loginToBankLink;
	}
}
