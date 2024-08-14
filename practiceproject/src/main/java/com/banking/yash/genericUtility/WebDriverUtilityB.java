package com.banking.yash.genericUtility;

import java.time.Duration;


import org.openqa.selenium.WebDriver;

public class WebDriverUtilityB {
	public void implicitWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(0, null);
	}
}
