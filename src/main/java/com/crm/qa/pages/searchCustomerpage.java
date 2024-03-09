package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class searchCustomerpage extends TestBase {

	@FindBy(xpath = "//button[@ng-class='btnClass3']")
    WebElement CustomerBtn;
	//@FindBy(xpath = "//button[@ng-class='btnClass3']")
    //WebElement customerBtn;
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement customeNameBtn;
    
    
    

    public searchCustomerpage() {
        PageFactory.initElements(driver, this);
    }
    
  //customerBtn.click();

    public  searchCustomerpage clickOnCustomerLogin() {
    	CustomerBtn.click();
    	
		return new searchCustomerpage();
       
        
    }
    
    
    public  searchCustomerpage searchCustomer(String customerName) {
    	
    	customeNameBtn.sendKeys(customerName);

		return new searchCustomerpage();
    }
    	
}
 