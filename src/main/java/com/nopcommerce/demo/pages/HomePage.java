package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By computerTab = By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By ElectronicTab = By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By apparelTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]");
    By digitalDownloadsTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]");
    By booksTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");
    By jewelryTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");
    By giftCardsTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");
    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By welcomeOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhoneLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");
    By logOutButton = By.xpath("//a[contains(text(),'Log out')]");

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='header-menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }

    public String getTextFromComputers() {
        return getTextFromElement(computerTab);
    }

    public String getTextFromElectronics() {
        return getTextFromElement(ElectronicTab);
    }

    public String getTextFromApparel() {
        return getTextFromElement(apparelTab);
    }

    public String getTextFromDigitalDownloads() {
        return getTextFromElement(digitalDownloadsTab);
    }

    public String getTextFromBooks() {
        return getTextFromElement(booksTab);
    }

    public String getTextFromJewelry() {
        return getTextFromElement(jewelryTab);
    }

    public String getTextFromGiftCards() {
        return getTextFromElement(giftCardsTab);
    }

    public void clickOnComputersLink() {
        clickOnElement(computersLink);
    }

    public String getWelcomeOurStoreText() {
        return getTextFromElement(welcomeOurStore);
    }

    public void mouseHoverOnElectronicsTab() {
        mouseHoverToElement(electronicsLink);
    }

    public void clickOnCellPhoneLink() {
        mouseHoverToElementAndClick(cellPhoneLink);
    }
    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
    }


}
