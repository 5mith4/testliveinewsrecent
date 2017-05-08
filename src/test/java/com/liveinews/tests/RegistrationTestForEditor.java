package com.liveinews.tests;

import com.liveinews.pageresources.DataGenerator;
import com.liveinews.pageresources.PageResources;
import com.liveinews.pages.RegistrationAndLogin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.lang.InterruptedException;

/**
 * Created by raghavendrarao on 5/6/17.
 */
public class RegistrationTestForEditor extends  LoginTest {

    @Override
    @Test  //method level annotation
    public void testThisPage() throws InterruptedException{

        super.testThisPage();  //calls super class testThisPage() method
        System.out.println("In registratoiontest class");
        RegistrationAndLogin ral1 = PageResources.getRegistrationAndLoginPage(this.driver); //creates RegistrationAndLogin reference and class static method of PageResources classname.methodname

        WebElement accType = ral1.getAccountType();
        Select accTypeSelect = new Select(accType);
        accTypeSelect.selectByVisibleText("Editor");

        ral1.getEmailAddress().sendKeys(DataGenerator.generateEmailAddress());
        ral1.getPassword().sendKeys(DataGenerator.password());
        ral1.getConfirmPassword().sendKeys(DataGenerator.confirmPassword());
        ral1.getUserName().sendKeys(DataGenerator.generateUserName());
        ral1.getFirstName().sendKeys(DataGenerator.generatefirstName());
        ral1.getLastName().sendKeys(DataGenerator.generateLastName());
        ral1.getAddress().sendKeys(DataGenerator.generateAddress());
        ral1.getPhone().sendKeys(DataGenerator.generatePhoneNumber());
        ral1.getZip().sendKeys(DataGenerator.generateZipcode());

        WebElement country = ral1.getCountry();    //select country get index from DataGenerator
        Select countryType = new Select(country);
        countryType.selectByIndex(DataGenerator.generateCountryIndex());
        Thread.sleep(3000);



        WebElement state = ral1.getState();
        Select stateType = new Select(state);
        stateType.selectByIndex(1);
        Thread.sleep(5000);


        WebElement city = ral1.getCity();
        Select cityType = new Select(city);
        stateType.selectByIndex(1);

        ral1.clickNext().click();
        ral1.acceptTerms().click();
        Thread.sleep(1000);
        ral1.clickNextAfterAcceptingTerms().click();
        ral1.clickSubmit().click();
    }
}