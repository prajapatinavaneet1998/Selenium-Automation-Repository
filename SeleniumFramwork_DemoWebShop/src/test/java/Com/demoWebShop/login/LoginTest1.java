package Com.demoWebShop.login;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demowebshop.generic_utilities.BaseClass;
import com.demowebshop.generic_utilities.ListnersImplementation;
import com.demowebshop.object_repository.LoginPage;

import com.demowebshop.object_repository.WellcomePage;
@Listeners(ListnersImplementation.class)
public class LoginTest1 extends BaseClass{
	
	@Test(groups= {"Smoke","Regression"})
	public void loginAsValidUser() throws IOException{
		
		WellcomePage wp=new WellcomePage(driver);
		LoginPage lp=new LoginPage(driver);
		
		//Click On Login Link
		wp.clickOnLogin();
		
		//Login
		lp.loginAsValidUser(email, password);
		
		//Verify User is able to Login
		
		
		Assert.assertEquals(wp.getRegisteredEmailText().getText(),email);
		
//		if (wp.getRegisteredEmailText().getText().contains(email)) {
//		
//			Reporter.log("Test : Pass",true);
//		} else {
//			Reporter.log("Test : Fail",true);
//			ScreenShortUtility su=new ScreenShortUtility();
//			su.captureWebPage(driver);
//		}
	
	}
}