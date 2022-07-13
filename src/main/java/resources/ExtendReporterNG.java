package resources;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporterNG extends base{
	static ExtentReports extent;
	
	public static ExtentReports getReportObject()
	{
	
		
	String path =  System.getProperty("user.dir")+"\\ExtentReports\\index.html";
	
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation Result");
	reporter.config().setDocumentTitle("Test Result");
	
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Rucha Kopulwar");
	
	return extent;
	
	}

	
	public void initializeAllMethods() throws IOException {
		
		
		driver = initializeDriver();
		driver.get(pro.getProperty("url"));
	}
}
