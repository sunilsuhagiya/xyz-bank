package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    // Locating element using xpath for first name
    By enterFirstName = By.xpath("//div[1]/input[1]");
    // Locating element using xpath for last name
    By enterLastName = By.xpath("//input[@ng-model='lName']");
    // Locating element using xpath for post code
    By enterPostCode = By.xpath("//input[@ng-model='postCd']");
    // Locating element using xpath for add customer button
    By clickOnAddCustomer = By.xpath("//button[@type='submit']");

    // This method will send text to firstname field
    public void sendFirstName() {
        sendTextToElement(enterFirstName, "ABC");
    }

    // This method will send text to last name field
    public void sendLastName() {
        sendTextToElement(enterLastName, "XYZ");
    }

    // This method will send text to post code field
    public void sendPostCode() {
        sendTextToElement(enterPostCode, "412535");
    }

    // This method will click on add customer button
    public void clickOnAddCustomerButton() {
        clickOnElement(clickOnAddCustomer);
    }

    // This method will get text from alert
    public String getTextFromAlert() {
        String text = driver.switchTo().alert().getText();
        return text;
    }

    // This method will click on Ok after accepting alert
    public void clickOnAlertOk() {
        acceptAlert();
    }

}
