package pom.tests.delona;


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

        LoginPage.openFormManoPaskyra();

    }

}
