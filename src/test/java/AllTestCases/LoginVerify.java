package AllTestCases;

import org.testng.annotations.Test;

import pomPages.LoginPage;

public class LoginVerify extends BaseClass {
	
	@Test
	public void VerifyLogin() {
		LoginPage lPage=new LoginPage(driver);
		lPage.login("standard_user","secret_sauce");
		
	}

}
