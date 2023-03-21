package pom.tests.delona;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.delona.SearchBarPage;
import pom.tests.BaseTest;

public class SearchBarTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {

    }
    @Test
    public void searchWithAvailableProductInfo(){

        String productName = "kavos pupelės";

        Boolean expectedIsProductFound = true;
        Boolean actualIsProductFound;

        SearchBarPage.open();
        SearchBarPage.enterProductInfoIntoSearchBar(productName);
        SearchBarPage.clickSearchButton();

       actualIsProductFound = SearchBarPage.checkIfProductIsFound();

       Assert.assertEquals(actualIsProductFound,expectedIsProductFound);
    }

    @Test
    public void searchWithNonAvailableProductInfo(){

        String textToSearchBar = "grybai";
        String expectedMessage = "Nėra prekės, kuri atitiktų paieškos kriterijus.";
        String actualMessage;

        SearchBarPage.open();
        SearchBarPage.enterProductInfoIntoSearchBar(textToSearchBar);
        SearchBarPage.clickSearchButton();

        actualMessage = SearchBarPage.readDisplayMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

    }


}
