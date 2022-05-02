package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    HomePage homepage = new HomePage();
    ComputerPage computerspage = new ComputerPage();
    DesktopPage desktopspage = new DesktopPage();
    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();
    ShoppingPage shoppingCartPage = new ShoppingPage();
    LoginPage loginPage = new LoginPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductArrangeInAscendingOrder(){
        homepage.clickOnComputersLink();
        computerspage.clickOnDesktopCategory();
        desktopspage.clickOnSortByPriceLowToHigh();
        String actualMessage = desktopspage.getPriceLowToHighOptionText();
        Assert.assertEquals(actualMessage,"Price: Low to High","error");
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        homepage.clickOnComputersLink();
        computerspage.clickOnDesktopCategory();
        desktopspage.clickOnSortByAToZ();
        Thread.sleep(1000);
        desktopspage.clickOnAddToCartButton();
        String actualMessage = buildYourComputerPage.getBuildYourOwnComputerText();
        Assert.assertEquals(actualMessage,"Build your own computer","error");
        buildYourComputerPage.selectProcessor2_2GHzIntelPentiumDualCoreE2200();
        buildYourComputerPage.selectRAM8GB();
        buildYourComputerPage.selectHDDRadio400GB();
        buildYourComputerPage.selectOSRadioVistaPremium();
        Thread.sleep(1000);
       // buildYourComputerPage.selectCheckBoxMicrosoftOffice();
        buildYourComputerPage.selectCheckBoxTotalCommander();
        Thread.sleep(1000);
        String actualPriceMessage = buildYourComputerPage.getPriceText();
        Assert.assertEquals(actualPriceMessage,"$1,475.00","error");
        buildYourComputerPage.clickOnAddToCartButton();
        String actualProductAddedToCartMessage = buildYourComputerPage.getproductAddedToShoppingCart();
        Assert.assertEquals(actualProductAddedToCartMessage,"The product has been added to your shopping cart","error");
        buildYourComputerPage.closeTheBarByClickingOnTheCrossButton();
        buildYourComputerPage.mouseHoverOnShoppingCartButton();
        buildYourComputerPage.clickOnGoToCartButton();
        String actualShoppingCartMessage = shoppingCartPage.getshoppingCartText();
        Assert.assertEquals(actualShoppingCartMessage,"Shopping cart","error");
        Thread.sleep(2000);
        shoppingCartPage.changeQuantity();
        shoppingCartPage.clickOnUpdateCartButton();
        String actualTotalMessage = shoppingCartPage.getTotalText();
        Assert.assertEquals(actualTotalMessage,"$2,950.00","error");
        shoppingCartPage.clickOnTermOfService();
        shoppingCartPage.clickOnAccountButton();
        String actualWelcomeTextMessage = loginPage.getWelcomePageText();
        Assert.assertEquals(actualWelcomeTextMessage,"Welcome, Please Sign In!","error");
        loginPage.clickOnCheckoutButton();
        checkOutPage.inputFirstName("Lalita");
        checkOutPage.inputLastName("Desai");
        checkOutPage.inputEmailText("Lalita123@gmail.com");
        checkOutPage.selectCountry("United Kingdom");
        checkOutPage.inputCityText("London");
        checkOutPage.inputAddressText("43,london street");
        checkOutPage.inputPostalCodeText("lu59t5");
        checkOutPage.inputPhoneNumberText("+754338999089");
        checkOutPage.clickCountinuButton();
        checkOutPage.clickOnNextDayAirButton();
        checkOutPage.clickCountinuButton1();
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnPaymentContinue();
        checkOutPage.selectCreditCard("Master card");
        checkOutPage.enterCardHolder("Miss Lalita Desai");
        checkOutPage.inputCardNumber("5356 6548 1418 5420");
        checkOutPage.selectExpiryMonth("12");
        checkOutPage.selectExpiryYear("2026");
        checkOutPage.inputcardCode("546");
        checkOutPage.clickCountinuButton2();
        String actualCardMessage = checkOutPage.getCreditCardText();
        Assert.assertEquals(actualCardMessage,"Credit Card","error");
        String actualNextDayAirMessage = checkOutPage.getNextDayAirText();
        Assert.assertEquals(actualNextDayAirMessage,"Next Day Air","error");
        String actualTotalMessage1 = checkOutPage.getTotalAmountText();
        Assert.assertEquals(actualTotalMessage1,"$2,950.00","error");
        checkOutPage.clickCOnfimButton();
        String actualThankYouMessage = checkOutPage.getThankYouText();
        Assert.assertEquals(actualThankYouMessage,"Thank you","error");
        String actualOrderMessage = checkOutPage.getorderProcessText();
        Assert.assertEquals(actualOrderMessage,"Your order has been successfully processed!","error");
        checkOutPage.clickOnContinueButton3();
        String actualWelcomeMessage = homepage.getWelcomeOurStoreText();
        Assert.assertEquals(actualWelcomeMessage,"Welcome to our store","error");



















    }


}
