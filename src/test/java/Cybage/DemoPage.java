package Cybage;



import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.CareersPageObj;
import pageObjects.DemoPageObj;
import resources.base;

public class DemoPage extends base{
	
	public WebDriver driver;
	
	@BeforeTest
	public void initializeAllMethods() throws IOException {
		driver = initializeDriver();
		driver.get(pro.getProperty("HomeUrl"));
	}
	
	@Test
	public void assertDemo() throws IOException
	{
		
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		DemoPageObj l = new DemoPageObj(driver);
		l.getAcceptBtn().click();
		String firstLabel= l.getCareers().getText();
		System.out.println(firstLabel);
		Assert.assertEquals(firstLabel, "Careers");
		
		Boolean check = l.getCareers().isDisplayed();
		Assert.assertTrue(check);
		
		//Assert.assertTrue(false);
		driver.close();
		
	}

	@Test(enabled = false, dataProvider = "getData")
	public void basePagenavigation(String location , String jobProfile , String Msg ) throws IOException {
		
				
		DemoPageObj l = new DemoPageObj(driver);
		
		l.getAcceptBtn().click();
		
		l.getCareers().click();
		
		
		
		CareersPageObj c = new CareersPageObj(driver);
		
		WebElement DDList = c.getLocationDD();
		
		//JS code to scroll
				JavascriptExecutor js= (JavascriptExecutor)driver;
				//js.executeScript("arguments[0].scrollIntoView();", DDList);
				//js.executeScript("arguments[0].scrollIntoView(true);",DDList);
				//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",DDList);
				js.executeScript("window.scrollBy(0,500)");
		Select sel = new Select(DDList);
		
		sel.selectByVisibleText(location);
		
		c.getkeyTxt().sendKeys(jobProfile);
		
		c.getGoBtn().click();
		
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		
		//row = how many diff data types test should run
		//col= how many value per each test
		data[0][0]="INDIA";
		data[0][1]="Magento Developer";
		data[0][2]="for india's job";
		
		data[1][0]="USA";
		data[1][1]="Programmer Analyst";
		data[1][2]="for USA's Job";
		
		
//		Object[][] data = new Object[1][2];
//		data[0][0]="USA";
//		data[0][1]="Programmer Analyst";
		
		return data;
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
	
	
}
