package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomersPage extends Utility {
    // Locating element for customer name using id method
    By searchCustomerName = By.id("userSelect");
    // Locating element for login button
    By clickOnLogin = By.xpath("//button[contains(text(),'Login')]");
    // Locating element for text your name using xpath
    By verifyYourName = By.xpath("//label[contains(text(),'Your Name :')]");

    // This method will select customer name from drop down
    public void selectCustomerName() {

        WebElement dropDown = driver.findElement(searchCustomerName);
        Select select = new Select(dropDown);
        mouseHoverToElementAndClick(searchCustomerName);
        select.selectByIndex(1);
        //select.selectByValue("ABC XYZ");
    }

    // This method will click on login button
    public void clickOnLoginButton() {
        clickOnElement(clickOnLogin);
    }

    // This method will verify text
    public String verifyYourNameText() {
        return getTextFromElement(verifyYourName);
    }

}
