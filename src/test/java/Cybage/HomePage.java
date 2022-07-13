package Cybage;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePageObj;
import resources.base;

public class HomePage extends base {
	
	WebDriver driver;
	
	@BeforeTest
	public void initializeBrowse() throws IOException {
		driver = initializeDriver();
		driver.get(pro.getProperty("HomeUrl"));
	
	}
	
	@Test
	public void VerifyCareersLabel() {
		HomePageObj h= new HomePageObj(driver);
		h.getAcceptBtn().click();
		
		boolean displayed = h.getCareers().isDisplayed();
		Assert.assertTrue(displayed);
		
		
		String LabelName = h.getCareers().getText();
		Assert.assertEquals(LabelName, "Careers");
					
	}
	
//	@Test
//	public void VerifyFailCareersLabel() {
//		HomePageObj h= new HomePageObj(driver);
//		h.getAcceptBtn().click();
//		
//		boolean displayed = h.getCareers().isDisplayed();
//		Assert.assertTrue(displayed);
//		
//		
//		String LabelName = h.getCareers().getText();
//		Assert.assertEquals(LabelName, "Career");
//					
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	

}
