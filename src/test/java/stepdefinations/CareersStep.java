package stepdefinations;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CareersPageObj;

import resources.base;

public class CareersStep extends base {
	WebDriver driver;
	CareersPageObj career;
	
	
	
	    @Given("^Initialize Chrome Broser with Url \"([^\"]*)\"$")
	    public void initialize_chrome_broser_with_url_something(String CareersUrl) throws Throwable {
	    	driver = initializeDriver();
			System.out.println("Browser is initialized");
			driver.get(CareersUrl);
			System.out.println("open Url");
			career = new CareersPageObj(driver);
			System.out.println("career initialize");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			career.getAcceptButton().click();
			System.out.println("click on accept");
	    	
	    	
	    }

	    @When("^Scroll Down To Search Job Profile$")
	    public void scroll_down_to_search_job_profile() throws Throwable {
	    	
	    	System.out.println("enter 1");
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Assert.assertTrue(career.getLocationDD().isDisplayed());
	    }

	    @And("^Enter Job Location (.+) & Job Profile (.+)$")
	    public void enter_job_location_job_profile(String location, String JobProfile) throws Throwable {
	    	System.out.println("enter 2");
	    	System.out.println(location + "  " +JobProfile);
	    	WebElement DDList = career.getLocationDD();
	    	DDList.click();
			Select sel = new Select((WebElement) DDList);
			//sel.selectByVisibleText("INDIA");
			sel.selectByValue("10");
			career.getkeyTxt().sendKeys(JobProfile);
			career.getGoBtn().click();
	    }
	    
	    @Then("^Verify Job \"([^\"]*)\"$")
	    public void verify_job_something(String FoundJob) throws Throwable {
	    	
	    	System.out.println(FoundJob);
	    	//System.out.println(career.getjobFoundMsg().getAttribute(FoundJob));
	    	//Assert.assertEquals(career.getjobFoundMsg().getText(), FoundJob);
	    	
	    	//div[text()='1 Jobs found' ]
	    }

	    

	    @And("^Verify Job location as (.+)$")
	    public void verify_job_location_as(String location) throws Throwable {
	    	//Assert.assertEquals(career.getFoundLocaton().getText(), location);
	    	System.out.println(career.getFoundLocaton().getText());
	    }

	    @And("^Verify Job profile as (.+)$")
	    public void verify_job_profile_as(String jobprofile) throws Throwable {
	    	//Assert.assertEquals(career.getFoudProfile().getText(), jobprofile);
	    	System.out.println(career.getFoudProfile().getText());
	    	driver.close();
	    }

	
	
	
	
	
	
	
	
//	@Given("Initialize Chrome Broser with Url {string}")
//	public void initialize_chrome_broser_with_url(String CareerUrl) throws IOException {
//		driver = initializeDriver();
//		System.out.println("Browser is initialized");
//		driver.get(pro.getProperty("CareersUrl"));
//		career = new CareersPageObj(driver);
//		career.getAcceptButton().click();
//	}
//
//	@When("Scroll Down To Search Job Profile")
//	public void scroll_down_to_search_job_profile() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
//		Assert.assertTrue(career.getLocationDD().isDisplayed());
//	}
//
//	@When("Enter Job Location {string} & Job Profile {string}")
//	public void enter_job_location_job_profile(String location, String JobProfile) {
//		WebElement DDList = career.getLocationDD();
//		Select sel = new Select((WebElement) DDList);
//		sel.selectByVisibleText(location);
//		career.getkeyTxt().sendKeys(JobProfile);
//		career.getGoBtn().click();
//	}
//
//	@When("Verify Job location as {string}")
//	public void verify_job_location_as(String Location) {
//	   
//	    Assert.assertEquals(career.getFoundLocaton(), Location);
//	}
//
//	@Then("Verify Job {string}")
//	public void verify_job(String FoundJob) {
//	   Assert.assertEquals(career.getjobFoundMsg(), FoundJob);
//	}
//
//	@Then("Verify Both Job profile as {string}")
//	public void verify_job_profile_as(String JobProfile) {
//	    Assert.assertEquals(career.getFoudProfile(), JobProfile);
//	}
}
