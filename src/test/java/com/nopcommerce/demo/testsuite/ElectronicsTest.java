package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void textVerified() {
        homePage.mouseHoverOnElectronicsTab();
        homePage.clickOnCellPhoneLink();
        String actualCellPhoneMessage = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(actualCellPhoneMessage, "Cell phones", "error");


    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronicsTab();
        homePage.clickOnCellPhoneLink();
        String actualCellPhoneMessage = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(actualCellPhoneMessage, "Cell phones", "error");
        cellPhonePage.clickOnListViewLink();
        Thread.sleep(2000);
        cellPhonePage.clickOnNokiaLomia();
        String actualNokiaLumiaTextMessage = nokiaLumiaPage.getNokiaLumia1020Text();
        Assert.assertEquals(actualNokiaLumiaTextMessage, "Nokia Lumia 1020", "error");
        String actualPriceTextMessage = nokiaLumiaPage.getPriceText();
        Assert.assertEquals(actualPriceTextMessage, "$349.00", "error");
        nokiaLumiaPage.updateCartBox();
        nokiaLumiaPage.clickOnAddToCartButton();
        String actualProductMessage = nokiaLumiaPage.getproductMessText();
        Assert.assertEquals(actualProductMessage, "The product has been added to your shopping cart", "error");
        nokiaLumiaPage.clickGreenButton();
        nokiaLumiaPage.mouserHoverOnShoppingCart();
        nokiaLumiaPage.clickOnGoToCartButton();
        shoppingPage.getshoppingCartText();
        Thread.sleep(2000);
        String actualQuantityMessage = shoppingPage.getQuantityText();
        Assert.assertEquals(actualQuantityMessage, "(2)", "error");
        String actualTotalMessage = shoppingPage.getTotalText();
        Assert.assertEquals(actualTotalMessage, "$698.00", "error");
        shoppingPage.clickOnTermOfService();
        shoppingPage.clickOnAccountButton();
        String actualWelcomePageMessage = loginPage.getWelcomePageText();
        Assert.assertEquals(actualWelcomePageMessage, "Welcome, Please Sign In!", "error");
        loginPage.clickOnREgisterButton();
        String actualRegisterMessage = registerPage.getRegisterText();
        Assert.assertEquals(actualRegisterMessage, "REGISTER", "error");
        registerPage.inputFirstName("Lalita");
        registerPage.inputLastName("Desai");
        registerPage.inputEmailText("Lalita12340=@gmail.com");
        registerPage.inputPasswordText("Lalita123");
        registerPage.inputConfirmPasswordText("Lalita123");
        registerPage.clickOnRegisterButton();
        String actualRegisterSuccessMessage = registerPage.getRegisterSuccessText();
        Assert.assertEquals(actualRegisterSuccessMessage, "Your registration completed", "error");
        registerPage.clickOnContinuButton();
        shoppingPage.getshoppingCartText();
        shoppingPage.clickOnTermOfService();
        shoppingPage.clickOnAccountButton();
        /*checkOutPage.inputFirstName("Lalita");
        checkOutPage.inputLastName("Desai");
        checkOutPage.inputEmailText("Lalita12346@gmail.com");*/
        checkOutPage.selectCountry("United Kingdom");
        checkOutPage.inputCityText("London");
        checkOutPage.inputAddressText("54 London street");
        checkOutPage.inputPostalCodeText("8uy5r");
        checkOutPage.inputPhoneNumberText("+7564498778");
        checkOutPage.clickCountinuButton();
        checkOutPage.clickOnRadioButton2ndDayAir();
        checkOutPage.clickCountinuButton1();
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnPaymentContinue();
        checkOutPage.selectCreditCard("Visa");
        checkOutPage.enterCardHolder("Miss Lalita Desai");
        checkOutPage.inputCardNumber("5356 6548 1418 5420");
        checkOutPage.selectExpiryMonth("12");
        checkOutPage.selectExpiryYear("2026");
        checkOutPage.inputcardCode("546");
        checkOutPage.clickCountinuButton2();
        String actualCreditCardMessage = checkOutPage.getCreditCardText();
        Assert.assertEquals(actualCreditCardMessage, "Credit Card", "error");
        String actual02ndDayMessage = checkOutPage.getSecondDayText();
        Assert.assertEquals(actual02ndDayMessage, "2nd Day Air", "error");
        String actualTotalAmountNokiaMessage = checkOutPage.getTotalAmountText();
        Assert.assertEquals(actualTotalAmountNokiaMessage, "$698.00", "error");
        checkOutPage.clickCOnfimButton();
        String actualThankYouMessage = checkOutPage.getThankYouText();
        Assert.assertEquals(actualThankYouMessage, "Thank you", "error");
        String actualOrderProcessMessage = checkOutPage.getorderProcessText();
        Assert.assertEquals(actualOrderProcessMessage, "Your order has been successfully processed!", "error");
        checkOutPage.clickOnContinueButton3();
        String actualWelcomeOurStoreMessage = homePage.getWelcomeOurStoreText();
        Assert.assertEquals(actualWelcomeOurStoreMessage, "Welcome to our store", "error");
        homePage.clickOnLogOutButton();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/","error");


    }

}
