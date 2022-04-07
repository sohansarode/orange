package com.abc.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browserlaunch;

public class forgotpassword extends browserlaunch{
	
	public WebElement forgot() {
		return driver.findElement(By.xpath("//a[@href=\"/index.php/auth/requestPasswordResetCode\"]"));
	}
	

	public WebElement cancel() {
		return driver.findElement(By.id("btnCancel"));
		
		
		
	}
	
	
	public List<WebElement>label() {
		return driver.findElements(By.xpath("//input[@id=\"tnSearchValues\"]"));
	}
	
	public void m1() {
		this.forgot().click();
		
	}
	
	public void m2() {
		this.forgot().click();
		
	}

}
