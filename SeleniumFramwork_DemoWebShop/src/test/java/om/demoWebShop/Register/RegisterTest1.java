package om.demoWebShop.Register;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import com.demowebshop.generic_utilities.BaseClass;
import com.demowebshop.generic_utilities.ExcleUtility;
import com.demowebshop.generic_utilities.JavaUtility;

import com.demowebshop.object_repository.RegisterPage;
import com.demowebshop.object_repository.RegisterResultPage;
import com.demowebshop.object_repository.WellcomePage;

public class RegisterTest1 extends BaseClass {
@Test(groups = "Regression",dataProvider = "RegisterDetails",dataProviderClass = ExcleUtility.class)
    public static void main(String[] args) throws FileNotFoundException, IOException {

      
		
		@SuppressWarnings("unused")
		RegisterTest1 fu = new RegisterTest1();

//        String browser = fu.readkeyValueFromPropertyFile("browser");
//        String url = fu.readkeyValueFromPropertyFile("applicationUrl");

//        ExcleUtility eu = new ExcleUtility();
//
//        String firstName = eu.readDataFromSpecificCell("RegisterUser", 1, 1);
//        String lastName = eu.readDataFromSpecificCell("RegisterUser", 1, 2);
//        String gender = eu.readDataFromSpecificCell("RegisterUser", 1, 3);
//        String emailA = eu.readDataFromSpecificCell("RegisterUser", 1, 4);
//        String emailB = eu.readDataFromSpecificCell("RegisterUser", 1, 5);
//        String password = eu.readDataFromSpecificCell("RegisterUser", 1, 6);
//        
        WellcomePage  wp=new WellcomePage(driver);
        RegisterPage rp=new RegisterPage(driver);
        JavaUtility Ju=new JavaUtility();
        RegisterResultPage rrp=new  RegisterResultPage(driver);
        
        wp.clickOnRegister();
        rp.registerAsNewUser(gender,firstName,lastName,emailA,Ju.getRandomNumber(),emailB,password);
        
        
        Assert.assertTrue(rrp.getSuccesssMessage().isDisplayed());
        
        
//        if (rrp.getSuccesssMessage().isDisplayed()) {
//        	Reporter.log("Test:Pass",true);
//        	
//			
//		}else {
//			Reporter.log("Test:Pass",true);
//			ScreenShortUtility su=new ScreenShortUtility();
//			su.captureWebPage(driver);
//		}
//       
        
}
}  