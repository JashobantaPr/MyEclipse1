package com.banking.yash.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestB {
	public WebDriver driver;
	public WebDriverUtilityB wdbUtils = new WebDriverUtilityB();
	public ExcelUtilityB exbUtils = new ExcelUtilityB();
	public JavaUtilityB javaUtils = new JavaUtilityB();
@BeforeClass
	public void executeBeforeClass() throws IOException {
	String browser = exbUtils.readDataFromExcelFile(0, 1);
	if (browser.equals("chrome")) {
		driver = new ChromeDriver();
	}else if (browser.equals("firefox")) {
		driver = new FirefoxDriver();
	}else if (browser.equals("edge")) {
		driver = new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get(exbUtils.readDataFromExcelFile(1, 1));
}
@AfterClass
	public void executeAfterClass() {
	//driver.manage().window().minimize();
	//driver.quit();
}
}
