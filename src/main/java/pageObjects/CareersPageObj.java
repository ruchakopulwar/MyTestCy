package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareersPageObj {
	
	public WebDriver driver;
	
	By acceptBtn = By.xpath("//button[text()='Accept']");
	By locationDd = By.xpath("//*[@id='edit-field-job-location-target-id']");
	By keyTxt = By.xpath("//input[@id='edit-key']");
	By GoBtn = By.xpath("//button[@id='edit-submit-current-openings']");
	//By jobFoundMsg = By.xpath("//div[@class='view-header']");
	By jobFoundMsg = By.partialLinkText("Jobs found");
	By FoundLocaton = By.xpath("//div[@class='group-header flag-location']");
	////div[@class='views-row']/div
	By FoudProfile = By.xpath("//h3[@class='js-views-accordion-group-header']");
	
	public CareersPageObj(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getAcceptButton() {
		return driver.findElement(acceptBtn);
	}
	
	public WebElement getLocationDD() {
		return driver.findElement(locationDd);
	}
	
	public WebElement getkeyTxt() {
		return driver.findElement(keyTxt);
	}
	
	public WebElement getGoBtn() {
		return driver.findElement(GoBtn);
	}
	
	public WebElement getjobFoundMsg() {
		return driver.findElement(FoudProfile);
	}
	
	public WebElement getFoundLocaton() {
		return driver.findElement(FoudProfile);
	}
	
	public WebElement getFoudProfile() {
		return driver.findElement(FoudProfile);
	}
}
