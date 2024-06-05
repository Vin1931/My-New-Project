package Magneto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Functionality 
{
	WebDriver driver;
	public Login_Functionality(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@title = 'Email']")
	WebElement txtUsername;
	
	@FindBy(xpath = "//input[@title = 'Password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@class = 'action login primary']")
	WebElement btnLogin;
	
	
	//create the corresponding actions
	
	public void setIUsername(String uname) {
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void ClickLoginBtn() {
		btnLogin.click();
	}
}