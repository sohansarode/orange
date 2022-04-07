package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.common.browserlaunch;

public class loginpage extends browserlaunch {
      
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;
	
	@FindBy(id="logInPanelHeading")
	WebElement loginpanellogo;
	
	public loginpage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifytitle() {
		return driver.getTitle();
	}
	
	public boolean verifyloginlogo() {
		return loginpanellogo.isDisplayed();
	}
	
	
	public dashboard login(String un,String pas) {
		username.sendKeys(un);
		password.sendKeys(pas);
		loginbtn.click();
		dashboard dash=new dashboard();
		return  dash;
	}
	
	
	
	
	
	
	
	
	
}
