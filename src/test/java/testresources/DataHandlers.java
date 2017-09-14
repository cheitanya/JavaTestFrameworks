package testresources;

import org.testng.annotations.DataProvider;

/**
 * Created by shivalis on 11/20/16.
 */
public class DataHandlers {

    @DataProvider(name = "login")
    public static Object[][] loginData() {

        return new Object[][] {{"xt@xt.com", "xtxtxt"}, {"xt@xt.xom", "xtxtxt"}};
    }


}
