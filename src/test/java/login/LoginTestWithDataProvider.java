package login;

import org.testng.Assert;
import org.testng.annotations.*;
import steps.LoginStepsWithPageObject;
import utili.DriverManager;

/**
 * Created by shivalis on 8/6/17.
 */
public class LoginTestWithDataProvider {

    DriverManager manager;
    @BeforeSuite
    public void verifyBeforeSuite()
    {
       manager = new DriverManager();
    }

    @DataProvider(name = "login")
    public static Object[][] loginData() {

        return new Object[][]
                {{"xt@xt.com", "xtxtxt"}, {"abc@xt.xom", "xtxtxt"}};
    }


    @Test(dataProvider = "login")
    public void verifyValidLogIntoSpreeWithDataProvider(String userName, String password)
    {
        LoginStepsWithPageObject loginSteps = new LoginStepsWithPageObject();
        String expected_message = loginSteps.Login(userName, password);
        Assert.assertEquals(expected_message, "MY ACCOUNT");
    }


    @AfterTest
    public void logout()
    {
        LoginStepsWithPageObject loginSteps = new LoginStepsWithPageObject();
        loginSteps.logOut();
    }

    @AfterSuite
    public void tearDown()
    {

        manager.driver.quit();
    }


}

