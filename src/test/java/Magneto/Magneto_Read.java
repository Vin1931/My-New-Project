package Magneto;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Magneto_Read {
	
	Properties pro;
	public  Magneto_Read() {
		
		File f=new File("C:\\Users\\VINAY SURE\\Desktop\\W3S Java\\Main_Maven\\Config\\Magneto.properties");
	
		try {
			
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			e.printStackTrace(); 
		}	
	}
	public String getAppURL() { 
		
		String url=pro.getProperty("appURL");
		return url;
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