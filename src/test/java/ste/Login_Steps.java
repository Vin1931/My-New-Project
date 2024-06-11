package ste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Login_Steps 
{
	public static WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() 
	{
		driver=new ChromeDriver();   
	}

	@Given("user is Available in Login Page")
	public void user_is_available_in_login_page() 
	{
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
		driver.manage().window().maximize();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
		driver.findElement(By.id("email")).sendKeys("vinaysure1998@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Vinay@123");
	   
	}

	@When("user clicks Login button")
	public void user_clicks_login_button() 
	{
		driver.findElement(By.id("send2")).click();
	  
	}

	@Then("user should successfully completed login functionality")
	public void user_should_successfully_completed_login_functionality() 
	{
		System.out.println("LoggedIn Sucessfully..");
	   
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