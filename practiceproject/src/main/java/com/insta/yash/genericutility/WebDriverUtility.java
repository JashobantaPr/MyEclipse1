package com.insta.yash.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
	
		public void implicitlyWait(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
