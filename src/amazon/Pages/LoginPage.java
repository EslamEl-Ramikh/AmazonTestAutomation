package amazon.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, 15);
	private By EmailInputField = By.id("ap_email_login");
	private By ContinueButton = By.id("continue");
	private By PasswordInputField = By.xpath("//*[@id=\"ap_password\"]");
	private By SubmitButton = By.id("signInSubmit");
	
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}

	public void setEmail(String email)
	{
		driver.findElement(EmailInputField).sendKeys(email);
	}
	
	public void ClickContinue()
	{
		driver.findElement(ContinueButton).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void setPassword(String password)
	{
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(PasswordInputField)));
		driver.findElement(PasswordInputField).sendKeys(password);
		
	}
	
	public PuzzlePage ClickLoginButton ()
	{
		driver.findElement(SubmitButton).click();
		return new PuzzlePage(driver);
	}
	
}
