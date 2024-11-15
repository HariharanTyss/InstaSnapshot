package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sravanthi {
	public static WebDriver driver;
	
	@BeforeClass
	public void browserSetup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterClass
	public void browserTerminate() {
		driver.close();
	}
	@BeforeMethod
	public void login() {
	
	}
	@AfterMethod
	public void logout()
	{
	    driver.findElement(By.linkText("Sign Out")).click();
	}
	@Test(enabled=false)
	public void register() {
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	    driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.linkText("Register Now!")).click();
	    driver.findElement(By.name("username")).sendKeys("sravanthi");
	    driver.findElement(By.name("password")).sendKeys("sravs@12345");
	    driver.findElement(By.name("repeatedPassword")).sendKeys("sravs@12345");
	    driver.findElement(By.name("account.firstName")).sendKeys("sravanthi");
	    driver.findElement(By.name("account.lastName")).sendKeys("kadari");
	    driver.findElement(By.name("account.email")).sendKeys("ksravanthi8978@gmail.com");
	    driver.findElement(By.name("account.phone")).sendKeys("9390255058");
	    driver.findElement(By.name("account.address1")).sendKeys("hno : 41-233,sanjaipuri colony");
	    driver.findElement(By.name("account.address2")).sendKeys("jagathgirigutta");
	    driver.findElement(By.name("account.city")).sendKeys("Hyderabad");
	    driver.findElement(By.name("account.state")).sendKeys("Telangana");
	    driver.findElement(By.name("account.zip")).sendKeys("500037");
	    driver.findElement(By.name("account.country")).sendKeys("India");
	    driver.findElement(By.name("newAccount")).click();
	    
	}
	
	
}
