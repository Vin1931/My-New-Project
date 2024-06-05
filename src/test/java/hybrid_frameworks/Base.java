package hybrid_frameworks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

		public static WebDriver driver;

		@BeforeClass
		public void OpenApplication() {

			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://parabank.parasoft.com/parabank/index.htm");
			driver.manage().window().maximize();
		}

		@AfterClass
		public void CloseApplication() {
		driver.close();
	}
	}



