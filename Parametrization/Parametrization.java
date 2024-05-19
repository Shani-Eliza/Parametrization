package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization 
{
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.google.com/");
	}
	
	@Parameters("search value")
	
	@Test
	public void test(String s)
	{
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(s,Keys.ENTER);
	}
	
	@AfterMethod
	public void after()
	{
		//report
	}
	
	@AfterTest
	public void close()
	{
		//driver.close();
	}
}
