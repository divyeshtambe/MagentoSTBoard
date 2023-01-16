package TaskAssigned;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test05
{
	@Test
	public void Test_05_validate_productselection_and_fillingshippingdetails() throws AWTException, Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\\\ABC\\\\chromedriver.exe"); //invoking chrome browser
		WebDriver driver = new ChromeDriver(); //creating an object for the driver
		
		//go to website
		driver.get("https://magento.softwaretestingboard.com/");//open website
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		//login with valid data
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();//click on signin button
		driver.findElement(By.name("login[username]")).sendKeys("divy@gmail.com");//enter email id
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Divyesh131@#*");//enter password
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();//click on sign in button
		
		//search product
		driver.findElement(By.id("search")).sendKeys("bag for men");
		driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button")).click();//click on search option
		
		//select product and add to cart + proceed to checkout
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[6]/div/a/span/span/img")).click();
		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();//not wrk
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		
		//filling shipping details + final submit order
		driver.findElement(By.name("company")).sendKeys("JForce solutions");
		driver.findElement(By.name("street[0]")).sendKeys("vileparle_west");
		driver.findElement(By.name("city")).sendKeys("mumbai");
		WebElement ele = driver.findElement(By.name("region_id"));
		Select obj = new Select(ele);
		obj.selectByVisibleText("Indiana");
		
		driver.findElement(By.name("postcode")).sendKeys("400706-12345-001");
		
		WebElement ele2 = driver.findElement(By.name("country_id"));
		Select obj2 = new Select(ele2);
		obj2.selectByVisibleText("United States");
		
		driver.findElement(By.name("telephone")).sendKeys("9137004058");
		
		driver.findElement(By.name("ko_unique_3")).click();
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();//click on next and come to final page

		//final submit button code by pressing enter
		Robot rb = new Robot();
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
				
	}
	
	
}
