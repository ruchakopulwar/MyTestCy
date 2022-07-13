package stepdefinations;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObj;
import resources.base;

public class HomeStep extends base {
	
WebDriver driver;
HomePageObj home ;

	
	
	@Given("Initialize Browser with Chrome {string}")
	public void initialize_browser_with_chrome(String HomeUrl) throws IOException {
		driver = initializeDriver();
		//driver.get(pro.getProperty("HomeUrl"));
		
		driver.get(HomeUrl);
		home= new HomePageObj(driver);
		home.getAcceptBtn().click();
	}

	@And("Verify Home page title {string}")
	public void verify_home_page_title(String ExpetHomeTitle) {
		String HomeTitle = driver.getTitle();
		Assert.assertEquals(HomeTitle, ExpetHomeTitle);
	
	}

	@And("Verify carrier Label should be {string}")
	public void verify_carrier_label_should_be(String ExptCareerLabel) {
		boolean displayed = home.getCareers().isDisplayed();
		Assert.assertTrue(displayed);
		
		
		String LabelName = home.getCareers().getText();
		Assert.assertEquals(LabelName, ExptCareerLabel);
	}

	@When("Click on carrier page")
	public void click_on_carrier_page() {
		home.getCareers().click();
	}

	@Then("Verify Carrier page title {string}")
	public void verify_carrier_page_title(String ExptCareerTitle) {
	    
		//home.getCareers().click();
		
		String careerTitle= driver.getTitle();
		Assert.assertEquals(careerTitle, ExptCareerTitle);
		//driver.close();
	}
	
	
	@Then("Close Chrome Browser")
	public void close_chrome_browser() {
	    driver.close();
		//System.out.println("Browser closed");
	}
	

	
	
	//2nd scenario 
	@Given("Verify Search icon")
	public void verify_search_icon() {
	    Assert.assertTrue(home.getSearchIcon().isDisplayed()," display msg" );
	    Assert.assertTrue(home.getSearchIcon().isEnabled());
	    
	    System.out.println("Search icon is Displayed" +home.getSearchIcon().isDisplayed());
	    System.out.println("Search icon is Enabled "+home.getSearchIcon().isEnabled());
	}

	@Given("Verify Menu icon")
	public void verify_menu_icon() {
	   // Assert.assertTrue(home.getMenuIcon().isDisplayed());
	    Assert.assertTrue(home.getMenuIcon().isEnabled());
	}

	@Then("Verify first lable {string}")
	public void verify_first_lable(String firstLabelOverarching) {
		
		getScrolled(0, 445 , driver);
		Assert.assertEquals(home.getfirstLabelOverarching().getText(), firstLabelOverarching);
	    System.out.println(" lable   ="+home.getfirstLabelOverarching().getText());
	}

	@Then("Verify First button {string}")
	public void verify_first_button(String KnowMoreBtn) {
	   System.out.println("button Name = " +home.getKnowMoreBtn1().getText());
	   Assert.assertEquals(home.getKnowMoreBtn1().getText(), KnowMoreBtn);
	}
	
	@When("Verify second label {string}")
	public void verify_second_label(String string) {
		
		getScrolled(0, 430 , driver);
	    System.out.println("2 label  =" +home.getsecondLabelLeverage().getText());
	}

	
	@Then("Verify Second button {string}")
	public void verify_second_button(String KnowMoreBtn) {
		System.out.println("button Name = " +home.getKnowMoreBtn2().getText());
		   Assert.assertEquals(home.getKnowMoreBtn2().getText(), KnowMoreBtn);
	}
	
	@When("Verify INSIGHTS panel Label {string}")
	public void verify_insights_panel_label(String LabelInsight) {
		getScrolled(0, 540 , driver);
		Assert.assertEquals(home.getLabelInsight().getText(), LabelInsight, "Matched Label");
		//System.out.println(home.getLabelInsight().getText());
	}
	
	
	@Given("Verify Panel INCLUSIVITY DEFINES label {string}")
	public void verify_panel_inclusivity_defines_label(String labelInclusivity) {

		getScrolled(0,2450,driver);
		
		//Assert.assertEquals(home.getlabelInclusivity().getText(), labelInclusivity);
		System.out.println(home.getlabelInclusivity().getText());
		System.out.println("labelInclusivity ="+labelInclusivity );
	}

	@When("Verify INCLUSIVITY DEFINES Button {string}")
	public void verify_inclusivity_defines_button(String labelInclusivity) {
	    Assert.assertEquals(home.getSearchBtn().getText(), labelInclusivity, "Matched Button search");
	}
	
	
	
}
	
	
	
