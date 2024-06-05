package New_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reg_lis
{
	WebDriver driver;
	public Reg_lis(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="firstname")
	WebElement firstname;
	@FindBy(id = "lastname")
	WebElement lastname;
	@FindBy(id = "email_address")
	WebElement email;
	@FindBy(id = "password")
	WebElement pass;
	@FindBy(id = "password-confirmation")
	WebElement cnfrmpass;
	@FindBy(xpath = "//button[@title='Create an Account']")
	WebElement registerbutton;
	public void setFirstname()
	{
		firstname.sendKeys("Vinay");
	}
	public void setLastname()
	{
		lastname.sendKeys("Sure");
	}
	public void setEmail()
	{
		email.sendKeys("vinaysure1998@gmail.com");
	}
	public void setPass()
	{
		pass.sendKeys("Vinay@123");
	}
	public void setcnfmPass()
	{
		cnfrmpass.sendKeys("Vinay@123");
	}
	public void clickButton()
	{
		registerbutton.click();
	}
}
