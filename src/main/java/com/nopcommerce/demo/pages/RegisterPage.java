package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//button[contains(text(),'Register')]");
    By firstNameText = By.id("FirstName");
    By lastNameText = By.id("LastName");
    By emailText = By.id("Email");
    By passwordText = By.id("Password");
    By confirmPasswordText = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registerSuccessText = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");


    public String getRegisterText(){
        return getTextFromElement(registerText);
    }
    public void inputFirstName(String Name) {
        sendTextToElement(firstNameText, Name);
    }

    public void inputLastName(String LastName) {
        sendTextToElement(lastNameText, LastName);
    }

    public void inputEmailText(String email) {
        sendTextToElement(emailText, email);
    }
    public void inputPasswordText(String password) {
        sendTextToElement(passwordText,password);
    }
    public void inputConfirmPasswordText(String comfirmpassword) {
        sendTextToElement(confirmPasswordText,comfirmpassword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getRegisterSuccessText(){
        return getTextFromElement(registerSuccessText);
    }
    public void clickOnContinuButton(){
        clickOnElement(continueButton);
    }


}
