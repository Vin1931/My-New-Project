package New_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Adactin_Annotation {
public static WebDriver driver;
	@BeforeSuite
	public void openurl() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}
	@BeforeTest
	public void newuserregister() {
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
	}
	@BeforeClass
	public void username() {
		driver.findElement(By.id("username")).sendKeys("VinaySure");
	}
	@BeforeMethod
	public void password() {
		driver.findElement(By.id("password")).sendKeys("Vinay@123");
	}
	@Test
	public void confirmpassword() {
		driver.findElement(By.id("re_password")).sendKeys("Vinay@123");
	}
	@AfterMethod
	public void fullname() {
		driver.findElement(By.id("full_name")).sendKeys("Sure Vinay Kumar");
	}
	@AfterTest
	public void checkbox() throws InterruptedException {
		driver.findElement(By.id("tnc_box")).click();
		
	}
	@AfterClass
	public void sleep() throws InterruptedException {
		driver.findElement(By.id("email_add")).sendKeys("vinaysure1998@gmail.com");
		Thread.sleep(10000);//To enter capctha
	}
	@AfterSuite
	public void clickregister() {
		driver.findElement(By.id("Submit")).click();
	}
	
}