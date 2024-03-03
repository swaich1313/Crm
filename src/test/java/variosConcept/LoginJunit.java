package variosConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
   
public class LoginJunit {
	 WebDriver driver;

@Before
	public  void init() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\swaic\\eclipse-selenium\\session3a\\driver\\chromedriver.exe" );

		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
	

		driver.get("https://codefios.com/ebilling/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
   @Test
public void positiveLogin() {
	 //  driver.findElements(By.xpath("//*[@id=\"user_name\"]")).
   }
	

	@After
	public  void closebrowser() {
		driver.close();
	}


	
	
	
	
}
