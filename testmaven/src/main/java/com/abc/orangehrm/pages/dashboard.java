package com.abc.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browserlaunch;

public class dashboard  {
	WebDriver driver;
	
	  public dashboard(WebDriver driver) {
		  this.driver=driver;
	 }

	public List<WebElement> dashboard() {
		return driver.findElements(By.id("menu_dashboard_index"));
		
	}

}
