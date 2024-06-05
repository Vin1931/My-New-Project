package New_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_lis {
	
	WebDriver driver;
	public Login_lis(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[@class='page-wrapper']/header/div/div/ul/li[2]/a")
	WebElement signin;
	@FindBy(id="email")
	WebElement mail;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(id="send2")
	WebElement button;
	public void clickLink()
	{
		signin.click();
	}
	public void setEmail()
	{
		mail.sendKeys("vinaysure1998@gmail.com");
	}
	public void setpass()
	{
		password.sendKeys("Vinay@123");
	}
	public void buttonClick()
	{
		button.click();
	}

}
