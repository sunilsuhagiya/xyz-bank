package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AccountPage extends Utility {
    // Locating element for logout using xpath
    By verifyLogOut = By.xpath("//button[contains(text(),'Logout')]");
    // Locating element for log out button using xpath
    By clickOnLogOut = By.xpath("//button[contains(text(),'Logout')]");

    // This method will verify log out button
    public void verifyLogOutButton() {
        Boolean logOutButton = driver.findElement(verifyLogOut).isDisplayed();
    }

    // This method will click on log out button
    public void clickOnLogOutButton() {
        clickOnElement(clickOnLogOut);
    }

}
