package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastNameText = By.id("BillingNewAddress_LastName");
    By emailText = By.id("BillingNewAddress_Email");
    By countryText = By.id("BillingNewAddress_CountryId");
    By cityText = By.id("BillingNewAddress_City");
    By address1Text = By.id("BillingNewAddress_Address1");
    By postalcodeText = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberText = By.id("BillingNewAddress_PhoneNumber");
    By continuButton = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAirButton = By.id("shippingoption_1");
    By creditCard = By.id("paymentmethod_1");
    By paymentContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By getContinuButton1 = By.xpath("//button[@onclick='ShippingMethod.save()']");
    By cardDropDown = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonthDropDown = By.id("ExpireMonth");
    By expireYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueButton2 = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");
    By creditCardText = By.xpath("//span[contains(text(),'Credit Card')]");
    By nextDayAirText = By.xpath("//span[contains(text(),'Next Day Air')]");
    By TotalAmountText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderProcess = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continuButton3 = By.xpath("//button[contains(text(),'Continue')]");
    By redioButton2ndDayAir = By.id("shippingoption_2");
    By secondDayAirText = By.xpath("//span[contains(.,'2nd Day Air')]");
    By totalAmountNokiaText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");



    public void inputFirstName(String Name) {
        sendTextToElement(firstName, Name);
    }

    public void inputLastName(String LastName) {
        sendTextToElement(lastNameText, LastName);
    }

    public void inputEmailText(String email) {
        sendTextToElement(emailText, email);
    }

    public void selectCountry(String country) {
        selectByVisibleTextFromDropDown(countryText, country);
    }

    public void inputCityText(String city) {
        sendTextToElement(cityText, city);

    }

    public void inputAddressText(String address) {
        sendTextToElement(address1Text, address);
    }

    public void inputPostalCodeText(String postalcode) {
        sendTextToElement(postalcodeText, postalcode);

    }

    public void inputPhoneNumberText(String phone) {
        sendTextToElement(phoneNumberText, phone);

    }

    public void clickCountinuButton() {
        clickOnElement(continuButton);
    }

    public void clickOnNextDayAirButton() {
        clickOnElement(nextDayAirButton);
    }

    public void clickCountinuButton1() {
        clickOnElement(getContinuButton1);
    }

    public void clickOnCreditCard() {
        clickOnElement(creditCard);
    }

    public void clickOnPaymentContinue() {
        clickOnElement(paymentContinue);

    }

    public void selectCreditCard(String card) {
        selectByVisibleTextFromDropDown(cardDropDown, card);
    }

    public void enterCardHolder(String cardHolder) {
        sendTextToElement(cardHolderName, cardHolder);
    }

    public void inputCardNumber(String Card1) {
        sendTextToElement(cardNumber, Card1);
    }

    public void selectExpiryMonth(String expiryMonth) {
        selectByVisibleTextFromDropDown(expireMonthDropDown, expiryMonth);
    }

    public void selectExpiryYear(String expiryYear) {
        selectByVisibleTextFromDropDown(expireYear, expiryYear);
    }

    public void inputcardCode(String cvc) {
        sendTextToElement(cardCode, cvc);

    }

    public void clickCountinuButton2() {
        clickOnElement(continueButton2);
    }

    public String getCreditCardText() {
        return getTextFromElement(creditCardText);
    }

    public String getNextDayAirText() {
        return getTextFromElement(nextDayAirText);
    }

    public String getTotalAmountText() {
        return getTextFromElement(totalAmountNokiaText);
    }

    public void clickCOnfimButton() {
        clickOnElement(confirmButton);
    }

    public String getThankYouText() {
        return getTextFromElement(thankYouText);
    }

    public String getorderProcessText() {
        return getTextFromElement(orderProcess);
    }

    public void clickOnContinueButton3() {
        clickOnElement(continuButton3);
    }
    public void clickOnRadioButton2ndDayAir(){
        clickOnElement(redioButton2ndDayAir);
    }
    public String getSecondDayText(){
        return getTextFromElement(secondDayAirText);
    }
    public String getTotalAmountNokiaText(){
        return getTextFromElement(totalAmountNokiaText);
    }

}
