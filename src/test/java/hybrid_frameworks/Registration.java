package hybrid_frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
		WebDriver driver;
		public Registration(WebDriver driver) 
		{
			
					this.driver=driver;
					PageFactory.initElements(driver, this);
					
				}
		@FindBy(xpath="//a[text()='Register']")
		WebElement btnclick;
		
	 			@FindBy(id="customer.firstName")
				WebElement txtfirstname; 
				
				@FindBy(id="customer.lastName")
				WebElement txtlastname;
				
				@FindBy(id="customer.address.street")
				WebElement txtaddress;
				
				@FindBy(id="customer.address.city")
				
				WebElement txtcity;
				
				@FindBy(id="customer.address.state")
				WebElement txtstate;
				@FindBy(id="customer.address.zipCode")
				WebElement txtzipcode;
				@FindBy(id="customer.phoneNumber")
				WebElement txtphoneNumber;
				@FindBy(id="customer.ssn")
				WebElement txtssn;
				
				@FindBy(id="customer.username")
				WebElement txtusername;
				
				
				@FindBy(id="customer.password")
				WebElement txtpassword;
				
				@FindBy(id="repeatedPassword")
				WebElement txtrepeatedpassword;
				@FindBy(xpath="//input[@value='Register']")
				WebElement btnregister;

				
										
				public void registerclick()
				{
					btnclick.click();
				}
	           public void setfirstname(String name)
	           {
	        	   txtfirstname.sendKeys(name);
	           }
	           public void setlastname(String lname)
	           {
	        	   txtlastname.sendKeys(lname);
	           }
	           			
				public void setstreet(String address) {
					txtaddress.sendKeys(address);
				}
				public void setcity(String city) {
					txtcity.sendKeys(city);
				
				}
				public void setstate(String state)
				{
					txtstate.sendKeys("telengana");
				}
				public void setzipcode(String zipcode)
				{
					txtzipcode.sendKeys(zipcode);
				}
				public void setphoneNumber(String phoneNumber)
				{
					
				txtphoneNumber.sendKeys(phoneNumber);
				}
				public void setssn(String ssn)
				{
					txtssn.sendKeys(ssn);
				}
				public void setusername(String uname)
				{
					txtusername.sendKeys(uname);
				}
				public void setpassword(String password)
				{
					txtpassword.sendKeys(password);
				}
				public void setrepeatedpassword(String repeatedpassword)
				{
					txtrepeatedpassword.sendKeys(repeatedpassword);
					}
				   public void clickregister()
		             {
		            	
					     btnregister.click();
		             
}
}