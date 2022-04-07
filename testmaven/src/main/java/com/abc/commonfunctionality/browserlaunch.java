package com.abc.commonfunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class browserlaunch {
	public static WebDriver driver;
	public static Properties property;
	public static String filepath;
	static ExtentReports report;
    static ExtentTest test;
    public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	public static void readproperty() {
		try {
			property = new Properties();
			property.load(new FileInputStream("src\\main\\resources\\config.properties"));

		} catch (FileNotFoundException e) {

		} catch (IOException t) {

		}
	}
   @BeforeSuite
	public void BrowserInitilisation() {
		this.readproperty();
		String Browsername = property.getProperty("Browsername");
		if (Browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/orange/src/main/resources/chromedriver - Copy.exe");
			driver = new ChromeDriver();

		} else if (Browsername.equalsIgnoreCase("FF")) {

			System.setProperty("webdriver.gecko.driver", "/orange/src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();

		} else {

			System.setProperty("webdriver.edge.driver", "");
			driver = new EdgeDriver();
		}
		driver.get(property.getProperty("url"));
		
	}
   
   
  /* @AfterSuite
   public void quitbrowser(){
	   
	   driver.quit();
	   
   }*/
   
   

}
