package com.liveinews.tests;

import com.liveinews.pageresources.PageResources;
import com.liveinews.pages.HomePage;
import com.liveinews.pages.RegistrationAndLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest extends AbstractTest {

    @Override //LoginTest subclass exteds Parent AbstractTest

    @Test  //method level annotation
    public void testThisPage() throws InterruptedException{
        HomePage page = PageResources.getHomePage(this.driver);
        page.getclickLoginLink().click();
        System.out.println("In logintest class");




    }
}


