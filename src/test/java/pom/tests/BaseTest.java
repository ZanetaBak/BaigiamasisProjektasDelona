package pom.tests;


import org.testng.annotations.*;
import pom.pages.Common;
import pom.utilities.TestListener;

@Listeners(TestListener.class)

public abstract class BaseTest {
    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown() {
        Common.closeChromeDriver();
    }
}

