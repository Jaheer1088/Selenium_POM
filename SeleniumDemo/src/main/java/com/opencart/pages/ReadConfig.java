package com.opencart.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties p;
	
	public ReadConfig() throws Exception {
		
		File file=new File(".//Configuration//config.properties");
		
		FileInputStream f=new FileInputStream(file);
		
		 p=new Properties();
		
		p.load(f);
	}
	
	public String URL() {
	return	p.getProperty("url");
	}
	
	public String UserName() {
		
		String name=p.getProperty("userName");
		return name;
	}
	
	public String password() {
		String password=p.getProperty("pass");
		return password;
	}

}
