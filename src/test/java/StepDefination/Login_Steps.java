package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import PageObject.BaseClass;
import PageObject.Ad_Login;

public class Login_Steps extends BaseClass
{
	public static WebDriver driver;
	Ad_Login lp;
	@Given("browser is open")
public void browser_is_open() 
	{
		driver=new ChromeDriver();
}

@Given("user is Available in Login Page")
public void user_is_available_in_login_page() 
{
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().window().maximize();
}

@When("^user enters (.*) and (.*)$")
public void user_enters_username_and_password(String uname,String pwd)
{
	lp=new Ad_Login(driver);
	lp.setIUsername(uname);
	lp.setPassword(pwd);
    
}

@When("user clicks Login button")
public void user_clicks_login_button()
{
	lp.ClickLoginBtn();
}

@Then("user should successfully completed login functionality")
public void user_should_successfully_completed_login_functionality() 
{
	System.out.println("login completed sucessfully");
}

@Then("user navigated into properpage")
public void user_navigated_into_properpage() 
{
	String Exp_Title="My Account";
	String Act_title=driver.getTitle();
	
	if(Act_title.equals(Exp_Title)) {
		
		System.out.println("Login Functionality passed...");
	}else {
		System.out.println("Login Functionality Failed...");
	}
    
}

}
