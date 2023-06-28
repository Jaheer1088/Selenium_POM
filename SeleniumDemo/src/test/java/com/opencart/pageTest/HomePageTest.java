package com.opencart.pageTest;

import org.testng.annotations.Test;

import com.opencart.pages.BaseClass;
import com.opencart.pages.HomePage;

public class HomePageTest extends BaseClass {
	
	HomePage hp;
	
	@Test
	public void Login() throws InterruptedException {
		hp=new HomePage();
		
		hp.ClicksOnLogin();
		
		
	}

}
