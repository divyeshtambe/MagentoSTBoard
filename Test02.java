package TaskAssigned;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 
{

	
	@Test
	public void Test_02_validate_createaccountpage()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver.exe"); //invoking chrome browser
		WebDriver driver = new ChromeDriver(); //creating an object for the driver
		driver.get("https://magento.softwaretestingboard.com/");//open website
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create an Account")).click();//click on create account option
		driver.findElement(By.name("firstname")).sendKeys("Divyesh");//enter first name
		driver.findElement(By.name("lastname")).sendKeys("Tambe");//enter last name
		driver.findElement(By.id("email_address")).sendKeys("divy@gmail.com");//enter email id
		driver.findElement(By.name("password")).sendKeys("Divyesh131@#*");//enter password
		driver.findElement(By.name("password_confirmation")).sendKeys("Divyesh131@#*");//re-enter password confirmation
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();//clicking on create account button
		
		
		
	}
	
	
	
	
	
	
	
}
