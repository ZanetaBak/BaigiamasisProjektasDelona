package pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Delona {


        public static class HomePage {

            public static By buttonMyAccount = By.xpath("//a[@title='Mano paskyra']");
        }


        public static class LoginInfo {

            public static By inputEmailAddress = By.xpath("//input[@name='email']");

            public static By inputPassword = By.xpath("//input[@name='password']");

            public static By buttonLogIn = By.xpath("//input[@value='Prisijungti']");

            public static By displayAlertMessage = By.xpath(
                    "//div[@class='alert alert-danger alert-dismissible']"
            );
        }


        public static class AccountInformation {

            public static By buttonChangeAccountInfo = By.xpath(
                    "//*[@id='content']/ul[1]/li[1]/a"
            );

            public static By displaySurname = By.xpath(
                    "//input[@value='Bakanauskienė' and @id='input-lastname']"
            );
        }
    }
}
