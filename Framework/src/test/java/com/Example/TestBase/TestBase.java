package com.Example.TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.Example.Utilities.Util;



public class TestBase {
	
	
	public FileInputStream ip;
	public WebDriver driver;
	public ChromeOptions options;
	public FirefoxOptions optionf;
	public EdgeOptions optionE;
	public Properties ConfigData;
	public Properties TestData;
	
	public TestBase()throws IOException {
		ConfigData = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\Example\\ConfigData\\ConfigData.properties");
		ConfigData.load(ip);
		
		TestData = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\Example\\TestData\\TestData.properties");
		TestData.load(ip);
	}
	
	public WebDriver openBrowserAndDirectToUrl(String browsers) {
		
		if(browsers.equals("Chrome")) {
			options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			options.addArguments(Arrays.asList("--incognito", "--start-maixmized"));
			options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
			driver = new ChromeDriver(options);
		} else if(browsers.equals("FireFox")){
			optionf = new FirefoxOptions();
			optionf.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			optionf.addArguments("-private");
			driver = new FirefoxDriver(optionf);
			driver.manage().window().maximize();
		} else if(browsers.equals("Edge")) {
			optionE = new EdgeOptions();
			optionE.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			optionE.addArguments(Arrays.asList("--inprivate", "--start-maximized"));
			
			
		} else {
			System.out.println("Invalid browser entry, please choose a valid browser");
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Util.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Util.PAGELOAD_TIME));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Util.SCRIPT_TIME));
		
		driver.get(ConfigData.getProperty("url"));
		return driver;
	}
	

}
