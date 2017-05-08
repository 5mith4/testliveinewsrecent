package com.liveinews.pageresources;


import com.liveinews.pages.HomePage;
import com.liveinews.pages.RegistrationAndLogin;
import org.openqa.selenium.WebDriver;

public class PageResources {

    public static HomePage getHomePage (WebDriver driver)
    {
        HomePage page = new HomePage(driver);
        return page;
    }

    public static RegistrationAndLogin getRegistrationAndLoginPage (WebDriver driver)
    {
        RegistrationAndLogin ral = new RegistrationAndLogin(driver);
        return ral;
    }




}


