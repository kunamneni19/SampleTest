package com.one.ui.pages;
import com.one.framework.Browser;
import static com.one.locators.ClassName.CART;
import static com.one.locators.Id.BACKPACK;
import static com.one.locators.Id.BIKE_LIGHT;
import static com.one.locators.Id.T_SHIRT;
import static com.one.locators.Id.JACKET;
import static com.one.locators.Id.CHECKOUT;


public class Cart {
    private Browser browser;

    public Cart(Browser browser) {
        this.browser = browser;
    }

    public boolean isCartVisible() {
        return browser.elementIsDisplayed(CART);
    }
    public boolean isBackpackVisible() {
        return browser.elementIsDisplayed(BACKPACK);
    }

    public boolean isBikeLightVisible() {
        return browser.elementIsDisplayed(BIKE_LIGHT);
    }

    public boolean isTShirtVisible() {
        return browser.elementIsDisplayed(T_SHIRT);
    }

    public boolean isJacketVisible() {
        return browser.elementIsDisplayed(JACKET);
    }


    public void  clickBackpack() {
        browser.click(BACKPACK);
    }

    public void  clickBIKE_LIGHT() {
        browser.click(BIKE_LIGHT);
    }

    public void  clickT_SHIRT() {
        browser.click(T_SHIRT);
    }

    public void  clickJACKET() {
        browser.click(JACKET);
    }

    public void  clickCart() {
        browser.click(CART);
    }

    public void  clickCheckOut() {
        browser.click(CHECKOUT);
    }


}
