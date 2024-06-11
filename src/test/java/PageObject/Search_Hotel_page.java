package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Hotel_page 
{
	WebDriver driver;
	Select sc;
	public Search_Hotel_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="location")
	WebElement drpLocation;
	
	@FindBy(id="hotels")
	WebElement drpHotels;
	
	@FindBy(id="room_type")
	WebElement drpRoomType;
	
	public void SetLocation()
	{
		sc=new Select( drpLocation);
		sc.selectByIndex(2);
	}
	public void SetHotels()
	{
		sc=new Select(drpHotels);
				sc.selectByIndex(2);
	}
	public void SetRoomType()
	{
		sc=new Select(drpRoomType);
		sc.selectByIndex(2);
	}

}