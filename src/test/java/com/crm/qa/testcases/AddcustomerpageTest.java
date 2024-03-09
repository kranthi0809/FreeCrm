package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Addcustomerpage;
import com.crm.qa.pages.BankManagerLogin;

public class AddcustomerpageTest extends TestBase {

	BankManagerLogin managerLogin;
	Addcustomerpage addcustomer;

    public AddcustomerpageTest() {
        super(); // Constructor call to initialize WebDriver and load URL
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        managerLogin = new BankManagerLogin();
        addcustomer = new Addcustomerpage();
    
    }
    @Test(priority = 1)
	public void addcustomer() {
		
	
		managerLogin = managerLogin.clickOnManagerLogin();
		addcustomer = addcustomer.clickOnAddCustomer();
		addcustomer = addcustomer.enterFirstName("kranthi");
		addcustomer = addcustomer.enterLastName("kumar reddy");
		addcustomer = addcustomer.enterZipCode("5185432");
		addcustomer = addcustomer.clickOnAddCustomerBtn();
		Assert.assertTrue(addcustomer.isCustomerAddedSuccessfully(), "Customer was not added successfully.");
		
	}
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}
 

    
    
}