package com.liveinews.pageresources;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class DataGenerator {

    public static String password = "12345678";


    public static String generateUserName() {
        return RandomStringUtils.randomAlphabetic(7);
    }

    public static String password()

    {
        return password;
    }

    public static String confirmPassword() {
        return password;
    }

    public static String generateEmailAddress() {

        String emailaddress = RandomStringUtils.randomAlphanumeric(7) + "@mytempemail.com ";
        System.out.println(emailaddress);
        return emailaddress;
    }

    public static String generatefirstName() {
        return RandomStringUtils.randomAlphabetic(7);
    }

    public static String generateLastName() {
        return RandomStringUtils.randomAlphabetic(7);
    }

    public static String generateAddress() {
        return RandomStringUtils.randomAlphanumeric(7);
    }

    public static String generatePhoneNumber() {
        return RandomStringUtils.randomNumeric(3) + "-" +
                RandomStringUtils.randomNumeric(3) + "-" +
                RandomStringUtils.randomNumeric(4);
    }

    public static String generateZipcode() {
        return RandomStringUtils.randomNumeric(5);
    }

    public static int generateCountryIndex() {

        int index = Integer.parseInt(RandomStringUtils.randomNumeric(6)) % 31;
        return Math.abs(index);
    }

    //public static int generateStateIndex() {
      //   int a=new Random(System.currentTimeMillis()).nextInt() % 3;
        // System.out.print(a);
         //return Math.abs(a);
    //}

    public static int generateCityIndex() {

        int index = new Random(System.currentTimeMillis()).nextInt() % 2;
        return Math.abs(index);
    }


    public static String generatePayPalAccount() {
        return RandomStringUtils.randomAlphanumeric(7) + "mailinator.com";
    }


    public static String generateCompanyName() {
        return RandomStringUtils.randomAlphabetic(7);
    }


    public static String generateemployerID() {
        return "12" + "-" + RandomStringUtils.randomNumeric(7);
    }

    public static String generateContact() {
        return RandomStringUtils.randomAlphanumeric(10);
    }

    public static String generateMainContact()

    {
        return RandomStringUtils.randomAlphanumeric(10);
    }


}
