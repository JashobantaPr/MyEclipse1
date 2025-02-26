package appiumProject;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.graph.EndpointPair;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppTest {

	@Test
    public static void TestApp() throws MalformedURLException, Throwable {

    	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\jashobanta pradhan\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
    			.withIPAddress("127.0.0.1").usingPort(4723).withArgument(GeneralServerFlag.BASEPATH, "/wd/hub").build();
    	service.start();
    	
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "9.0");
        capabilities.setCapability("appium:deviceName", "Yash");
        capabilities.setCapability("appium:app", "C:\\apk\\PLC_090224.apk");
        capabilities.setCapability("appium:appPackage", "com.productlifecycle");
        capabilities.setCapability("appium:appActivity", ".MainActivity");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:noReset", "true");

        //@SuppressWarnings("deprecation")
		//URL url = new URL("http://127.0.0.1:4723");
		
		AndroidDriver driver = new AndroidDriver(service,capabilities);
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\" Continue with Mobile Number\"]/android.view.ViewGroup")).click();
		
		Thread.sleep(5000);

		WebElement MobTextField = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Mobile Number\"]"));
		MobTextField.click();
		Thread.sleep(5000);
		MobTextField.sendKeys("8249606399");
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//android.view.View")).click();
		
		service.stop();

    }
}

