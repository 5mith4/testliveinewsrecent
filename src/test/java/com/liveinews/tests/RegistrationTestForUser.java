package com.liveinews.tests;

import com.liveinews.pageresources.DataGenerator;
import com.liveinews.pageresources.PageResources;
import com.liveinews.pages.RegistrationAndLogin;
import javafx.scene.chart.PieChart;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegistrationTestForUser extends  LoginTest {

    @Override
    @Test
    public void testThisPage() throws InterruptedException {

        super.testThisPage();
        System.out.println("In registratoiontest class");
        RegistrationAndLogin ral = PageResources.getRegistrationAndLoginPage(this.driver);

        WebElement accType = ral.getAccountType();
        Select accTypeSelect = new Select(accType);
        accTypeSelect.selectByIndex(0);

        ral.getEmailAddress().sendKeys(DataGenerator.generateEmailAddress());
        ral.getPassword().sendKeys(DataGenerator.password());
        ral.getConfirmPassword().sendKeys(DataGenerator.confirmPassword());
        ral.getUserName().sendKeys(DataGenerator.generateUserName());
        ral.clickNext().click();
        ral.acceptTerms().click();
        ral.clickNextAfterAcceptingTerms().click();
        ral.clickSubmit().click();

        Thread.sleep(1000);




    }
}
