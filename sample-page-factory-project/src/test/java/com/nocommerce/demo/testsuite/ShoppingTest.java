package com.nocommerce.demo.testsuite;

import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.pages.ShoppingCart;
import com.nocommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {

    @Test (groups = "regression")
    public void userShouldNavigateToShoppingTestSuccessfully() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.clickOnShoppingCart();
        String expectedText = "Shopping cart";
        Assert.assertEquals(shoppingCart.verifyWelcomeText(), expectedText);
    }
}
