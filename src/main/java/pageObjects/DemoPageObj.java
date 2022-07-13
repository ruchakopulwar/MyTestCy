package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoPageObj {
	
	public WebDriver driver;
	
	//By acceptBtn = By.xpath("//button[text()='Accept']/parent:://div[@id='popup-buttons']");
	By acceptBtn = By.xpath("//button[text()='Accept']");
	By career=By.xpath("//a[@href='/careers/current-openings' and text()='Careers']") ;
	
	By firstLabel = By.xpath("//*[text()='Overarching Coverage Across ']");
	
	public DemoPageObj(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	public WebElement getAcceptBtn() {
		return driver.findElement(acceptBtn);
	}

	public WebElement getCareers() {
		return driver.findElement(career);
	}
	
	public WebElement getfirstLabel() {
		return driver.findElement(firstLabel);
	}

}
