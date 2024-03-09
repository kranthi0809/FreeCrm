package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.customerLoginpage;
import com.crm.qa.pages.customerTransactionPage;
import com.crm.qa.util.TestUtil;

public class customerTransactionPageTest extends TestBase{
	customerLoginpage customerloginpage;
	TestUtil testutil;
	customerTransactionPage transactionpage;
	public customerTransactionPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		customerloginpage = new customerLoginpage();
		transactionpage= new customerTransactionPage();
	}
	//Test
			@Test(priority = 1)
			public void customertransaction() {
				
			
				customerloginpage = customerloginpage.navigatetocustomerselection();
				transactionpage = transactionpage.clickOnTransactionSection();
			}
			@AfterMethod
			public void tearDown(){
				driver.quit();
			}
	
}
	