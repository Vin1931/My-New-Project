package Parabank;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import utility.test;

public class Base

{
      test rd = new test();
	 public String URl=rd.getUrl();
	 public String fn=rd.getFirstName();
	 public String ln=rd.getLastName();
	 public String adres=rd.getAdd();
	 public String citye=rd.getCityName();
	 public String pnum=rd.getPhNum();
	 public String sta=rd.getState();
	 public String ssn=rd.getssnNum();
	 public String zipc=rd.getZipCode();
	 public String us=rd.getUser();
	 public String pas=rd.getPass();
	 public String cpass=rd.getcnfmPass();
	public static WebDriver driver;
	public static Logger log;
	@BeforeClass
	public void openApp()
	{
	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URl);

		log=Logger.getLogger(driver.getClass());
		PropertyConfigurator.configure("log4j.properties");

	}
	public void capturescreen(WebDriver driver,String name) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\VINAY SURE\\Desktop\\W3S Java\\Main_Maven\\Report"+name+".png");
		FileUtils.copyFile(src, target);
		log.info("screenshot is completed");
		
	}
//	@AfterClass
//	public void close()
//	{
//		driver.close();
//	}
//	
}

