package com.abc.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browserlaunch;

public class myinfo extends browserlaunch{

	public WebElement myinfoclcick() {
		return driver.findElement(By.id("menu_pim_viewMyDetails"));
	}
	
	public WebElement personaldetaillabel() {
		return driver.findElement(By.xpath("//h1[text()=\"Personal Details\"]"));
	}
	
	
	public WebElement editbtn() {
		return  driver.findElement(By.xpath("//input[@id=\"btnSave\"]"));
	}
	
	public WebElement firstname() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_txtEmpFirstName\"]"));
	}
	
	public WebElement middlename() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_txtEmpMiddleName\"]"));
	}
	
	public WebElement lastname() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_txtEmpLastName\"]"));
	}
	
	public WebElement employeeid() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_txtEmployeeId\"]"));
	}
	
	public WebElement otherid() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_txtOtherID\"]"));
	}
	
	public WebElement driverlicense() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_txtLicenNo\"]"));
	}
	
	public WebElement ssnnumber() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_txtNICNo\"]"));
	}
	
	public WebElement sinnumber() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_txtSINNo\"]"));
	}
	
	public WebElement gendermale() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_optGender_1\"]"));
	}
	
	public WebElement genderfemale() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_optGender_2\"]"));
	}
	
	public WebElement maritialstatus() {
		return  driver.findElement(By.xpath("//select[@id=\"personal_cmbMarital\"]"));
	}
	
	public WebElement nationality() {
		return  driver.findElement(By.xpath("//select[@id=\"personal_cmbNation\"]"));
	}
	
	public WebElement nickname() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_txtEmpNickName\"]"));
	}
	
	public WebElement militaryservice() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_txtMilitarySer\"]"));
	}

	public WebElement smoker() {
		return  driver.findElement(By.xpath("//input[@id=\"personal_chkSmokeFlag\"]"));
	}
	
	public WebElement savebutton() {
		return  driver.findElement(By.xpath("//input[@id=\"btnSave\"]"));
	}
	
	
	
	
	
	
	
	
	
	
}
