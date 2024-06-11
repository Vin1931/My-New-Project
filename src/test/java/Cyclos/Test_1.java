package Cyclos;

import org.testng.annotations.Test;

public class Test_1 extends Base
{
	@Test
	public void login()
	{
		Login lp = new Login(driver);
		
		lp.clicklogin();
		lp.setuser("demo");
		lp.setpass("1234");
		lp.clicksubmit();
	}
}