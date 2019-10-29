package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends Util {

    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Desktops')]")
    WebElement _deskTopLink;

    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Notebooks')]")
    WebElement _noteBooksLink;

    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Software')]")
    WebElement _softwareLink;

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement _commText;


    public void deskTopMenu() {
        clickOnElement(_deskTopLink);
    }

    public void noteBooksMenu() {
        clickOnElement(_noteBooksLink);
    }

    public void softWareMenu() {
        clickOnElement(_softwareLink);
    }

    public String verifyCommText() {
        return getTextFromElement(_commText);
    }
}
