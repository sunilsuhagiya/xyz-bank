package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    // Locating add customer element using xpath
    By clickOnAddCustomerTab = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]");

    // This method will click on add customer
    public void clickOnAddCustomer() {
        clickOnElement(clickOnAddCustomerTab);
    }


}
