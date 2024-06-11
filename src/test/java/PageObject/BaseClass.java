package PageObject;

import Utilities.Readingdata;

public class BaseClass 
{
	Readingdata rd = new Readingdata();
	
	public String uname = rd.getUsername();
	
	public String pwd = rd.getPassword();

}
