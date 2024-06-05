package Adactin;

import java.io.IOException;
import org.testng.annotations.Test;
import junit.framework.Assert;

public class TestCases extends Adactin_BaseClass {

	@Test
	public void LoginTest() throws IOException {
		
		Adactin_LoginPage lp=new Adactin_LoginPage(driver);
		
		lp.setIUsername(UName);
		log.info("username is entered");
		
		lp.setPassword(PWord);
		log.info("password is entered");
		lp.ClickLoginBtn();
		log.info("login btn clicking activity is completed");
	
	String  Act_title=driver.getTitle();
	String Exp_title="Adactin.com - Search Hotel";
	
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
