package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BankManagerLogin;
import com.crm.qa.pages.openAccountpage;

public class openAccountpageTest extends TestBase {

	BankManagerLogin managerLogin;
	openAccountpage openaccount;

    public openAccountpageTest() {
        super(); // Constructor call to initialize WebDriver and load URL
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        managerLogin = new BankManagerLogin();
        openaccount = new openAccountpage();
    
    }
    
    @Test(priority = 1)
	public void openaccount() {
		
	
		managerLogin = managerLogin.clickOnManagerLogin();
		openaccount = openaccount.clickOnOpenAccount();
		openaccount = openaccount.ClickonCustomerDropdown();
		openaccount = openaccount.ClickonCurrencyDropdown();
		openaccount = openaccount.Processbutton();
		Assert.assertTrue(openaccount.isAccountOpenedSuccessfully(), "Account was not opened successfully.");
    }
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
