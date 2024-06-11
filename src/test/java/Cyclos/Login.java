package Cyclos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

   //Identify the elements
   @FindBy(xpath="//a[@id = 'login-link']")
    WebElement login;
   
   @FindBy(xpath = "//input[@type = 'text']")
   WebElement user;
   
   @FindBy(xpath = "//input[@type = 'password']")
   WebElement pass;
   
   @FindBy(xpath = "//action-button[@actionkind = 'primary']")
   WebElement submit;
   
   public void clicklogin()
   {
	   login.click();  
   }
   
   public void setuser(String Uname)
   {
	   user.sendKeys(Uname);
   }
   
   public void setpass(String Pwd)
   {
	   pass.sendKeys(Pwd);
   }
  
   public void clicksubmit()
   {
	   submit.click();
   }
}
