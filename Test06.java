package TaskAssigned;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test06
{

	@Test
	public void Test_05_validate_productselection_and_fillingshippingdetails()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver.exe"); //invoking chrome browser
		WebDriver driver = new ChromeDriver(); //creating an object for the driver
		
		//go to website
		driver.get("https://magento.softwaretestingboard.com/checkout/#payment");//open website
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
		
	}
	
	
	
	
	
	
}
