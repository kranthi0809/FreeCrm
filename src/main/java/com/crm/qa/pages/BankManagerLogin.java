package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;

public class BankManagerLogin extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement managerLoginBtn;
    
    
    

    public BankManagerLogin() {
        PageFactory.initElements(driver, this);
    }

    public  BankManagerLogin clickOnManagerLogin() {
    	managerLoginBtn.click();
		return new BankManagerLogin() ;
    }
}
