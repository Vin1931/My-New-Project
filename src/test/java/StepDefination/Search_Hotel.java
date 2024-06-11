package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import PageObject.BaseClass;
import PageObject.Ad_Login;
import PageObject.Search_Hotel_page;

public class Search_Hotel extends BaseClass
{ public static WebDriver driver;

    Ad_Login lp;
	@Given("browser should be opened")
	public void browser_should_be_opened() 
	{
		driver=new ChromeDriver();
	    
	}

	@Given("user should available in the login page")
	public void user_should_available_in_the_login_page() 
	{
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	   
	}

	@When("usershould enters validusername and validpassword")
	public void usershould_enters_validusername_and_validpassword()
	{
		lp=new Ad_Login(driver);
		lp.setIUsername(uname);
		lp.setPassword(pwd);
	   
	}

	@When("userClicks Login button")
	public void user_clicks_login_button()
	{
		lp.ClickLoginBtn();
	    
	}

	@When("user select required data in search hotel page")
	public void user_select_required_data_in_search_hotel_page() 
	{
		Search_Hotel_page shp=new Search_Hotel_page(driver);
		shp.SetLocation();
		shp.SetHotels();
		shp.SetRoomType();
	    
	}

	@When("user Clicks search button")
	public void user_clicks_search_button() {
	   
	}

	@Then("user should sucessfully completed search Functionality")
	public void user_should_sucessfully_completed_search_functionality() {
	   
	}

}
