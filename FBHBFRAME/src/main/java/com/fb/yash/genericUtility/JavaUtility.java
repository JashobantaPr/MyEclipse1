package com.fb.yash.genericUtility;

import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;

public class JavaUtility {
	public String timeStamp(WebDriver driver) {
		String timestamp = LocalDateTime.now().toString().replace(':', '-');
		return timestamp;
	}
}
