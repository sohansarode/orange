package com.abc.commonfunctionality;

import java.io.File;
import java.util.Date;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class report extends browserlaunch {
	@BeforeTest(alwaysRun=true)
	public static void report() {
		Date date = new Date();
		String timestamp = date.toString().replace(":", "-");
		File file = new File("result/" + timestamp);
		file.mkdir();
		filepath = file.getPath();
		report = new ExtentReports(file.getPath() + "/result.html",true);

	}

    public static void startTest(String testcase) {
		
		test = report.startTest(testcase);
	
	
}

    public static void PassTest(String teststep) {
		test.log(LogStatus.PASS, teststep);
	}

    public static void failtest(String fail) {
    	
		test.log(LogStatus.FAIL, fail,test.addScreenCapture(utlity.captureScreen()));
    	//test.log(LogStatus.FAIL, fail);
	}
    
    
    @AfterTest(alwaysRun=true)
	public static void endTest()
	{

		report.endTest(test);
		report.flush();
	}


}
