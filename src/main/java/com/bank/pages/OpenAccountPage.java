package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    // Locating element open account using Xpath
    By clickOnOpenAccount = By.xpath("//button[@ng-class='btnClass2']");
    // Locating element for customer name using id
    By selectCustomer = By.id("userSelect");
    // Locating element for currency and clicking on pound
    By selectCurrency = By.id("currency");
    By clickOnPound = By.xpath("//option[contains(text(),'Pound')]");
    // Locating element for process button
    By clickOnProcess = By.xpath("//button[contains(text(),'Process')]");

    // This method will click on open account button
    public void clickOnOpenAccount() {
        clickOnElement(clickOnOpenAccount);
    }

    //This method will select customer name from dropdown
    public void selectCustomerName() {
        //mouseHoverToElementAndClick(selectCustomer);
        selectByContainsTextFromDropDown(selectCustomer, "Harry Potter");
    }

    // This method will select currency from drop down
    public void setSelectCurrency() {
        mouseHoverToElementAndClick(selectCurrency);
        clickOnElement(clickOnPound);
    }

    // This method will click on Process button
    public void clickOnProcessButton() {
        clickOnElement(clickOnProcess);
    }

    // This method will get text from alert
    public String getTextFromAlertOpenAccount() {
        String text = driver.switchTo().alert().getText();
        return text;
    }

    // This method will click on alert ok button
    public void clickOnAlertOkOpenAccount() {
        acceptAlert();
    }
}
