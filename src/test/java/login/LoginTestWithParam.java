package login;

import org.testng.Assert;
import org.testng.annotations.*;
import steps.LoginStepsWithPageObject;
import utili.DriverManager;

/**
 * Created by shivalis on 11/20/16.
 */
public class LoginTestWithParam {


    @BeforeSuite
    public void verifyBeforeSuite()
    {
        DriverManager manager = new DriverManager();
    }


    @Test
    @Parameters({"userName", "password"})
    public void verifyValidLogIntoSpree(String userName, String password)
    {
        LoginStepsWithPageObject loginSteps = new LoginStepsWithPageObject();
        String expected_message = loginSteps.Login(userName, password);
        Assert.assertEquals(expected_message, "MY ACCOUNT");

    }

    @Test
    @Parameters({"userName", "password"})
    public void verifyValidLogIntoSpreeTwo(String userName, String password)
    {
        LoginStepsWithPageObject loginSteps = new LoginStepsWithPageObject();
        String expected_message = loginSteps.Login(userName, password);
        Assert.assertEquals(expected_message, "MY ACCOUNT");

    }





   @AfterMethod
   public void logout()
   {
       LoginStepsWithPageObject loginSteps = new LoginStepsWithPageObject();
       loginSteps.logOut();
   }
}
