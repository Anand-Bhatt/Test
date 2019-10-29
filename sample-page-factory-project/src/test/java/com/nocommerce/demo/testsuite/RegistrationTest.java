package com.nocommerce.demo.testsuite;

import com.nocommerce.demo.loadproperty.LoadProperty;
import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.pages.RegisterPage;
import com.nocommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {


    @Test(groups = "sanity")
    public void userShouldNavigateToRegistrationLink() {
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();
        homePage.clickOnRegisterLink();
        String expectedText = "Register";
        Assert.assertEquals(registerPage.welcomeText(), expectedText);
    }

    @Test (groups = "regression")
    public void userShouldRegisterSuccessfully() {
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();
        LoadProperty loadProperty = new LoadProperty();
        homePage.clickOnRegisterLink();
        registerPage.genderRadioBtn();
        registerPage.firstNameField(loadProperty.getProperty("firstName"));
        registerPage.lastNameField(loadProperty.getProperty("lastName"));
        registerPage.birthDayField(loadProperty.getProperty("birthDay"));
        registerPage.birthMonthField(loadProperty.getProperty("birthMonth"));
        registerPage.birthYearField(loadProperty.getProperty("birthYear"));
        registerPage.emailField(loadProperty.getProperty("email"));
        registerPage.companyField(loadProperty.getProperty("companyName"));
        registerPage.passwordField(loadProperty.getProperty("password"));
        registerPage.confirmPwdField(loadProperty.getProperty("confirmpwd"));
        registerPage.registerBtn();

        String regConf = "Your registration completed";
        Assert.assertEquals(registerPage.registerText(), regConf);

    }
}
