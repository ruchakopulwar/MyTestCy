package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public Properties pro;
	//int x , y;
	
	@SuppressWarnings("deprecation")
	public WebDriver initializeDriver() throws IOException
	{
		
		pro = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Selenium workspace\\eclipse-workspace\\CybageCorporateWebsiteReDesign\\src\\main\\java\\resources\\data.properties");	 
		pro.load(fis);
		
		String browserName =pro.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium workspace\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox") )
		{
			System.setProperty("webdriver.gecko.driver","D:\\Selenium workspace\\Selenium Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\HPSInstall\\Downloads\\SelenimDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
	
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	}

	
	public String getScreenShoot(String testCaseName , WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\SreenshootReports\\"+testCaseName+".png";
		File dest = new File(destinationFile);
		 
		FileUtils.copyFile(src , dest);
		
		return destinationFile;
	}
	
	public void getScrolled(int x ,int y , WebDriver Scrolldriver) {
		JavascriptExecutor js = (JavascriptExecutor) Scrolldriver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
}
