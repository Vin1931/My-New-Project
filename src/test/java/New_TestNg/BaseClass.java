package New_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass
	{
		public static WebDriver driver;
		@BeforeClass
		public void openApplication()
		{
			driver=new ChromeDriver();
			driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
			driver.manage().window().maximize();	
		}
		@AfterClass
		public void close()
		{
			driver.close();
		}

}
