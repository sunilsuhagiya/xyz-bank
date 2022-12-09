package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    // Locating Bank manager button using xpath
    By clickOnBankManagerLoginButton = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    // Locating customer login element using xpath
    By clickOnCustomerLogin = By.xpath("//button[contains(text(),'Customer Login')]");

    // This method will click on bank manager button
    public void clickOnBankManagerLoginTab() {
        clickOnElement(clickOnBankManagerLoginButton);
    }

    // This method will click on login button
    public void clickOnCustomerLoginButton() {
        clickOnElement(clickOnCustomerLogin);
    }

}
