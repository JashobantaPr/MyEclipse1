package com.banking.yash.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class JavaUtilityB {
	public String timeStamp() {
		String timestamp = LocalDateTime.now().toString().replace(':', '-');
		return timestamp;
	}
public void screenshort(WebDriver driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File("./src/test/resources/"+timeStamp()+"bank.png");
	FileUtils.copyFile(temp, perm);
}
}
