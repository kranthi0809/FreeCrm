package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BankManagerLogin;
import com.crm.qa.pages.searchCustomerpage;

public class searchCustomerpageTest extends TestBase {

	BankManagerLogin managerLogin;
	searchCustomerpage searchcustomerPage;

    public searchCustomerpageTest() {
        super(); // Constructor call to initialize WebDriver and load URL
    }

    @BeforeMethod
    public void setup() {
    	 initialization();
        managerLogin = new BankManagerLogin();
        searchcustomerPage= new searchCustomerpage();
    }
    
    @Test(priority = 1)
   	public void searchcustomers() {
   		
   	
   		managerLogin = managerLogin.clickOnManagerLogin();
   		searchcustomerPage = searchcustomerPage.clickOnCustomerLogin();
   		searchcustomerPage = searchcustomerPage.searchCustomer("annem");
    }
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}
    
}
