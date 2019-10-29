package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Util {

    @FindBy(linkText = "Register")
    WebElement _welcomeText;

    @FindBy(id = "gender-male")
    WebElement _genderRadioBtn;

    @FindBy(id = "FirstName")
    WebElement _firstNameField;

    @FindBy(id = "LastName")
    WebElement _lastNameField;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement _birthDayField;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement _birthMonthField;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement _birthYearField;

    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement _companyField;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement _confirmPwdField;

    @FindBy(xpath = "//input[@id='register-button']")
    WebElement _registerBtn;

    @FindBy(xpath = "//div[@class='result']")
    WebElement _regiText;


    public String welcomeText() {

        return getTextFromElement(_welcomeText);
    }

    public void genderRadioBtn() {
        clickOnElement(_genderRadioBtn);
    }

    public void firstNameField(String firstName) {
        sendTextToElement(_firstNameField, firstName);

    }

    public void lastNameField(String lastName) {
        sendTextToElement(_lastNameField, lastName);
    }

    public void birthDayField(String birthDay) {

        sendTextToElement(_birthDayField, birthDay);
    }

    public void birthMonthField(String birthMonth) {

        sendTextToElement(_birthMonthField, birthMonth);
    }

    public void birthYearField(String birthYear) {

        sendTextToElement(_birthYearField, birthYear);
    }

    public void emailField(String email) {

        sendTextToElement(_emailField, email);
    }

    public void companyField(String companyName) {

        sendTextToElement(_companyField, companyName);
    }

    public void passwordField(String password) {

        sendTextToElement(_passwordField, password);
    }

    public void confirmPwdField(String confirmpwd) {

        sendTextToElement(_confirmPwdField, confirmpwd);
    }

    public void registerBtn() {
        clickOnElement(_registerBtn);
    }

    public String registerText() {

        return getTextFromElement(_regiText);
    }
}
