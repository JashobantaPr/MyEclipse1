package com.fb.yash.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	public WebDriverUtility webDriverUtils = new WebDriverUtility();
	public ExcelFileUtility excelFileUtils = new ExcelFileUtility();
	public JavaUtility javaUtils = new JavaUtility();
	public FileUtility fileUtils = new FileUtility();
@BeforeClass
	public void executeBeforeClass() throws IOException {
	String browser = excelFileUtils.readDataFromExcel(0, 1);
	if (browser.equals("chrome")) {
		driver = new ChromeDriver();
	}else if (browser.equals("firefox")) {
		driver = new FirefoxDriver();
	}else if (browser.equals("edge")) {
		driver = new EdgeDriver();
	}
	driver.manage().window().maximize();
	webDriverUtils.implicitWait(driver);
	driver.get(excelFileUtils.readDataFromExcel(1, 1));
}
@AfterClass
	public void executeAfterClass() {
	//driver.manage().window().minimize();
	//driver.quit();
}
}
