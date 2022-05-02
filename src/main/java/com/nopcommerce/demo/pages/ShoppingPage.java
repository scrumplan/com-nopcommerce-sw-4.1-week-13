package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingPage extends Utility {
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity = By.xpath("//td[@class=\"quantity\"]/child::input");
    By updateShoppingCart = By.id("updatecart");
    By total = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By tearmOfService = By.id("termsofservice");
    By accountButton = By.id("checkout");
    By quantityText = By.xpath("//span[contains(text(),'(2)')]");
    By verifyTotal = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");



    public String getshoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public void changeQuantity() {
        sendTextToElement(quantity, Keys.BACK_SPACE + "2");
    }

    public void clickOnUpdateCartButton() {
        clickOnElement(updateShoppingCart);
    }

    public String getTotalText() {
        return getTextFromElement(total);
    }

    public void clickOnTermOfService() {
        clickOnElement(tearmOfService);
    }

    public void clickOnAccountButton() {
        clickOnElement(accountButton);
    }

    public String getQuantityText() {
        return getTextFromElement(quantityText);
    }
    public String getVerifyTotal(){
        return getTextFromElement(verifyTotal);
    }

}
