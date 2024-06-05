package New_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Parameterization 
{
	public static WebDriver driver;
	@Parameters({"browser","url"})
	@Test(priority=1,groups= {"Group-1"})
	public void openApplication(String browser, String url)
	{
		if (browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test(priority=2,groups= {"Group-2"})
	public void createAccount() 
	{
		driver.findElement(By.id("firstname")).sendKeys("Vinay");
		driver.findElement(By.id("lastname")).sendKeys("Sure");
		driver.findElement(By.id("email_address")).sendKeys("vinaysure1998@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Vinay@123");
		driver.findElement(By.id("password-confirmation")).sendKeys("Vinay@123");
		driver.findElement(By.xpath("//button[@type = 'submit'][@title='Create an Account']")).click();
		
		
	}
	
	
	@Test(priority=3,groups= {"Group-3"})
	public void Verification() {
		
		String Act_title=driver.getTitle();
		String exp_tit="magento.softwaretestingboard.com/customer/account/";
		
		SoftAssert sa=new SoftAssert();
		if(Act_title.equals(exp_tit)) {
			//Hard ASSERT
			//Assert.assertTrue(true);
			//softassert
			sa.assertTrue(true);
			System.out.println("testcase is passed");
		}
		else {
//			Assert.assertTrue(false);
			sa.assertTrue(false);
			System.out.println("testcase is failed");
		}
	}
}