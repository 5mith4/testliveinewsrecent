package com.liveinews.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationAndLogin {

    private WebDriver driver;


    public RegistrationAndLogin(WebDriver driver) {
        this.driver = driver;
    }

    //get account type user,editor, CJ , Media

    public WebElement getAccountType() {
        return driver.findElement(By.id("i-e-type"));
    }


    //common to all account type

    public WebElement getEmailAddress() {
        return driver.findElement(By.id("reg_email"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("reg_password"));

    }

    public WebElement getConfirmPassword() {
        return driver.findElement(By.id("creg_password"));
    }

    public WebElement getUserName() {
        return driver.findElement(By.id("i-e-name"));

    }


    //common for CJ , Media ,Editor


    public WebElement getAddress() {
        return driver.findElement(By.id("i-e-address"));
    }

    public WebElement getPhone() {
        return driver.findElement(By.id("i-e-phone"));
    }

    public WebElement getZip() {
        return driver.findElement(By.id("i-e-zip"));
    }


    public WebElement getCountry() {
        return driver.findElement(By.xpath("//*[@id=\"countryId\"]"));
    }


    public WebElement getState() {
        return driver.findElement(By.id("stateId"));
    }

    public WebElement getCity() {
        return driver.findElement(By.id("cityId"));
    }

    public WebElement clickNext() {
        return driver.findElement(By.name("register"));
    }


    public WebElement acceptTerms()
    {
        return driver.findElement(By.id("acceptterms"));
    }

   public WebElement clickSubmit()
   {
       return driver.findElement(By.xpath("//*[@id=\"registration-form\"]/p[2]/input"));
   }
    public WebElement clickNextAfterAcceptingTerms()
    {
        return driver.findElement(By.xpath("//*[@id=\"terms-modal\"]/div/p[2]/span"));
    }
    //registrating as Editor and CJ

    public WebElement getFirstName() {
        return driver.findElement(By.id("i-e-first"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("i-e-last"));
    }

    public WebElement getPaypalAccount()

    {
        return driver.findElement(By.id("i-e-paypal"));
    }


//registering as Media

    public WebElement getCompany() {
        return driver.findElement(By.id("i-e-company"));
    }


    public WebElement getEIN() {
        return driver.findElement(By.id("i-e-ein"));
    }

    public WebElement getContacct() {
        return driver.findElement(By.id("i-e-contact"));
    }

    public WebElement getMainContact() {
        return driver.findElement(By.id("i-e-mlc"));
    }


}


