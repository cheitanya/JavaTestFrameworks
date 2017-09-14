package steps;

import org.openqa.selenium.support.PageFactory;
import page_objects.HomePage;
import page_objects.LoginPage;
import utili.DriverManager;

/**
 * Created by shivalis on 11/20/16.
 */
public class LoginStepsWithPageObject {

    HomePage homePage;
    LoginPage loginPage;


    public LoginStepsWithPageObject()
    {
         homePage = PageFactory.initElements(DriverManager.driver, HomePage.class);
         loginPage = PageFactory.initElements(DriverManager.driver, LoginPage.class);

    }

    public String Login(String userName, String password)
    {

        homePage.clickOnLoginLink();
        loginPage.enterUsername(userName);
        loginPage.enterPassword(password);
        loginPage.clickSubmit();
        return homePage.getMyAccountText();
    }


    public String InvalidLogin(String userName, String password) {

        homePage.clickOnLoginLink();
        loginPage.enterUsername(userName);
        loginPage.enterPassword(password);
        loginPage.clickSubmit();
        return loginPage.getInvalidLoginText();
    }

    public void logOut() {
        HomePage homePage = PageFactory.initElements(DriverManager.driver, HomePage.class);
        homePage.clickLogOut();
    }
}
