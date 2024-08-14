package dolittleTechnologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SchoolProject {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dltschool64.dolittletech.co.in/vikram/site/login");
		WebElement UN = driver.findElement(By.id("form-username"));
		UN.click();
		UN.sendKeys("superadmin@gmail.com");
		WebElement PWD = driver.findElement(By.id("form-password"));
		PWD.click();
		PWD.sendKeys("123456");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		driver.findElement(By.xpath("//div[@data-i18n='Front Office']")).click();
		driver.findElement(By.xpath("//div[@data-i18n='Admission Enquiry']")).click();
	}
}
