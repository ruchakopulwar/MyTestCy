package Cybage;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.CareersPageObj;
import resources.base;

public class CareersPage extends base{
	
	public WebDriver driver;
	
	@BeforeTest
	public void initializeAllMethods() throws IOException {
		driver = initializeDriver();
		System.out.println("Browser is initialized");
		driver.get(pro.getProperty("CareersUrl"));
	}
	
	@Test(dataProvider = "getData")
	public void searchJob(String location , String JobProfile , String jobMsg) throws IOException, InterruptedException {
					
		CareersPageObj c = new CareersPageObj(driver);
		
		c.getAcceptButton().click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement DDList = c.getLocationDD();
		Select sel = new Select((WebElement) DDList);
		sel.selectByVisibleText(location);
		
		c.getkeyTxt().sendKeys(JobProfile);
		
		c.getGoBtn().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][3];
		
		data[0][0]="USA";
		data[0][1]="Programmer Analyst";
		data[0][2]="for USA's job";
		
//		data[1][0]="INDIA";
//		data[1][1]="Magento Developer";
//		data[1][2]="for india's Job";
		
		
		return data;
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

}
