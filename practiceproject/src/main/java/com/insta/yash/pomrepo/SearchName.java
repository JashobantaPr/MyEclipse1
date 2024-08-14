package com.insta.yash.pomrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchName {

	WebDriver driver;
	 public SearchName(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 public WebElement getPopup() {
		return popup;
	}
	@FindBy(xpath = "//span[contains(text(),'Home')]")
	 private WebElement homeoption;
	 
	 @FindBy(xpath = "//div/button[text()='Not Now']")
	 private WebElement popup;
	 
	 @FindBy(xpath = "//span[contains(text(),'Search')]")
	 private WebElement searchoption;
	 
	
	@FindBy(xpath = "//span[text()='sachinpradhan_2023']")
	 private WebElement personname;
	public WebElement getHomeoption() {
		return homeoption;
	}

	public WebElement getSearchoption() {
		return searchoption;
	}

	public WebElement getPersonname() {
		return personname;
	}
	
}
