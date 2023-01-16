package TaskAssigned;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewTask
{

	@Test
	public void Test_01_validate_websiteurl()
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\ABC\\chromedriver.exe"); //invoking chrome browser
		WebDriver driver = new ChromeDriver(); //creating an object for the driver
		driver.get("https://magento.softwaretestingboard.com/");//open website
	
	
	}
	
	
	
	
	
}
