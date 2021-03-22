package com.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SeleniumTest3 {
    @Before
    public void setup() {
        Selenium.setup();
    }

    @Test
    @Order(1)
    public void trintiIrasa(){
        Selenium.trintiIrasa("Stonks");
    }
}