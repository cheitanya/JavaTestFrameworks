package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by shivalis on 11/19/16.
 */
public class LoginPage {

    @FindBy(id= "spree_user_email")
    WebElement user;

    @FindBy(id="spree_user_password")
    WebElement password;

    @FindBy(name = "commit")
    WebElement submit;

    @FindBy(xpath = "//*[@id='content']/div[1]")
    WebElement invalidEmail;

    public void enterUsername(String userName)
    {
        user.sendKeys(userName);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickSubmit() {
        submit.click();
    }

    public String getInvalidLoginText() {
        return invalidEmail.getText();
    }


}
