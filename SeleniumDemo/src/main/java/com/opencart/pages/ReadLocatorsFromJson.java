package com.opencart.pages;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;

public class ReadLocatorsFromJson {

	public static void main(String[] args) throws IOException {
		
		File jsonfile=new File(System.getProperty("user.dir")+"\\RepositoryForLocators\\Locators.json");
		
     Object	myAcc_Btn=	JsonPath.read(jsonfile, "$." + "HomePage.MyAccount_Btn_LinkedText");
     Object	login_Btn=	JsonPath.read(jsonfile, "$." + "HomePage.Login_Btn_LinkedText");
     
     Object	email_textbox=	JsonPath.read(jsonfile, "$." + "Login_Page.Email_TextBox_id");
     Object	pass_textbox=	JsonPath.read(jsonfile, "$." + "Login_Page.password_TextBox_id");
     Object	login=	JsonPath.read(jsonfile, "$." + "Login_Page.Login_xPath");
     
     
     System.out.println(myAcc_Btn);
     
     System.out.println(login_Btn);
     System.out.println(email_textbox);
     System.out.println(pass_textbox);
     System.out.println(login);
     


	}

}
