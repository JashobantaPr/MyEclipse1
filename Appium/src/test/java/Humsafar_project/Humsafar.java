package Humsafar_project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Humsafar {

    public static void main(String[] args) throws MalformedURLException, Throwable {

    	
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "9.0");
        capabilities.setCapability("appium:deviceName", "Yash");
        capabilities.setCapability("appium:app", "C:\\apk\\Humsafar_15022024.apk");
        capabilities.setCapability("appium:appPackage", "com.humsafar.app");
        capabilities.setCapability("appium:appActivity", ".MainActivity");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:noReset", "true");

        @SuppressWarnings("deprecation")
		URL url = new URL("http://127.0.0.1:4723/");
		AndroidDriver driver = new AndroidDriver(url,capabilities);
		
		Thread.sleep(5000);
		/*
		driver.findElement(By.xpath("//android.widget.ImageView")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//android.widget.ImageView")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Continue\"]")).click();
		*/
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Skip\"]")).click();
		
		Thread.sleep(1000);
		WebElement MobTextField = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Continue with Mobile Number\"]"));
		MobTextField.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText")).click();

		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("8249606399");
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SIGN IN\"]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("123456");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Verify\"]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"MySelf\"]")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Male\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")).click();
		
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
		firstname.click();
		firstname.sendKeys("Jashobanta");
		WebElement lastname = driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[3]"));
		lastname.click();
		lastname.sendKeys("Pradhan");
		
		WebElement gender = driver.findElement(By.xpath("//android.widget.Button[@index='4']"));
		gender.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Male\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@index='5']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Hindu\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@index='6']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"A\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@index='7']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Hindi\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[4]")).click();
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//android.widget.EditText"));
		email.click();
		email.sendKeys("yr60554@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@index='5']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Tamilnadu\"]")).click();
		
		//driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")).click();
		
		//family details
		WebElement fatherName = driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
		fatherName.click();
		fatherName.sendKeys("S Pradhan");
		
		driver.findElement(By.xpath("//android.widget.Button[@index='2']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Engineer\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.EditText[@index='3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]")).click();
		driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]")).sendKeys("K Pradhan");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@index='4']")).click();
		//driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@index='0']")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@index='5']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"1\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@index='6']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"1\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue\"]")).click();

		//Add photo to profile
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Camera\"]")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Touch to capture\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"OK\"]")).click();
		
		Thread.sleep(3000);
		System.out.println("Successfully Registered");
		driver.quit();





    }
}


