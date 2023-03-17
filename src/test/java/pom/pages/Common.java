package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pom.utilities.Driver;

import java.util.List;

public class Common {

    public static void setChromeDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeChromeDriver() {
        Driver.closeDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void sendKeysToElement(String message, By locator) {
        WebElement element = getElement(locator);
        element.sendKeys(message);
    }

    public static void clickElement(By locator) {
        WebElement element = getElement(locator);
        element.click();
    }
}
