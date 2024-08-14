package fbEndToEnd;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.fb.yash.genericUtility.BaseClass;
import com.fb.yash.pomRepo.LoginToFb;

public class EndToEndOfFb extends BaseClass {
@Test (invocationCount=5)
	public void endToEndOfFb() throws IOException {
	LoginToFb login = new LoginToFb(driver);
	login.getEmailTextField().sendKeys(excelFileUtils.readDataFromExcel(2, 1));
	login.getPasswordTextField().sendKeys(excelFileUtils.readDataFromExcel(3, 1));
	login.getLoginButton().click();
	//driver.switchTo().alert().dismiss();
}
}
