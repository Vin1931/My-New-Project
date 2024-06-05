package New_TestNg;

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

public class ListenerClass implements ITestListener {
	public ExtentSparkReporter reporter;
	public ExtentReports extent;
	public ExtentTest test;
	 public void onStart(ITestContext context)
	 {
		 reporter=new ExtentSparkReporter("C:\\Users\\VINAY SURE\\Desktop\\W3S Java\\Main_Maven\\Report\\testreport.html");
		 reporter.config().setDocumentTitle("Luma Application report");
		 reporter.config().setReportName("Registartion Functionality report");
		 reporter.config().setTheme(Theme.DARK);
		 extent=new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("user", "Vinay Sure");
		 extent.setSystemInfo("host", "local host");
		 extent.setSystemInfo("OS", "Windows11");
		 extent.setSystemInfo("Environment", "QA");
		 extent.setSystemInfo("browsers", "chrome,edge");


	 }
	  public void onTestSuccess(ITestResult tr) {
		  test=extent.createTest(tr.getName());
		  test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	  }
	  
	  public void onTestFailure(ITestResult tr) {
		  test=extent.createTest(tr.getName());
		  test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
	  }
	  
	  public void onTestSkipped(ITestResult tr) {
		  test=extent.createTest(tr.getName());
		  test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.LIME));
	  }
	  
	  public void onFinish(ITestContext context) {
		  extent.flush();
	  }
}
