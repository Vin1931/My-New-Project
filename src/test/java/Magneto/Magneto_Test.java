package Magneto;

import java.io.IOException;
import org.testng.annotations.Test;
import junit.framework.Assert;

public class Magneto_Test extends Base_Class {

	@Test
	public void LoginTest() throws IOException {
		
		Login_Functionality lp=new Login_Functionality(driver);
		
		lp.setIUsername(UName);
		log.info("username is entered");
		
		lp.setPassword(PWord);
		log.info("password is entered");
		lp.ClickLoginBtn();
		log.info("login btn clicking activity is completed");
	
	String  Act_title=driver.getTitle();
	String Exp_title="My Account";
	
	if(Act_title.equals(Exp_title)) {
		
		Assert.assertTrue(true);
		log.info("testcase is passed");
	}else {
		
		captureScreen("LoginTest");
		Assert.assertTrue(false);
		log.info("testcase is failed");
	}
		
	
	}
}
