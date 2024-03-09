package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.customerLoginpage;
import com.crm.qa.pages.customerWithdrawl;
import com.crm.qa.util.TestUtil;

public class customerWithdrawlTest extends TestBase{
	customerLoginpage customerloginpage;
	TestUtil testutil;
	customerWithdrawl withdrawlpage;
	public customerWithdrawlTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		customerloginpage = new customerLoginpage();
		withdrawlpage= new customerWithdrawl();
	}
	
	//Test
		@Test(priority = 1)
		public void customerwithdrawl() {
			
		
			customerloginpage = customerloginpage.navigatetocustomerselection();
			
			withdrawlpage = withdrawlpage.clickOnWithdrawSection();
			
			withdrawlpage = withdrawlpage.enterAmount("500");
			
			withdrawlpage = withdrawlpage.clickOnWithdrawlButton();
			Assert.assertTrue(withdrawlpage.isTransactionSuccessful(), "Amount was not Withdrawed successfully.");
			}
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}


}