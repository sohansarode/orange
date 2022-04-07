package com.abc.commonfunctionality;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenshot extends browserlaunch {

	
	
	
	
	public void screenshot() {
		TakesScreenshot screen =(TakesScreenshot)driver;
		File screenfile=screen.getScreenshotAs(OutputType.FILE);
		File destination =new File("result/test.png");
	    FileUtils obj =new FileUtils();
	    try {
			obj.copyFile(screenfile, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
