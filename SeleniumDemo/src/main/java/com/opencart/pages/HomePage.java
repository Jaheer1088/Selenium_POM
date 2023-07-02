package com.opencart.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends BaseClass{
	
	
	// i think pom using page factory doesn't support locators from json or from separate class
	@FindBy(partialLinkText= "My Account")
	 WebElement myAccount;
	
	// this model of pom supports locators from separate class.
	// By account=By.partialLinkText(Locator.MyAccount_Btn_LinkedText);
	
	
	
	
	//@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a")
	@FindBy(partialLinkText = "Login")
	WebElement loginbtn;
	
	
	public HomePage() {
		
		PageFactory.initElements(d,this);
	}
	
	public void ClicksOnLogin() throws InterruptedException {
		
		CommonMethods.explictwait(myAccount);
		myAccount.click();
		
		CommonMethods.explictwait(loginbtn);
		
		loginbtn.click();
	}

}
