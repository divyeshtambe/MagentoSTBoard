package TaskAssigned;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test03
{

	@Test
	public void Test_03_validate_loginfunction_withvaliddata()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver.exe"); //invoking chrome browser
		WebDriver driver = new ChromeDriver(); //creating an object for the driver
		driver.get("https://magento.softwaretestingboard.com/");//open website
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();//click on signin button
		driver.findElement(By.name("login[username]")).sendKeys("divye@gmail.com");//enter email id
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Divyesh131@#*");//enter password
		
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();//click on sign in button
		
	}

	
}
