package New_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class Login {
	
	
	public static WebDriver driver;
	@Test(priority=1)
		public void openingurl()
		{
			driver = new EdgeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
			driver.manage().window().maximize();
		}
	@Test(priority=2)
		public static void selectlogin() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='page-wrapper']/header/div/div/ul/li[2]/a")).click();
		}
	@Test(priority=3)
		public void enterlogindetails()

		{
			driver.findElement(By.id("email")).sendKeys("vinaysure1998@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Vinay@123");
		}
	@Test(priority=4)
		public void signinbutton()

	{
			driver.findElement(By.id("send2")).click();
	}

}
