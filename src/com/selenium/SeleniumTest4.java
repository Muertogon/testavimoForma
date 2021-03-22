package com.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
//SEKMINGAS REDAGAVIMAS
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SeleniumTest4{
    @Before
    public void setup(){
        Selenium.setup();
    }
    @Test
    @Order(1)
    public void redakcijaIraso() {
        Selenium.redakcijaIraso("Stonks", "Stonkers", "ActionComedy", "Christian Bale", "Quentin Quarantino", "300");
    }
    @After
    public void close(){

        Selenium.close();
    }
}