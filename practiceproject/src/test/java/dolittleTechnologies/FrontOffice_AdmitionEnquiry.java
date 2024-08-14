package dolittleTechnologies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontOffice_AdmitionEnquiry {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dltschool64.dolittletech.co.in/admin/enquiry");
		driver.findElement(By.id("form-username")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.id("form-password")).sendKeys("123456");
		driver.findElement(By.xpath("//div[2]/form/button")).submit();
		driver.findElement(By.xpath("//span[normalize-space()='Add New Record']")).click();
		driver.findElement(By.id("name_add")).sendKeys("yash");
		driver.findElement(By.id("number")).sendKeys("8249606399");
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("yr60554@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("btm second stage");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(" a statement that tells you how something or ");
		driver.findElement(By.xpath("//textarea[@name='note']")).sendKeys(" a statement that tells you how something or ");
		driver.findElement(By.id("date")).sendKeys("25-04-2024");
		driver.findElement(By.id("date_of_call")).sendKeys("30-04-2024");
		driver.findElement(By.xpath("//select[@name='assigned']")).click();
		driver.findElement(By.xpath("//option[@value='1']")).click();
		driver.findElement(By.xpath("//select[@name='reference']")).click();
		//driver.findElement(By.xpath("//option[@value='Parent ']")).click();
		driver.findElement(By.xpath("//div[@class='col-sm-3']//select[@name='source']")).click();
		driver.findElement(By.xpath("//div[@class='col-sm-3']//option[@value='Online Front Site 4654654'][normalize-space()='Online Front Site 4654654']")).click();
		driver.findElement(By.xpath("//div[@class='col-sm-3']//select[@name='class']")).click();
		driver.findElement(By.xpath("//div[@class='col-sm-3']//option[@value='2'][normalize-space()='test']")).click();
		driver.findElement(By.xpath("//input[@name='no_of_child']")).sendKeys("2");
		driver.findElement(By.id("submit")).submit();
	}
}
