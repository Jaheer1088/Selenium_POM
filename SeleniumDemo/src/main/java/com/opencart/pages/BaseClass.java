package com.opencart.pages;


import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver d;
	
	public static ReadConfig rc;

	public static CommonMethods cm;
	
	public static Logger log;
	
	//public static String path=System.getProperty("user.dir")+"\\RepositoryForLocators\\Locators.json";
	
	@BeforeClass
	public void bc() throws Exception {
		
		log= LogManager.getLogger(BaseClass.class);
		
		rc=new ReadConfig();
		
		cm=new CommonMethods();
		
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		
		d.get("https://awesomeqa.com/ui/");
		
		log.info("Oening website");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	
	@AfterClass
	public void ac() throws InterruptedException {
		log.warn("Added wait");
		Thread.sleep(3000);
		d.close();
		d.quit();
		
		log.info("Quitting the driver and session");
		
	}

}
