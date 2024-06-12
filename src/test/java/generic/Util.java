package generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Util {
    public static void clickElement(WebDriver driver, WebElement element) {
        Duration duration = Duration.ofSeconds(SleepTime.THIRTY_SEC);
        new WebDriverWait(driver, duration).until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static String getText(WebDriver driver, WebElement element) {
        Duration duration = Duration.ofSeconds(SleepTime.THIRTY_SEC);
        return new WebDriverWait(driver, duration).until(ExpectedConditions.visibilityOf(element)).getText();
    }


}
