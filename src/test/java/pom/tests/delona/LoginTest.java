package pom.tests.delona;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.delona.LoginPage;
import pom.tests.BaseTest;

public class LoginTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open();
    }

    @Test
    public void testLoginWithExistingUserData() {

        String emailAddress = "zaneta.bakanauskiene@gmail.com";
        String password = "vcsbaigiamasis";
        String expectedSurname = "Bakanauskienė";
        String actualSurname;

        LoginPage.openFormMyAccount();

        LoginPage.enterEmailAddress(emailAddress);
        LoginPage.enterPassword(password);
        LoginPage.clickButtonLogIn();

        LoginPage.clickButtonChangeAccountInfo();
        actualSurname = LoginPage.readDisplayText();

        Assert.assertEquals(actualSurname, expectedSurname);
    }

    @Test
    public void testLogInAttemptWithNonExistingAccountInfo() {

        String emailAddress = "kazkas@email.com";
        String password = "password";
        String expectedMessage = "Įspėjimas";
        String actualMessage;

        LoginPage.openFormMyAccount();

        LoginPage.enterEmailAddress(emailAddress);
        LoginPage.enterPassword(password);
        LoginPage.clickButtonLogIn();

        actualMessage = LoginPage.readDisplayAlert();

        Assert.assertTrue(
                actualMessage.contains(expectedMessage),
                String.format("Actual: %s, Expected: %s", actualMessage, expectedMessage)
        );
    }
}
