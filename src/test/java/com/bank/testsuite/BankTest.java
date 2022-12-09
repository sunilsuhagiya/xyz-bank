package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    // Creating object of HomePage class
    HomePage homePage = new HomePage();
    // Creating object of bank Manager Login Page class
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    // Creating object of addCustomerPage class
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    // Creating object of openAccountPage class
    OpenAccountPage openAccountPage = new OpenAccountPage();
    // Creating object of customersPage class
    CustomersPage customersPage = new CustomersPage();
    // Creating object of accountPage class
    AccountPage accountPage = new AccountPage();
    // Creating object of customerLoginPage class
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        // This method will click on Bank manager login
        homePage.clickOnBankManagerLoginTab();
        // This method will click on add to customer
        bankManagerLoginPage.clickOnAddCustomer();
        // This method will send first name
        addCustomerPage.sendFirstName();
        // This method will send last name
        addCustomerPage.sendLastName();
        // This method will send post code
        addCustomerPage.sendPostCode();
        // This method will click on customer button
        addCustomerPage.clickOnAddCustomerButton();
        // Verifying text customer added successfully
        Assert.assertTrue(addCustomerPage.getTextFromAlert().contains("Customer added successfully"), "Customer added successfully");
        // This method will click on alert
        addCustomerPage.clickOnAlertOk();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        // This method will click on Bank manager login
        homePage.clickOnBankManagerLoginTab();
        // This method will click on open bank account tab
        openAccountPage.clickOnOpenAccount();
        // This method will select customer from drop down
        openAccountPage.selectCustomerName();
        // This method will select currency from drop down
        openAccountPage.setSelectCurrency();
        // This method will click on process button
        openAccountPage.clickOnProcessButton();
        // Verify Text Account created successfully
        Assert.assertTrue(openAccountPage.getTextFromAlertOpenAccount().contains("Account created successfully"), "Account created successfully");
        // This method will click on alert ok button
        openAccountPage.clickOnAlertOkOpenAccount();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        // This method will click on customer login button
        homePage.clickOnCustomerLoginButton();
        // This method will select customer name from drop down
        customersPage.selectCustomerName();
        // This method will click on login button
        customersPage.clickOnLoginButton();
        // This method will verify log out button
        accountPage.verifyLogOutButton();
        // This method will click on log out button
        accountPage.clickOnLogOutButton();
        // Verify text Your name
        Assert.assertEquals(customersPage.verifyYourNameText(), "Your Name :", "Your Name : not displayed");

    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        // This method will click on customer login button
        homePage.clickOnCustomerLoginButton();
        // This method will select customer name from drop down
        customersPage.selectCustomerName();
        // This method will click on login button
        customersPage.clickOnLoginButton();
        // This method will click on deposit button
        customerLoginPage.clickOnDepositButton();
        // This method will send amount to amount field
        customerLoginPage.enterAmount("100");
        // // This method will click on deposit button
        customerLoginPage.clickOnDeposit100();
        // Verify text Deposit Successful
        Assert.assertEquals(customerLoginPage.verifyTextDepositSuccessful(), "Deposit Successful", "Deposit Successful not displayed");
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        // This method will click on customer login button
        homePage.clickOnCustomerLoginButton();
        // This method will select customer name from drop down
        customersPage.selectCustomerName();
        // This method will click on login button
        customersPage.clickOnLoginButton();
        // This method will click on withdraw button
        customerLoginPage.clickOnWithdrawalButton();
        //This method will withdraw amount
        customerLoginPage.amountToWithdrawn("5");
        // This method will click on withdraw button
        customerLoginPage.clickOnAfterWithdrawalButton();
        // Verify text Transaction successful
        Assert.assertEquals(customerLoginPage.verifyTextTransactionSuccessful(), "Transaction successful", "Transaction successful Not displayed");
    }
}
