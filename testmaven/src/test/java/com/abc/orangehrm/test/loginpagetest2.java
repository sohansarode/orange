package com.abc.orangehrm.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.abc.commonfunctionality.browserlaunch;
import com.abc.commonfunctionality.commonwait;
import com.abc.commonfunctionality.readexcel;
import com.abc.commonfunctionality.report;
import com.abc.orangehrm.pages.dashboard;
import com.abc.orangehrm.pages.login;
import com.relevantcodes.extentreports.LogStatus;

public class loginpagetest2 extends report{

	/*@Test(description="verify that user is able to login successfully")
	public void TC2() {
		report.startTest("verify that user is able to login successfully");
		login login=new login(driver);
	
		login.logi("Admin123","admin123");
	  //commonwait com=new commonwait();
	  //	By p=By.id("menu_dashboard_index");
	  	//com.waitforelement(driver, p, 10);
		dashboard dash=new dashboard(driver);
		if(dash.dashboard().size()>0) {
			
			System.out.println("abc");
			report.PassTest("pass");
		}else  {
			
			report.failtest("fail");
			System.out.println("failure");
		}
	

		
	
	
		
}*/

	@Test(description="verify that user is able to login successfully")
	public void TC3() {
		report.startTest("verify that user is able to login successfully");
		login login=new login(driver);
	
		login.logi(readexcel.getStringCellData("TC1","UserName"),readexcel.getStringCellData("TC1", "Password"));
	  //commonwait com=new commonwait();
	  //	By p=By.id("menu_dashboard_index");
	  	//com.waitforelement(driver, p, 10);
		dashboard dash=new dashboard(driver);
		if(dash.dashboard().size()>0) {
			
			System.out.println("abc");
			report.PassTest("pass");
		}else  {
			
			report.failtest("fail");
			System.out.println("failure");
		}
	
	
}
	
	
	}
