package ATH;

import java.awt.Desktop.Action;
import java.net.URL;
import java.util.Iterator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AtheneNetwork {

	public static void main(String[] args) throws Throwable {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("deviceName", "Yash");
        //capabilities.setCapability("appium:app", "C:\\apk\\Humsafar_15022024.apk");
        capabilities.setCapability("appPackage", "network.athene.app");
        capabilities.setCapability("automationName", "UiAutomator2");
        //capabilities.setCapability("noReset", "true");
        capabilities.setCapability("appActivity", "network.athene.app.MainActivity");

        @SuppressWarnings("deprecation")
		URL url = new URL("http://127.0.0.1:4723/");
		
		AndroidDriver driver = new AndroidDriver(url,capabilities);
		
		Thread.sleep(8000);
		try {
			WebElement el0 = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Get Started\"]"));
		    el0.click();
		    Thread.sleep(1000);
		    WebElement el = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Agree and continue\"]"));
		    el.click();
		    Thread.sleep(3000);
		    WebElement el1 = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Continue with Google\"]"));
		    el1.click();
		    Thread.sleep(3000);
		    WebElement el2 = driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.gms:id/container\"])[1]"));
		    el2.click();
		    Thread.sleep(3000);		    
		    WebElement el3 = driver.findElement(AppiumBy.xpath("//android.widget.ImageView"));
		    el3.click();
		    Thread.sleep(2000);
		    
		    Thread.sleep(1000);
		    WebElement el5 = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Mining\"]"));
		    el5.click();
		    //Thread.sleep(3000);
		    //for (int i = 0; i <10000; i++) {
		    Actions ac = new Actions(driver);
		    WebElement el4 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.ImageView[4]"));
		    ac.click(el4).perform();
			//}
		    
		} finally {
		    //driver.quit();
		}
	}
}
