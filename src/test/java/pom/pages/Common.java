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

    public static void clickElement(By locator) {
        WebElement element = getElement(locator);
        element.click();
    }

    public static void sendKeysToElement(String message, By locator) {
        WebElement element = getElement(locator);
        element.sendKeys(message);
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static String getElementAttributeParameter(String attributeName, By locator) {
        return getElement(locator).getAttribute(attributeName);
    }
}
