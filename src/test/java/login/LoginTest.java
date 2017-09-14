package login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import steps.LoginStepsWithPageObject;
import utili.DriverManager;

/**
 * Created by shivalis on 11/19/16.
 */
public class LoginTest {

    public static WebDriver driver;

    @BeforeSuite(groups = {"global"})
    public void verifyBeforeSuite()
    {

        DriverManager manager = new DriverManager();
    }



    @Test
    public void verifyValidLogintoSpree()
    {
        LoginStepsWithPageObject loginSteps = new LoginStepsWithPageObject();
        String expected_message = loginSteps.Login("xt@xt.com", "xtxtxt");
        Assert.assertEquals(expected_message, "MY ACCOUNT");
    }


    @Test
    public void verifyInvalidLogintoSpree()
    {
        LoginStepsWithPageObject loginSteps = new LoginStepsWithPageObject();
        String expected_message = loginSteps.InvalidLogin("xt@xt.xom", "xtxtxt");

        Assert.assertEquals(expected_message, "Invalid email or password.");
    }



}


