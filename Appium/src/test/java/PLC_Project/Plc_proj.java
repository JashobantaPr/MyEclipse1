package PLC_Project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Plc_proj {

    public static void main(String[] args) throws MalformedURLException, Throwable {

    	
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "9.0");
        capabilities.setCapability("appium:deviceName", "Yash");
        capabilities.setCapability("appium:app", "C:\\apk\\PLC_090224.apk");
        capabilities.setCapability("appium:appPackage", "com.productlifecycle");
        capabilities.setCapability("appium:appActivity", ".MainActivity");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:noReset", "true");

        @SuppressWarnings("deprecation")
		URL url = new URL("http://127.0.0.1:4723/");
		
		AndroidDriver driver = new AndroidDriver(url,capabilities);
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\" Continue with Mobile Number\"]/android.view.ViewGroup")).click();
		
		Thread.sleep(5000);

		WebElement MobTextField = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Mobile Number\"]"));
		MobTextField.click();
		Thread.sleep(5000);
		MobTextField.sendKeys("9114122486");
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//android.view.View")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.view.View")).click();
		
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"󱍕\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\", Log Out\"]")).click();
		
		driver.quit();



    }
}


