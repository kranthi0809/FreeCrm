package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class openAccountpage extends TestBase {

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement openAccountBtn;

    @FindBy(xpath = "(//option[@ng-repeat='cust in Customers'])[4]")
    WebElement customerDropdown;

    @FindBy(xpath = "//option[@value='Rupee']")
    WebElement currencyDropdown;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processBtn;

    public openAccountpage() {
        PageFactory.initElements(driver, this);
    }

    public openAccountpage clickOnOpenAccount() {
        openAccountBtn.click();
		return new openAccountpage();
    }
    public openAccountpage ClickonCustomerDropdown() {
        customerDropdown.click();
		return new  openAccountpage();
        
    }
    public openAccountpage ClickonCurrencyDropdown() 
    {
    	currencyDropdown.click();
    	
		return new openAccountpage();
		
    }
    public openAccountpage Processbutton() {
    	processBtn.click();
		return new openAccountpage();
    }

	public boolean isAccountOpenedSuccessfully() {
		// TODO Auto-generated method stub
		return true;
	}
}
  