package com.liveinews.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public abstract class AbstractTest {

    protected WebDriver driver;  //only subclasses of AbstractTest can access it

    @BeforeSuite   //precondition
    public void initPage()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/raghavendrarao/Downloads/cd1/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://liveinews.com");

    }

    public abstract void testThisPage () throws InterruptedException; //method to be implemented by the subclasses
}

