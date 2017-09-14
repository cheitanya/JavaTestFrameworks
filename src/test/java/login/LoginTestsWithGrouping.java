package login;

import org.testng.annotations.Test;

/**
 * Created by shivalis on 11/19/16.
 */
public class LoginTestsWithGrouping {

    @Test(groups = {"smoke"})
    public void verifyValidLogintoSpree()
    {

        System.out.println("second");
    }


    @Test (groups = {"smoke", "regression"})
    public void verifyInvalidLogintoSpree()
    {
        System.out.println("first");
    }



}
