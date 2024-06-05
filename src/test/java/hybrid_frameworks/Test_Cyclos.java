package hybrid_frameworks;

import org.testng.annotations.Test;

public class Test_Cyclos extends Base_Cyclos {
	@Test
	public void Regtest() {
		Cyclos rp=new Cyclos(driver);
		rp.clickregister();
		rp.setname("Vinay Sure");
		rp.setloginname("Vinay007");
		rp.setemail("vinaysure1998@gmail.com");
		rp.setmobile("(201)555-0555");
		rp.setlandline("(201)555-0123");
		rp.clicknext();
		rp.setpassword("Vinay@123");
		rp.setconfirmpassword("Vinay@123");
		rp.clicksubmit();
	}

}
