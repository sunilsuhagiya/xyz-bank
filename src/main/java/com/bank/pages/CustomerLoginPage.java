package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    // Locating deposit element using xpath
    By clickOnDeposit = By.xpath("//div[3]/button[2]");
    // Locating amount field element using xpath
    By amountField = By.xpath("//div[1]/input[1]");
    // Locating deposit element using xpath
    By clickOnDeposit1 = By.xpath("//div[1]/form[1]/button[1]");
    // Locating Text deposit successful using xpath
    By verifyTextDeposit = By.xpath("//span[contains(text(),'Deposit Successful')]");
    // Locating withdrawal button using xpath
    By clickOnWithdrawal = By.xpath("//div[3]/button[3]");
    // Locating withdraw element using xpath
    By withdraw = By.xpath("//div[1]/input[1]");
    // Locating withdrawal button after withdrawing amount
    By clickOnAfterWithdrawal = By.xpath("//div[1]/form[1]/button[1]");
    // Locating text element using xpath
    By verifyTransactionSuccessful = By.xpath("//span[contains(text(),'Transaction successful')]");

    // This method will click on deposit
    public void clickOnDepositButton() {
        clickOnElement(clickOnDeposit);
    }

    // This method will send amount to amount field
    public void enterAmount(String amount) {
        sendTextToElement(amountField, amount);
    }

    // This method will click on deposit button
    public void clickOnDeposit100() {
        clickOnElement(clickOnDeposit1);
    }

    // This method will verify text
    public String verifyTextDepositSuccessful() {
        return getTextFromElement(verifyTextDeposit);
    }

    // This method will click on withdrawal button
    public void clickOnWithdrawalButton() {
        clickOnElement(clickOnWithdrawal);
    }

    // This method will send amount for withdrawal
    public void amountToWithdrawn(String withdrawAmount) {
        sendTextToElement(withdraw, withdrawAmount);
    }

    // This method will click on withdraw button
    public void clickOnAfterWithdrawalButton() {
        clickOnElement(clickOnAfterWithdrawal);
    }

    // This method will verify text
    public String verifyTextTransactionSuccessful() {
        return getTextFromElement(verifyTransactionSuccessful);
    }

}
