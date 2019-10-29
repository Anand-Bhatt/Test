package com.nocommerce.demo.testsuite;

import com.nocommerce.demo.loadproperty.LoadProperty;
import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.pages.LoginPage;
import com.nocommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoadProperty loadProperty = new LoadProperty();


    @Test(groups = "sanity")
    public void ShouldLoginSuccessfully() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(loginPage.welcomeText(), expectedText);
    }

    @Test (groups = "regression")
    public void userShouldLoginSuccessfully() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.clickOnLoginLink();
        loginPage.enterEmail(loadProperty.getProperty("email"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
        loginPage.clickOnLoginButton();
    }

}
