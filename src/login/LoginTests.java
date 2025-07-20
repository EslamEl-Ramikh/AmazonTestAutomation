package login;

import org.testng.annotations.Test;
import amazon.Pages.LoginPage;
import amazon.Pages.PuzzlePage;
import base.BaseTest;

public class LoginTests extends BaseTest {
	
	@Test
	public void TestFailureLogin()
	{	
		
				LoginPage loginPage = homepage.NavigateToLogin();
				loginPage.setEmail("Test@QA.com");
				loginPage.ClickContinue();
				loginPage.setPassword("Test");
				PuzzlePage puzzlePage = loginPage.ClickLoginButton();
				System.out.println(puzzlePage.VerifynextPageAfterPassword());
				
	}

}
