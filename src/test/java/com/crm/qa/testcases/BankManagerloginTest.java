package com.crm.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BankManagerLogin;


public class BankManagerloginTest extends TestBase {

	BankManagerLogin managerlogin;

    public BankManagerloginTest() {
        super(); // Constructor call to initialize WebDriver and load URL
    }

    @BeforeMethod
	public void setUp() {
		initialization();
		managerlogin = new BankManagerLogin ();
	}
//Test
	@Test(priority = 1)
	public void BankManagerLogin() {
		
	
		managerlogin = managerlogin.clickOnManagerLogin();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
