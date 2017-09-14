package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utili.DriverManager;

import static utili.DriverManager.driver;

/**
 * Created by shivalis on 8/6/17.
 */
public class LoginStepsWithModularize {







    public String Login(String userName, String password)
    {

        WebElement login_icon = driver.findElement(By.id("link-to-login"));
        login_icon.click();

        WebElement userNameField = driver.findElement(By.id("spree_user_email"));
        userNameField.sendKeys(userName);

        WebElement passWordField = driver.findElement(By.name("spree_user[password]"));
        passWordField.sendKeys(password);

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"new_spree_user\"]/p[2]/input"));
        submitButton.click();

        WebElement myAccountLink = driver.findElement(By.linkText("MY ACCOUNT"));
        String actual = myAccountLink.getText();

        return  actual;
    }

    public String InvalidLogin(String userName, String password) {


        WebElement login_icon = driver.findElement(By.id("link-to-login"));
        login_icon.click();
        WebElement userNameField = driver.findElement(By.id("spree_user_email"));
        userNameField.sendKeys(userName);
        WebElement passWordField = driver.findElement(By.name("spree_user[password]"));
        passWordField.sendKeys(password);
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"new_spree_user\"]/p[2]/input"));
        submitButton.click();

        WebElement invalidLoginText = driver.findElement(By.xpath("//*[@id='content']/div[1]"));

        String actual = invalidLoginText.getText();
     return actual;


    }
}
