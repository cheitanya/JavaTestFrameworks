package login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import steps.LoginStepsWithModularize;
import utili.DriverManager;

/**
 * Created by shivalis on 8/6/17.
 */
public class LoginTestWithModularize {



    @BeforeSuite
    public void verifyBeforeSuite()
    {

        DriverManager manager = new DriverManager();

    }


    @Test
    public void verifyValidLogintoSpree()
    {
        LoginStepsWithModularize loginSteps = new LoginStepsWithModularize();
        String actual_message = loginSteps.Login("xt@xt.com", "xtxtxt");
        Assert.assertEquals(actual_message, "MY ACCOUNT");
    }


    @Test
    public void verifyInvalidLogintoSpree()
    {
        LoginStepsWithModularize loginSteps = new LoginStepsWithModularize();
        String expected_message = loginSteps.InvalidLogin("xt@xt.com", "pass");
        Assert.assertEquals(expected_message, "Invalid email or password.");
    }
}
