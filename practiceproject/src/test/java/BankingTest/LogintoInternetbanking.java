package BankingTest;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.banking.yash.genericUtility.BaseTestB;
import com.banking.yash.pomRepo.GivingEmail;
import com.banking.yash.pomRepo.LoginPageBanking;
import com.banking.yash.pomRepo.getUNandPwd;

public class LogintoInternetbanking extends BaseTestB {
@Test(priority = 1)
	public void LoginIntoInternetbanking() throws IOException {
	GivingEmail userPassword = new GivingEmail(driver);
	userPassword.getEmailtextfield().sendKeys(exbUtils.readDataFromExcelFile(2, 1));
	userPassword.getSubmitButton().click();
}
@Test(priority = 2)
	public void getdata() throws IOException, InterruptedException {
	getUNandPwd unpwd = new getUNandPwd(driver);
	String user = unpwd.getUserName().getText();
	String pwd = unpwd.getPassword().getText();
	System.out.println("UN = " +user);
	System.out.println("PWD = " +pwd);
	javaUtils.screenshort(driver);
	unpwd.getLoginToBankLink().click();	
}
@Test(priority = 3)
	public void login() throws InterruptedException, IOException {
	Thread.sleep(10);
	Actions action = new Actions(driver);
	action.click().perform();
	Thread.sleep(10);
	action.click().perform();
	LoginPageBanking login = new LoginPageBanking(driver);
	login.getUid().sendKeys(exbUtils.readDataFromExcelFile(3, 1));
	login.getPassword().sendKeys(exbUtils.readDataFromExcelFile(4, 1));
	login.getLoginbtn().click();
 
}
}
