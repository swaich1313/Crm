package variosConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	 WebDriver driver;

	public  void main(String[] args) {

		init();
		positivelogin();
		closebrowser();
	}

@Before
	public  void init() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swaic\\eclipse-selenium\\crm\\driver\\chromedriver.exe");
   driver=new ChromeDriver();
		// delete cookies
		driver.manage().deleteAllCookies();
		// launch web site

		driver.get("https://codefios.com/ebilling/login");
		// manage window
		driver.manage().window().maximize();
		// manage time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public  void positivelogin() {

		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();

	}

	@After
	public  void closebrowser() {
		driver.close();
	}

}