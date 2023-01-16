package TaskAssigned;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test04
{
	@Test
	public void Test_04_validate_loginfunction_withinvaliddata()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver.exe"); //invoking chrome browser
		WebDriver driver = new ChromeDriver(); //creating an object for the driver
		driver.get("https://magento.softwaretestingboard.com/");//open website
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();//click on signin button
		driver.findElement(By.name("login[username]")).sendKeys("ttambedivyesh@gmail.com");//enter email id
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Divyesh131@#*");//enter password
		
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();//click on sign in button
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText());
		
	}
	
	

}
