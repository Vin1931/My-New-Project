package New_TestNg;

import org.testng.annotations.Test;

public class Test_1 extends BaseClass {
	@Test
	public void LoginTest() {
		
		Login_lis lp = new Login_lis(driver);
		lp.clickLink();
		lp.setEmail();
		lp.setpass();
		lp.buttonClick();
		
		
	}

}
