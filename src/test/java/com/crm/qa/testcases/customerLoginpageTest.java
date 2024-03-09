package com.crm.qa.testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.customerLoginpage;
import com.crm.qa.util.TestUtil;

public class customerLoginpageTest extends TestBase {
	customerLoginpage customerloginpage;
	TestUtil testutil;
	

	public customerLoginpageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		customerloginpage = new customerLoginpage();
	}
//Test
	@Test(priority = 1)
	public void customerloginpagetest() {
		
	
		customerloginpage = customerloginpage.navigatetocustomerselection();
		Assert.assertTrue(customerloginpage.navigatetocustomerhomepage());

	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
	

	