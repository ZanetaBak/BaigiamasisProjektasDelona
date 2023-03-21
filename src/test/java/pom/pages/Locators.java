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

        public class SearchBarInput {

            public static By inputFieldAddress = By.xpath("//input[@name='search']");

            public static By buttonSearch = By.xpath("//i[@class='fa fa-search']");
        }

        public class SearchBarOutput {

            public static By outputMessageNoProductAsked = By.xpath("//p[contains(text(),'Nėra')]");
            public static By outputProduct = By.xpath(
                    "//div[@id='content']//img[contains(@title,'kava')]"
            );
        }

        public class AddToCartInputs {

            public static By selectTurmericWeight = By.xpath("//select[@name='option[1]']");
            public static By inputProductUnits = By.xpath("//input[@id='input-quantity']");
            public static By buttonAddToCart = By.xpath("//button[@id='button-cart']");
            public static By buttonGoToCart = By.xpath("//a[@class='btn-cartpopup cartpopupcart']");
        }

        public class CartContent {

            public static By turmericLine = By.xpath(
                    "//div[@class='cart_list_name']//*[text()='Ciberžolė']"
            );
        }
    }
}
