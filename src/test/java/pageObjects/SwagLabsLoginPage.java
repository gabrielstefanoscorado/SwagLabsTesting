package pageObjects;

import generic.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabsLoginPage {

    private WebDriver driver;

    @FindBy(id = "user-name")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = "span[class='title']")
    private WebElement swagLabsTitle;

    public SwagLabsLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void loginSwagLabs(String username, String password){
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        Util.clickElement(driver, loginButton);
    }

    public String getTitleOfSwagLabs(){
        String title = Util.getText(driver, swagLabsTitle);
        return title;
    }
}
