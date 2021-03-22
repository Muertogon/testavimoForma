package com.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

    public static WebDriver browser;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver",
                "D://Programming stuff//selenium stuff//drivers//chrome//chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("http://kitm.epizy.com/filmai.php");
    }

    public static void sukurtiIrasa(String name, String type, String actor, String direct, String time){
        WebElement pavInput = browser.findElement(By.name("pavadinimas"));
        WebElement typeInput = browser.findElement(By.name("zanras"));
        WebElement actorsInput = browser.findElement(By.name("aktoriai"));
        WebElement direcInput = browser.findElement(By.name("rezisierius"));
        WebElement timeInput = browser.findElement(By.name("trukme"));
        WebElement subButt = browser.findElement(By.name("insert"));
        pavInput.sendKeys(name);
        typeInput.sendKeys(type);
        actorsInput.sendKeys(actor);
        direcInput.sendKeys(direct);
        timeInput.sendKeys(time);

        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("arguments[0].click();", subButt);

    }
    public static void trintiIrasa(String pav){
        WebElement searchButt = browser.findElement(By.name("search"));
        WebElement pavInput = browser.findElement(By.name("pavadinimas"));

        pavInput.sendKeys(pav);
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("arguments[0].click();", searchButt);
        String innerId = browser.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
        System.out.println(innerId);
        WebElement idInput = browser.findElement(By.name("id"));
        idInput.sendKeys(String.valueOf(innerId));
        WebElement delButt = browser.findElement(By.name("delete"));
        JavascriptExecutor js1 = (JavascriptExecutor) browser;
        js1.executeScript("arguments[0].click();", delButt);
    }
    public static void redakcijaIraso(String pav, String nName, String nType, String nActor, String nDirect, String nTime){
        WebElement searchButt = browser.findElement(By.name("search"));
        WebElement pavInput = browser.findElement(By.name("pavadinimas"));

        pavInput.sendKeys(pav);
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("arguments[0].click();", searchButt);
        String innerId = browser.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
        System.out.println(innerId);
        WebElement idInput = browser.findElement(By.name("id"));
        WebElement typeInput = browser.findElement(By.name("zanras"));
        WebElement actorsInput = browser.findElement(By.name("aktoriai"));
        WebElement direcInput = browser.findElement(By.name("rezisierius"));
        WebElement timeInput = browser.findElement(By.name("trukme"));
        idInput.sendKeys(String.valueOf(innerId));
        WebElement pav1Input = browser.findElement(By.name("pavadinimas"));
        pav1Input.sendKeys(nName);
        typeInput.sendKeys(nType);
        actorsInput.sendKeys(nActor);
        direcInput.sendKeys(nDirect);
        timeInput.sendKeys(nTime);
        WebElement updateButt = browser.findElement(By.name("insert"));
        JavascriptExecutor js1 = (JavascriptExecutor) browser;
        js1.executeScript("arguments[0].click();", updateButt);
    }
    public static void close(){
        browser.close();
    }
    public static void main(String[] args) {
        setup();
    }
}
