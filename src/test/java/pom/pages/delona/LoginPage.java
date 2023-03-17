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


    public static void openFormManoPaskyra() {
        Common.clickElement(Locators.Delona.HomePage.buttonManoPaskyra);
    }
}

