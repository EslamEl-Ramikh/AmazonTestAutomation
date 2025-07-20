package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import amazon.Pages.HomePage;
import login.LoginTests;

public class BaseTest {

	protected HomePage homepage;
	public LoginTests login;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EslamElRamikh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.eg/-/en/ref=nav_logo");
		homepage = new HomePage(driver);
		
	}
	
	
	
}
