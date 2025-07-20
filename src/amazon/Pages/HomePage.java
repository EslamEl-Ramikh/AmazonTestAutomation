package amazon.Pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class HomePage {
	private WebDriver driver;
	private By AccountDIV = By.xpath("//*[@id=\"nav-link-accountList\"]/a");
	private By LeftMenuIcon = By.id("nav-hamburger-menu");
	private By SeeAllCategoriesLink = By.xpath("//a[@aria-label='See All Categories']"); 
	private By VideoGamesCategoryLink = By.xpath("//a[@role='button']//div[contains(text(),'Video Games')]");
	private By AllVideoGamesLink = By.xpath("(//a[normalize-space()='All Video Games'])[1]");
	private By VideoGamesSpan = By.xpath("//b[normalize-space()='Video Games']");
	
	
	
	public HomePage (WebDriver driver)

	{
		this.driver = driver;
	}
	
	
	



	public LoginPage NavigateToLogin()
	{
			driver.findElement(AccountDIV).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			return new LoginPage(driver);
		

	}
	
	public VideoGamesPage NavigateToVideoGames()
	{
		

				driver.findElement(LeftMenuIcon).click();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.findElement(SeeAllCategoriesLink).click();
				//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				driver.findElement(VideoGamesCategoryLink).click();
				driver.findElement(AllVideoGamesLink).click();
				
				if(driver.findElement(VideoGamesSpan).isDisplayed())
				{
					System.out.println("Reached Video Games Page Successfully");
				}
			
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				return new VideoGamesPage(driver);
		

	}
	
	

}
