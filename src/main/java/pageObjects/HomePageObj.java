package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObj {
	
	WebDriver driver;
	
	By acceptBtn = By.xpath("//button[text()='Accept']");
	By career=By.xpath("//a[@href='/careers/current-openings' and text()='Careers']") ;
	
	By firstLabelOverarching = By.xpath("//div[@class='desk-heading']//h2[@class='heading-marg xs-left-lg-left' and contains(text(),'Overarching Coverage Across')]");
	
	By SearchIcon = By.xpath("//button[@id='srch_button1']");
	By MenuIcon = By.xpath("//nav[@id='block-cybcorp2020-main-menu']/input[@type='checkbox' and @class='toggler']");
	
	By KnowMoreBtn1 = By.xpath("//a[contains(@href,'/digital-product-engineering/product-life-cycle')][text()='KNOW MORE']");
	
	By secondLabelLeverage = By.xpath("//div[@class='desk-heading']//h2[@class='heading-marg xs-left-lg-left' and contains(text(),'LEVERAGE DECISIONMINES')]");
	By KnowMoreBtn2 = By.xpath("//a[contains(@href,'/decision-mines')][text()='KNOW MORE']");
	
	By LabelInsight = By.xpath("//h2[@class='heading-marg']");
	
	By labelInclusivity = By.xpath("//div[@class='desk-heading']//h2[@class='heading-marg xs-left-lg-left home-workspace']");
	By SearchBtn = By.xpath("//div[@class='type_button']//a[text()='SEARCH']");
	
	public HomePageObj(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	public WebElement getAcceptBtn() {
		return driver.findElement(acceptBtn);
	}

	public WebElement getCareers() {
		return driver.findElement(career);
	}
	
	public WebElement getfirstLabelOverarching() {
		return driver.findElement(firstLabelOverarching);
	}

	public WebElement getSearchIcon() {
		return driver.findElement(SearchIcon);
	}
	
	public WebElement getMenuIcon() {
		return driver.findElement(MenuIcon);
	}
	
	public WebElement getKnowMoreBtn1() {
		return driver.findElement(KnowMoreBtn1);
	}
	
	public WebElement getsecondLabelLeverage() {
		return driver.findElement(secondLabelLeverage);
	}
	
	public WebElement getLabelInsight() {
		return driver.findElement(LabelInsight);
	}
	
	public WebElement getlabelInclusivity() {
		return driver.findElement(labelInclusivity);
	}
	
	public WebElement getSearchBtn() {
		return driver.findElement(SearchBtn);
	}

	public WebElement getKnowMoreBtn2() {
		// TODO Auto-generated method stub
		return driver.findElement(KnowMoreBtn2);
	}
}
