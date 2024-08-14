package InstagramLoginAndLike;

import java.io.IOException;

import org.testng.annotations.Test;


import com.insta.yash.genericutility.BaseClass;
import com.insta.yash.pomrepo.LoginToInsta;
import com.insta.yash.pomrepo.SearchName;

public class EndToEndOfInsta extends BaseClass{
@Test
	public void loginAndLikeOnInsta() throws InterruptedException, IOException{
	
	LoginToInsta logininsta = new LoginToInsta(driver);
	logininsta.getUsernameTextfield().sendKeys(fileUtils.readTheDataFromPropertyFile("username"));
	logininsta.getPasswordTextfield().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
	logininsta.getLoginButton().click();
	SearchName search = new SearchName(driver);
	search.getHomeoption().click();
	search.getPopup().click();
	search.getSearchoption().click();
	search.getPersonname().click();
	
}
}
