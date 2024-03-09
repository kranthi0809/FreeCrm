package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CustomerDeposit;
import com.crm.qa.pages.customerLoginpage;
import com.crm.qa.util.TestUtil;

public class customerDepositTest extends TestBase {
	customerLoginpage customerloginpage;
	TestUtil testutil;
	CustomerDeposit depositpage;
	

	public customerDepositTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		customerloginpage = new customerLoginpage();
		depositpage = new CustomerDeposit();
	}
//Test
	@Test(priority = 1)
	public void customerdep() {
		
	
		customerloginpage = customerloginpage.navigatetocustomerselection();
		depositpage=depositpage.navigatetodeposit();
		depositpage=depositpage.enteramount();
		depositpage=depositpage. btn();
		
		Assert.assertTrue(depositpage.isDepositSuccessful(), "Amount was not deposited successfully.");
		}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

        

	}