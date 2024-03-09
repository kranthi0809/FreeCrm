package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class customerLoginpage extends TestBase{
		
		//Page Factory - OR:
		@FindBy(xpath="//button[contains(text(),'Customer Login')]")
		WebElement customerloginbutton;
		
		@FindBy(xpath="//select[@id='userSelect']")
		WebElement dropdown;
		
		@FindBy(xpath="//option[contains(text(),'Harry Potter')]")
		WebElement name;
		
		@FindBy(xpath="//button[contains(text(),'Login')]")
		WebElement Loginbutton;
		
		@FindBy(xpath="//span[contains(text(),'Harry Potter')]")
		WebElement message;
		
		@FindBy(xpath="(//button[@ng-class='btn btn-lg tab'])[2]")
		WebElement deposit;
		
		@FindBy(xpath="//button[@ng-click='withdrawl()']")
		WebElement withdrawl;
		
		@FindBy(xpath="//button[@ng-click='transactions()']")
		WebElement Transactions;
		
//		@FindBy(xpath="//button[@class='btn btn-lg tab'])[2]")
//		WebElement Depositclick;
//		
//	@FindBy(xpath="//button[@class='btn btn-lg tab'])[3]")
//	WebElement withdrawlclick;
//		
		
		
		
		
		//Initializing the Page Objects:
		public customerLoginpage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public customerLoginpage navigatetocustomerselection() {
		customerloginbutton.click();
		dropdown.click();
		name.click();
		Loginbutton.click();
		return new customerLoginpage();
		}
		public boolean navigatetocustomerhomepage() {
		return message.isDisplayed();
		}
	
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public CustomerDeposit navigatetodeposit() {
			deposit.click();
			return new CustomerDeposit();
			
		}
		
		public customerWithdrawl navigatetowithdrawl(){
			withdrawl.click();
			return new customerWithdrawl();
		}
	
		public customerTransactionPage navigatetotransactions() {
			Transactions.click();
			return new customerTransactionPage();
			
			
		}

		public void clickOnCustomerLogin() {
			// TODO Auto-generated method stub
			
		}

	

	
}