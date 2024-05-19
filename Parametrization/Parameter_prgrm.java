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

public class Parameter_prgrm 
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
	
	@Parameters("search value1")
	@Test
	public void test1(String p)
	{
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(p,Keys.ENTER);
	}
	
	@Parameters("search value2")
	@Test
	public void test2(String q)
	{
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(q,Keys.ENTER);
	}
	
	@Parameters("search value3")
	@Test
	public void test3(String r)
	{
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(r,Keys.ENTER);
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
