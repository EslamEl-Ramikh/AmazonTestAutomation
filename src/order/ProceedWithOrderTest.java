package order;

import org.testng.annotations.Test;

import amazon.Pages.HomePage;
import amazon.Pages.VideoGamesPage;
import base.BaseTest;

public class ProceedWithOrderTest extends BaseTest{
	
	
	@Test
	public void NavigateToVideoGames()
	{	
		VideoGamesPage videogamespage = homepage.NavigateToVideoGames();
		
	}

}
