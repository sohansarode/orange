package com.abc.commonfunctionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testpage {
	@FindBy(id="")
	WebElement username;
	public testpage() {
		PageFactory.initElements(browserlaunch.driver, this);
	}
		
	}
	
	

