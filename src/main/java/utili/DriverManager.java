package utili;

import org.eclipse.jetty.util.component.ContainerLifeCycle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by shivalis on 11/20/16.
 */
public class DriverManager {

    public static WebDriver driver;

    public DriverManager()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/cheitanb/Documents/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



}
