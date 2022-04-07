package com.orange.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.qa.common.browserlaunch;
import com.orange.qa.pages.dashboard;
import com.orange.qa.pages.loginpage;

public class loginpagestest extends browserlaunch{
    
	public loginpagestest() {
    	super();
    }
	
	
	
	
	@BeforeMethod
	public void browser() {
		initialization();
	}
	
	
	@Test(description="verify url launch successfully")
	public void TC1() {
	    loginpage login=new loginpage();
		String title=login.verifytitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@Test
	public void TC2() {
	    loginpage login1=new loginpage();
	    boolean flag=login1.verifyloginlogo();
	    Assert.assertTrue(flag);
	      
	}
	@Test
	public void TC3() {
		loginpage login2=new loginpage();
		dashboard dash=new dashboard();
		dash=login2.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
	}
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
