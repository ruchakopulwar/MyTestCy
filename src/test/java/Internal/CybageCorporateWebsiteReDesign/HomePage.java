package Internal.CybageCorporateWebsiteReDesign;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class HomePage extends base{
	public WebDriver driver;
	@Test
	public void basePagenavigation() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://www.cybage.com/");
	}

}
