package com.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
//NESEKMINGAS KURIMAS
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SeleniumTest2{
    @Before
    public void setup(){
        Selenium.setup();
    }
    @Test
    @Order(1)
    public void sukurtiIrasa() {
        Selenium.sukurtiIrasa("Stonks", "", "", "Christopher Nolan", "");
    }
    @After
    public void close(){

        Selenium.close();
    }
}
