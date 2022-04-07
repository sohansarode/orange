package com.abc.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.browserlaunch;


public class login{
	WebDriver driver;
	
	  public login(WebDriver driver) {
		  this.driver=driver;
	 }
	  
	  
	  public WebElement getUsernametxt() {
		return driver.findElement(By.id("txtUsername"));
	  }
	  
	  
	  public WebElement getPasswordtxt() {
		  return driver.findElement(By.id("txtPassword"));
		
	  }
	  
	  public WebElement  button() {
		  return driver.findElement(By.id("btnLogin"));
		  
	  }
	  
	  
	  public WebElement invalidmessage() {
		  return driver.findElement(By.xpath("//span[@id=\"spanMessage\"]"));
	  }
	  
	  public void logi(String username,String password) {
		  getUsernametxt().sendKeys(username);
		  getPasswordtxt().sendKeys(password);
		  button().click();
		  
	  }
	  
	  
}
