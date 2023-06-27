package com.opencart.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver d;
	
	public static ReadConfig rc;
	
	@BeforeClass
	public void bc() throws Exception {
		
		rc=new ReadConfig();
		
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		
		d.get("https://awesomeqa.com/ui/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@AfterClass
	public void ac() throws InterruptedException {
		Thread.sleep(3000);
		d.close();
		d.quit();
		
	}

}
