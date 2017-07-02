package Demo;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {
	
	WebDriver driver;
	//Demo for github
	@Test
	
	public void open_url()
	{
	
	driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.co.uk/");
			
	driver.getTitle();
System.out.println(driver.getTitle());
	
	}
}
