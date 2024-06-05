package New_TestNg;

import org.testng.annotations.Test;

public class Test_2 extends BaseClass
	 {
	@Test
	public void registrationTest() {
	Reg_lis rp = new Reg_lis(driver);
	rp.setFirstname();
	
	rp.setLastname();
	
	rp.setEmail();
	
	rp.setPass();
	
	rp.setcnfmPass();
	
	rp.clickButton();
	
	

}
}