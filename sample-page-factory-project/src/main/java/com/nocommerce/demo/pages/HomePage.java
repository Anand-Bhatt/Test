package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {
    @FindBy(linkText = "Register")
    WebElement _registerLink;

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    @FindBy(id = "customerCurrency")
    WebElement _selectCurrency;

    @FindBy(id = "small-searchterms")
    WebElement _searchStore;

    @FindBy(xpath = "//input[@class='button-1 search-box-button']")
    WebElement _searchBtn;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement _computersLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement _electronicsLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
    WebElement _apparelLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement _digitalDownloads;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement _booksLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
    WebElement _jewelry;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")
    WebElement _giftCardsLink;


    public void clickOnRegisterLink() {
        clickOnElement(_registerLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(_loginLink);
    }

    public void selectCurrency() {
        clickOnElement(_selectCurrency);
        selectByVisibleTextFromDropDown(_selectCurrency, "Euro");
    }

    public void searchStore() {
        sendTextToElement(_searchStore, "laptop");
    }

    public void clickOnSearchButton() {
        clickOnElement(_searchBtn);
    }

    public void computersLink() {
        clickOnElement(_computersLink);
    }

    public void electronicsLink() {
        clickOnElement(_electronicsLink);
    }

    public void apparelLink() {
        clickOnElement(_apparelLink);
    }

    public void digitalDowanloads() {
        clickOnElement(_digitalDownloads);
    }

    public void booksLink() {
        clickOnElement(_booksLink);
    }

    public void jewelryLink() {
        clickOnElement(_jewelry);
    }

    public void giftCardsLink() {
        clickOnElement(_giftCardsLink);
    }
}
