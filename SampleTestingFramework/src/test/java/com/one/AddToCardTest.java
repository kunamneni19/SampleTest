package com.one;

import com.one.framework.Browser;
import com.one.framework.WebDriverConfig;
import com.one.ui.pages.Cart;
import com.one.ui.pages.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

import javax.inject.Inject;
import static org.testng.Assert.assertTrue;

@ContextConfiguration(classes = {LoginForm.class, WebDriverConfig.class, Browser.class})
public class AddToCardTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private LoginForm loginForm;

    @Inject
    private Browser browser;
    private Cart cart;


    @Test(groups = "valid")
    public void checkOutCart() throws InterruptedException {
        cart = new Cart(browser);
        assertTrue(cart.isCartVisible(), "Cart label not displayed");
        assertTrue(cart.isBackpackVisible(), "Backpack label not displayed");
        assertTrue(cart.isBikeLightVisible(), "Bike light label not displayed");
        assertTrue(cart.isTShirtVisible(), "T-shirt label not displayed");
        assertTrue(cart.isJacketVisible(), "Jacket label not displayed");

        cart.clickBIKE_LIGHT();
        cart.clickJACKET();
        cart.clickT_SHIRT();
        cart.clickBackpack();
        cart.clickCart();
        cart.clickCheckOut();
    }
}