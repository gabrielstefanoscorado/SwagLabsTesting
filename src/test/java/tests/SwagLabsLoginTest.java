package tests;
import generic.TestEnvConfig;
import generic.Users;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.SwagLabsLoginPage;

public class SwagLabsLoginTest extends TestEnvConfig {

    private WebDriver driver;

    private String swagLabsTitle = "Products";

    private SwagLabsLoginPage swagLabsLoginPage;

    @BeforeMethod()
    public void init(){
        swagLabsLoginPage = PageFactory.initElements(driver, SwagLabsLoginPage.class);
    }

    @Test
    public void LoginSuccess(){
        swagLabsLoginPage.loginSwagLabs(Users.STANDARD_USER, Users.PASSWORD_FOR_ALL_USERS);
        Assert.assertEquals(swagLabsLoginPage.getTitleOfSwagLabs(), swagLabsTitle);
    }

}
