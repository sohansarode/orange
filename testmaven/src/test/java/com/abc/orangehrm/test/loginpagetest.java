package com.abc.orangehrm.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.abc.commonfunctionality.actionsex;
import com.abc.commonfunctionality.browserlaunch;
import com.abc.commonfunctionality.commonwait;
import com.abc.commonfunctionality.screenshot;
import com.abc.orangehrm.pages.dashboard;
import com.abc.orangehrm.pages.forgotpassword;
import com.abc.orangehrm.pages.login;
import com.abc.orangehrm.pages.myinfo;
import com.abc.orangehrm.pages.time;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class loginpagetest extends browserlaunch {
	static ExtentReports report;
    static ExtentTest test;
	
 
	
	@BeforeClass(alwaysRun=true)
    public  void starttest() {
	report=new ExtentReports("result/result.html",true);
		
	}
	
	@Test(description="verify that user is able with invalid credentials ")
	public void TC1() {
		test =report.startTest("verify that user is able to login successfully with valid credential");
		login login=new login(driver);
		login.logi("Admin","adadff");
		if(login.invalidmessage().isDisplayed()) {
			test.log(LogStatus.PASS,"test is pass");
			
			
		}else {
			test.log(LogStatus.FAIL,"test is fail");
			
		}
		
	}
	
	
	/*@Test(description="verify that user is able to login successfully")
	public void TC2() {
	  test =report.startTest("verify that user is able to login successfully with valid credential");
		login login=new login(driver);
		dashboard dash=new dashboard();
		login.logi("Admin","admin123");
	   commonwait com=new commonwait();
	  	By p=By.id("menu_dashboard_index");
	  	com.waitforelement(driver, p, 10);
		if(dash.dashboard().isDisplayed()) {
			test.log(LogStatus.PASS,"test is pass");
			
			
		}else {
			test.log(LogStatus.FAIL,"test is fail");
			
		}
		WebElement d=driver.findElement(By.id("menu_pim_viewMyDetails"));

		actionsex obj=new actionsex();
		obj.rightclick(d);
		
		
		
	}
	@Test
	public void tim() {
		time obj=new time();
		obj.time().click();
		WebElement cd=obj.timesheet();
		actionsex ob2=new actionsex();
		ob2.mousehover(cd);
	}

*/	@Test
	public void forg() {
	
	 test =report.startTest("verify that forgot");
		forgotpassword obj5=new forgotpassword();
		obj5.m1();
		  	
		if(obj5.label().size()>0) {
			test.log(LogStatus.PASS,"test is pass");
			
			
		}else {
			test.log(LogStatus.FAIL,"test is fail");
	}
}
	
	
	@AfterClass(alwaysRun=true)
	public void endtest() {
		report.endTest(test);
		report.flush();
		
	}
	
	
	
}//dash.dashboard().isDisplayed(
