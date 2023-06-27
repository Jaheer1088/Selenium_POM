package com.opencart.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listener_ExtentReports implements ITestListener{
	
	ExtentSparkReporter htmlReports;
	ExtentReports reports;
	ExtentTest test;
	
	public void Configurattion() {
		
		String TimeStamp=new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportname="SeleniumProject"+TimeStamp+".html";
		
		htmlReports=new ExtentSparkReporter(System.getProperty("user.dir")+"//reports"+reportname);
		reports=new ExtentReports();
		reports.attachReporter(htmlReports);
		
		reports.setSystemInfo("OS :", "Windows");
		reports.setSystemInfo("Machine :", "PC");
		reports.setSystemInfo("Browser :", "Chrome");
		
		htmlReports.config().setDocumentTitle("ExtentReports");
		htmlReports.config().setReportName("SeleniumProject");
		htmlReports.config().setTheme(Theme.STANDARD);
		
		
	}
	
	public void onStart(ITestContext tc) {
		System.out.println("*************Execution Strated*************");
		Configurattion();
	}
	
	public void onFinish(ITestContext tc) {
		System.out.println("*************Execution Finished*************");
		reports.flush();
	}
	
	public void onTestStart(ITestResult tr) {
		System.out.println("*************Test Strated*************");
		
	}
	
//	public void onTestFinish(ITestResult tr) {
//		System.out.println("*************Test Finished*************");
//		
//	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("*************Test Failed*************");
		test=reports.createTest(tr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of test failed :" + tr.getName(), ExtentColor.RED));
		
		try {
			String path=CommonMethods.CaptureScreenShot(tr.getName());
			test.addScreenCaptureFromPath(path);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void onTestSucccess(ITestResult tr) {
		System.out.println("*************Test Passed*************");
		
		test=reports.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of test Passed :" + tr.getName(), ExtentColor.GREEN));
		
		try {
			String path=CommonMethods.CaptureScreenShot(tr.getName());
			test.addScreenCaptureFromPath(path);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//for screenshot use either of one
		
//		try {
//			test.addScreenCaptureFromPath(CommonMethods.CaptureScreenShot(tr.getName()));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	public void onTestSkipped(ITestResult tr) {
		System.out.println("*************Test Skipped*************");
		
		test=reports.createTest(tr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of test Skiped :" + tr.getName(), ExtentColor.BLUE));
	
	
	
	}
	

}
