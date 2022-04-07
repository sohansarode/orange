package com.abc.commonfunctionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actionsex extends browserlaunch{
 
	public void rightclick(WebElement s) {
		Actions act=new Actions(driver);
		act.contextClick(s).perform();
		
		
	}
	
	public void mousehover(WebElement a) {
		Actions act1=new Actions(driver);
		act1.clickAndHold(a).perform();
	}
	
	
	
	
	
	
	
}
