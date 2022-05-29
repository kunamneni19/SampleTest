package com.one.locators;


import org.openqa.selenium.By;

import java.util.function.Supplier;

import static org.openqa.selenium.By.id;

public enum Id implements Supplier<By> {

    LOGIN("login-button"),
    USERNAME("user-name"),
    PASSWORD("password"),
    INVENTORY_CONTAINER("inventory_container"),
    BACKPACK("add-to-cart-sauce-labs-backpack"),
    BIKE_LIGHT("add-to-cart-sauce-labs-bike-light"),
    T_SHIRT("add-to-cart-sauce-labs-bolt-t-shirt"),
    JACKET("add-to-cart-sauce-labs-fleece-jacket"),
    CONTINUE_SHOP("continue-shopping"),
    CHECKOUT("checkout");

    private final By by;

    Id(String id) {
        this.by = id(id);
    }

    @Override
    public By get() {
        return by;
    }

    @Override
    public String toString() {
        return by.toString();
    }
}