package Parabank;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import hybrid_frameworks.Registration;

public class Reg  extends Base
{
	@Test
	public void test() throws InterruptedException, IOException
	{
		Registration  pb=new Registration (driver);
		pb.registerclick();
		pb.setfirstname(fn);
		log.info("firstname is entered");
		pb.setlastname(ln);
		log.info("lastname is entered");
		pb.setstreet(adres);
		log.info("address is entered");
		pb.setcity(citye);
		log.info("city is entered");
		pb.setphoneNumber(pnum);
		log.info("phonenum is entered");
		pb.setstate(sta);
		log.info("state is entered");
		pb.setssn(ssn);
		log.info("ssn is entered");
		pb.setzipcode(zipc);
		log.info("zipcode is entered");
		pb.setusername(us);
		log.info("username is entered");
		pb.setpassword(pas);
		log.info("password is entered");
	    pb.setrepeatedpassword(cpass);
	    log.info("confrm password is entered");
		pb.clickregister();
		 log.info("register button clicking activity performed");
		 String  Act_title=driver.getTitle();
			String Exp_title="ParaBank ";
			
			if(Act_title.equals(Exp_title)) {
				
				Assert.assertTrue(true);
				log.info("testcase is passed");
			}else {
				
				capturescreen(driver,"RegisterTest");
				log.info("testcase is failed");
			}

	}

}