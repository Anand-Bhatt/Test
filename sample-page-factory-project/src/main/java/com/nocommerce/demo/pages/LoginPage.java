package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Util {

    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(id = "Password")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement _loginBtn;

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement _welcomeText;


    public void enterEmail(String email) {
        sendTextToElement(_emailField, email);
    }

    public void enterPassword(String password) {

        sendTextToElement(_passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(_loginBtn);
    }

    public String welcomeText() {
        return getTextFromElement(_welcomeText);
    }
}
