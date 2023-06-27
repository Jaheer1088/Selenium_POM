package com.opencart.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends BaseClass{
	
	
	@FindBy(partialLinkText= "My Account")
	 WebElement myAccount;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a")
	WebElement loginbtn;
	
	
	public HomePage() {
		
		PageFactory.initElements(d,this);
	}
	
	public void ClicksOnLogin() throws InterruptedException {
		
		Thread.sleep(2000);
		myAccount.click();
		
		Thread.sleep(2000);
		
		loginbtn.click();
	}

}
