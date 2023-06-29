package com.opencart.pageTest;

import org.testng.annotations.Test;

import com.opencart.pages.BaseClass;
import com.opencart.pages.HomePage;
import com.opencart.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	
	LoginPage lp;
	HomePage hp;
	
	
	@Test
	public void login() throws InterruptedException {
		
		hp=new HomePage();
		lp=new LoginPage();
		
		hp.ClicksOnLogin();
		
		lp.ValidCredentials();
	}

}
