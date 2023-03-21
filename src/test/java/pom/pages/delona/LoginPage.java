package pom.pages.delona;

import pom.pages.Common;
import pom.pages.Locators;

public class LoginPage {

    public static void open() {
        Common.setChromeDriver();
        Common.openUrl("https://www.delona.lt/");
    }

    public static void close() {
        Common.closeChromeDriver();
    }

    public static void openFormMyAccount() {
        Common.clickElement(Locators.Delona.HomePage.buttonMyAccount);
    }

    public static void enterEmailAddress(String text) {
        Common.sendKeysToElement(
                text, Locators.Delona.LoginInfo.inputEmailAddress
        );
    }

    public static void enterPassword(String text) {
        Common.sendKeysToElement(
                text, Locators.Delona.LoginInfo.inputPassword
        );
    }

    public static void clickButtonLogIn() {
        Common.clickElement(Locators.Delona.LoginInfo.buttonLogIn);
    }

    public static void clickButtonChangeAccountInfo() {
        Common.clickElement(Locators.Delona.AccountInformation.buttonChangeAccountInfo);
    }

    public static String readDisplayText() {
        String attributeParameter;
        return attributeParameter = Common.getElementAttributeParameter(
                "value",
                Locators.Delona.AccountInformation.displaySurname
        );
    }

    public static String readDisplayAlert() {
        return Common.getTextFromElement(Locators.Delona.LoginInfo.displayAlertMessage);
    }

}

