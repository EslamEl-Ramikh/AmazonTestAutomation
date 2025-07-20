package amazon.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PuzzlePage {
	
	private WebDriver driver;
	private By errorAuthenticationMessage = By.id("auth-error-message-box");
	private By PuzzleDIV = By.id("aacb-waf-box");
	public PuzzlePage (WebDriver driver)
	{
		this.driver = driver;
	}

	

	public String VerifynextPageAfterPassword()
	{
			if(driver.findElement(PuzzleDIV).isDisplayed())
			{
				return driver.findElement(PuzzleDIV).getText();
			}
			else
			{
				return driver.findElement(errorAuthenticationMessage).getText();
			}
		
		
	}
	
	/*
	public String VerifyErrorAuthenticationMessage()
	{
		return driver.findElement(errorAuthenticationMessage).getText();
		
	}
	
	public String VerifyPuzzleDIV()
	{
		return driver.findElement(PuzzleDIV).getText();
		
	}
	*/
}
