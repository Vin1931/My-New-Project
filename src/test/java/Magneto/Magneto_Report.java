package Magneto;

import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Magneto_Report implements ITestListener {

	public ExtentSparkReporter reporter; //it is provide the basic information about the document 
	//document title,report name,theme of the report
	public ExtentReports extent; //it is provide the basic information about the user
	
	public ExtentTest test; //it is provide the basic infomation about testcases status
	//pass,fail,skip
	
	//pre-defined methods(onStart,onTestSuccess,onTestFailure,onTestSkipped,onFinish
	
	
	public void onStart(ITestContext context) {
		
		reporter=new ExtentSparkReporter("C:\\Users\\VINAY SURE\\Desktop\\W3S Java\\Main_Maven\\Report\\newone.html");
		
		//provide the basic information about the document
		
		reporter.config().setDocumentTitle("Magneto Login Doc");
		reporter.config().setReportName("Login Functionlaity Report");
		reporter.config().setTheme(Theme.DARK);
		
		//provide the basic information about the user
		
		extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("user", "Vinay");
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("OS", "Windows,Macos,Linux");
		extent.setSystemInfo("Browser", "chrome,firefox,edge");
		
	}
	
	public void onTestSuccess(ITestResult tr) {
		
		test=extent.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}
	
	public void onTestFailure(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
	
		String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		
		File f = new File(screenshotPath); 
		

		try {
			String imgPath=new Base_Class().captureScreen(tr.getName());
			test.addScreenCaptureFromPath(imgPath);//add screenshot into extent report
			} 
		catch (IOException e) 
				{
				e.printStackTrace();
				}
	
		}
	
	
	public void onTestSkipped(ITestResult tr) {
		
		test=extent.createTest(tr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}
}
