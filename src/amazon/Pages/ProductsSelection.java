package amazon.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsSelection {
	private WebDriver driver;
	private By LeftMenuIcon = By.id("nav-hamburger-menu");
	private By SeeAllCategoriesLink = By.xpath("//a[@aria-label='See All Categories']");
	private By VideoGamesCategoryLink = By.xpath("//a[@role='button']//div[contains(text(),'Video Games')]");
	private By AllVideoGamesLink = By.xpath("//a[normalize-space()='All Video Games']");
	private By VideoGamesSpan = By.xpath("//b[normalize-space()='Video Games']");
	
	
	public ProductsSelection (WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void NavigateToVideoGames()
	{
		driver.findElement(LeftMenuIcon).click();
		driver.findElement(SeeAllCategoriesLink).click();
		driver.findElement(VideoGamesCategoryLink).click();
		driver.findElement(AllVideoGamesLink).click();
		if(driver.findElement(VideoGamesSpan).isDisplayed())
		{
			System.out.println("Reached Video Games Page Successfully");
		}
	}

}
