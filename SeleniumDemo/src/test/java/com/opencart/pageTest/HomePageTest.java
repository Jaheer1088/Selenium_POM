package com.opencart.pageTest;

import org.testng.annotations.Test;

import com.opencart.pages.BaseClass;
import com.opencart.pages.HomePage;

public class HomePageTest extends BaseClass {
	
	
	
	@Test
	public void Login() throws InterruptedException {
		HomePage hp=new HomePage();
		
		hp.ClicksOnLogin();
		
		
	}

}
