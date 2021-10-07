package TeamJava.TodayLearning;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyTest {
	ExtentReports extent;
	@BeforeTest
	public void testTrial() {
		String path= System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("automation test");
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	
	@Test
	public void SeleTest() {
		extent.createTest("intial test");
		System.out.println("seletest");
		extent.flush();
	}
	
	
@Test
	public void APITest() {
		System.out.println("api test");
	}
}
