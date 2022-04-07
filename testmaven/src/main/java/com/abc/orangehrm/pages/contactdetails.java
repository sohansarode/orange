package com.abc.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browserlaunch;

public class contactdetails extends browserlaunch{

	public WebElement editbutton() {
		return driver.findElement(By.xpath("//input[@id=\"btnSave\"]"));
	}
	
	
	public WebElement addressstreet(){
		return driver.findElement(By.xpath("//input[@id=\"contact_street1\"]"));
	}
	
	public WebElement city(){
		return driver.findElement(By.xpath("//input[@id=\"contact_city\"]"));
	}
	
	public WebElement state(){
		return driver.findElement(By.xpath("//input[@id=\"contact_province\"]"));
	}

	public WebElement zipcode(){
		return driver.findElement(By.xpath("//input[@id=\"contact_emp_zipcode\"]"));
	}
	
	
	public WebElement country(){
		return driver.findElement(By.xpath("//select[@id=\"contact_country\"]"));
	}
	
	public WebElement hometelephone(){
		return driver.findElement(By.xpath("//input[@id=\"contact_emp_hm_telephone\"]"));
	}
	
	public WebElement mobile(){
		return driver.findElement(By.xpath("//input[@id=\"contact_emp_mobile\"]"));
	}
	
	public WebElement savebtn(){
		return driver.findElement(By.xpath("//input[@id=\"btnSave\"]"));
	}
	
	
}
