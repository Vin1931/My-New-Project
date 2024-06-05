package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class test 
{
	Properties pro;
	public test( )
	{
		File f=new File("C:\\Users\\VINAY SURE\\Desktop\\W3S Java\\Main_Maven\\Config\\data.properties");
		try {
			FileInputStream fs=new  FileInputStream(f);
			pro=new Properties();
			pro.load(fs);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String getUrl()
	{
		String URl=pro.getProperty("appURL");
		return URl;
	}
	public String getFirstName()
	{
		String fname=pro.getProperty("firstname");
		return fname;
	}
	public String getLastName()
	{
		String lname=pro.getProperty("lastname");
		return lname;
	}
	public String getAdd()
	{
		String address=pro.getProperty("add");
		return address;
	}
	public String getCityName()
	{
		String cityname=pro.getProperty("city");
		return cityname;
	}
	public String getPhNum()
	{
		String phonenum=pro.getProperty("phno");
		return phonenum;
	}
	public String getState()
	{
		String state1=pro.getProperty("state");
		return state1;
	}
	public String getssnNum()
	{
		String ssno=pro.getProperty("ssnnum");
		return ssno;
	}
	public String getZipCode()
	{
		String zip=pro.getProperty("zipcode");
		return zip;
	}
	public String getUser()
	{
		String username=pro.getProperty("user");
		return username;
	}
	public String getPass()
	{
		String password=pro.getProperty("pass");
		return password;
	}
	public String getcnfmPass()
	{
		String conformp=pro.getProperty("cnfrmpass");
		return conformp;
	}

}
