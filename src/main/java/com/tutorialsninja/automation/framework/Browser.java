package com.tutorialsninja.automation.framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import com.tutorialsninja.automation.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public  class Browser {
	public static Logger log = Logger.getLogger(Browser.class);
     static Properties prop;
	 static WebDriver driver;
	public static WebDriver startBrowser() {
		String browser = Base.reader.getBrowser().toLowerCase();
		log.info("Selected Browser is: "+browser);
		prop = new Properties();
		File propFile=new File(System.getProperty("user.dir")+"src/main/resources/ConfigurationFile/config.properties");

		try {
			FileInputStream fis = new FileInputStream(propFile);
			prop.load(fis);
			System.out.println(prop);
		} catch (Throwable e) {
			e.printStackTrace();
		}

		switch (browser){
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver =new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		}


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// take it from data.properties
		driver.get(prop.getProperty("url"));
		return driver;

	}


	public static void maximize() {
		Base.driver.manage().window().maximize();
	}

	public static byte[] takeScreenshot() {
		try {
			return ((TakesScreenshot)Base.driver).getScreenshotAs(OutputType.BYTES);
		}
		catch(Exception e){
			log.info("Exception has Occured while taking screenshot");
			return null;
		}

		

	}
}
