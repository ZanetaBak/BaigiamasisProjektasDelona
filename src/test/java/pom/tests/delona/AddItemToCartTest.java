package pom.tests.delona;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.delona.AddItemToCartPage;
import pom.tests.BaseTest;

public class AddItemToCartTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
    }

    @Test
    public void testAddItemToCart() {

        String attributeValueWeight = "2";
        String attributeValueUnits = "5";
        Boolean expectedProductIsInCart = true;
        Boolean actualProductIsInCart;

        AddItemToCartPage.openProductPage();
        AddItemToCartPage.selectProductWeight(attributeValueWeight);
        AddItemToCartPage.selectProductQuantityByUnits(attributeValueUnits);

        AddItemToCartPage.clickButtonAddToCart();
        AddItemToCartPage.clickButtonGoToCart();

        actualProductIsInCart = AddItemToCartPage.checkIfProductIsInCart();

        Assert.assertEquals(actualProductIsInCart, expectedProductIsInCart);

    }
}
