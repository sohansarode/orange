package com.abc.commonfunctionality;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonwait extends browserlaunch{

	public static WebElement waitforelement(WebDriver driver,By locator,int timeout) {
		WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		obj.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
		
		
	}
	}
	
	
	

