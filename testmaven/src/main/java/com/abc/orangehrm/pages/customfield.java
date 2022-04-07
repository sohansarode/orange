package com.abc.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browserlaunch;

public class customfield extends browserlaunch{

	public WebElement editbutton() {
		return driver.findElement(By.xpath("//input[@id=\"btnEditCustom\"]"));
	}
	
	public WebElement bloodtype() {
		return driver.findElement(By.xpath("//select[@name=\"custom1\"]"));
	}
	
	public WebElement savebtn() {
		return driver.findElement(By.xpath("//input[@id=\"btnEditCustom\"]"));
	}
	
}
