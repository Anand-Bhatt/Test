package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends Util {

    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Build your own computer')]")
    WebElement _buildYourOwnCom;

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement _confTextBuildYourOwn;

    @FindBy(id = "product_attribute_3_6")
    WebElement _hddOption;

    @FindBy(id = "add-to-cart-button-1")
    WebElement _addToCart;

    @FindBy(xpath = "//div[@class='bar-notification success']")
    WebElement _addCartMsg;


    public void buildYourOwnComLink() {

        clickOnElement(_buildYourOwnCom);
    }

    public String confTextBuildYourOwn() {
        return getTextFromElement(_confTextBuildYourOwn);
    }

    public void hddOptionSelection() {

        clickOnElement(_hddOption);
    }

    public void addToCartBtn() {
        clickOnElement(_addToCart);
    }

    public String addCartMsgDisplay() {
        return getTextFromElement(_addCartMsg);
    }
}
