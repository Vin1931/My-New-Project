package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readingdata {//utilities class
	
	//excel sheet ==> reading mode ==> FileInputStream
	Properties pro;
	public  Readingdata() {
		
		File f=new File("C:\\Users\\VINAY SURE\\Desktop\\W3S Java\\First_Cucumber\\Configaration\\Ad.properties");
	
		try {
			//it is converted into reading mode
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			
			System.out.println("Exception is : "+e.getMessage());
		}	
	}	
	public String getUsername() {
		
		String uname=pro.getProperty("username");
		return uname;
	}
	
	public String getPassword() {
		
		String pword=pro.getProperty("password");
		return pword;
				
	}
}