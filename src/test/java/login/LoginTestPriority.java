package login;

import org.testng.annotations.Test;

/**
 * Created by shivalis on 8/6/17.
 */
public class LoginTestPriority {


    @Test(groups = {"smoke"}, priority = 2)
    public void verifyValidLogintoSpree()
    {

        System.out.println("second");
    }


    @Test (groups = {"smoke", "regression"}, priority = 1)
    public void verifyInvalidLogintoSpree()
    {
        System.out.println("first");
    }


}
