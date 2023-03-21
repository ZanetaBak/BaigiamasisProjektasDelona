package pom.pages.delona;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pom.pages.Common;
import pom.pages.Locators;

public class AddItemToCartPage {

    public static void openProductPage() {
        Common.setChromeDriver();
        Common.openUrl("https://www.delona.lt/ciberzole");
    }

    public static void selectProductWeight(String attributeValue) {

        Common.selectOptionByValue(
                attributeValue,
                Locators.Delona.AddToCartInputs.selectTurmericWeight
        );
    }

    public static void selectProductQuantityByUnits(String units) {

        Common.setAttributeValue(
                Locators.Delona.AddToCartInputs.inputProductUnits,
                units
        );
    }

    public static void clickButtonAddToCart() {
        Common.clickElement(Locators.Delona.AddToCartInputs.buttonAddToCart);
    }

    public static void clickButtonGoToCart() {
        Common.clickElement(Locators.Delona.AddToCartInputs.buttonGoToCart);
    }

    public static Boolean checkIfProductIsInCart() {
        try {
            WebElement product = Common.getElement(Locators.Delona.CartContent.turmericLine);
        } catch
        (NoSuchElementException e) {
            return false;
        }
        return true;
    }
}
