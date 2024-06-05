package hybrid_frameworks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

    public class Base_Cyclos 
{
    public static WebDriver driver;
    
    @BeforeClass
    public void Openapp() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.cyclos.org/ui/home");
	driver.manage().window().maximize();
}
	@AfterClass
	public void Closeapp() {
		//driver.close();
	}
}