package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pom.utilities.Driver;

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

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static String getElementAttributeParameter(String attributeName, By locator) {
        return getElement(locator).getAttribute(attributeName);
    }
    public static void selectOptionByValue(String attributeValue, By locator) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.selectByValue(attributeValue);
    }

    public static void setAttributeValue(By locator, String value){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript(
                "arguments[0].setAttribute(arguments[1],arguments[2])",
                getElement(locator),
                "value",
                value
        );
    }
    }
