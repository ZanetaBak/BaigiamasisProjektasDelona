package pom.pages.delona;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pom.pages.Common;
import pom.pages.Locators;

public class SearchBarPage {

    public static void open() {
        Common.setChromeDriver();
        Common.openUrl("https://www.delona.lt/");
    }

    public static void enterProductInfoIntoSearchBar(String product) {
        Common.sendKeysToElement(
                product, Locators.Delona.SearchBarInput.inputFieldAddress
        );
    }

    public static void clickSearchButton() {
        Common.clickElement(Locators.Delona.SearchBarInput.buttonSearch);
    }

    public static Boolean checkIfProductIsFound() {

        try {
            WebElement product = Common.getElement(Locators.Delona.SearchBarOutput.outputProduct);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public static String readDisplayMessage() {

        return Common.getTextFromElement(Locators.Delona.SearchBarOutput.outputMessageNoProductAsked);
    }
}
