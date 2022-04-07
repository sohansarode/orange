package com.abc.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browserlaunch;

public class time extends browserlaunch{

	public WebElement time() {
		
		return driver.findElement(By.xpath("//a[@id=\"menu_time_viewTimeModule\"]"));
	}
	
    public WebElement timesheet() {
    	
    	return driver.findElement(By.xpath("//a[@id=\"menu_time_Timesheets\"]"));
    }
	
	
}
