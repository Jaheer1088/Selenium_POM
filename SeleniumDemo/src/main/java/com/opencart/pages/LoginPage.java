package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	
	@FindBy(id = "input-email")
	WebElement email;
	
	@FindBy(id = "input-password")
	WebElement pass;
	
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement login_btn;
	
	
	public LoginPage() {
		
		PageFactory.initElements(d,this);
		
	}
	
	public void ValidCredentials() throws InterruptedException {
		
		email.sendKeys("jbroman1088@gmail.com");
		pass.sendKeys("iiiiiiii");
		Thread.sleep(3000);
		
		login_btn.click();
		
	
	}

}
