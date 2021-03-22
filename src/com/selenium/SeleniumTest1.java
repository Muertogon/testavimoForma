package com.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
//SEKMINGAS KURIMAS
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SeleniumTest1 {
    @Before
    public void setup(){
        Selenium.setup();
    }
    @Test
    @Order(1)
    public void sukurtiIrasa() {
        Selenium.sukurtiIrasa("Stonks", "Comedy", "Ted Bundy", "Christopher Nolan", "220");
    }
    @After
    public void close(){

        Selenium.close();
    }
}
