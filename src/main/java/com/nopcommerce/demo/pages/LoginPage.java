package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomePageText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkoutButton = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By registerButton = By.xpath("//button[contains(text(),'Register')]");


    public String getWelcomePageText(){
        return getTextFromElement(welcomePageText);
    }
    public void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
    }
    public void clickOnREgisterButton(){
        clickOnElement(registerButton);
    }
}
