package New_TestNg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Reg_listner {
	public static WebDriver driver;
	@Test(priority = 1)
	public void openapp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		driver.manage().window().maximize();
	}
	@Test(priority = 2)
	public void PersonalInformation() {
		driver.findElement(By.id("firstname")).sendKeys("Vinay");
		driver.findElement(By.id("lastname")).sendKeys("Sure");
		driver.findElement(By.id("email_address")).sendKeys("vinaysure1998@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Vinay@123");
		driver.findElement(By.id("password-confirmation")).sendKeys("Vinay@123");
	}
	@Test(priority = 3)
	public void createAnAccount() {
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
	}

}
