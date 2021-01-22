package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
		static WebDriver driver;
		public static WebDriver getDriver(String browser) {
		if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\BABU\\eclipse-workspace\\POM\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}else if(browser.equals("firefox")){
		System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\BABU\\eclipse-workspace\\POM\\driver\\chromedriver.exe");
		driver = new FirefoxDriver();
		}else if(browser.equals("ie")){
		System.setProperty("webdriver.ie.driver",
		"C:\\Users\\BABU\\eclipse-workspace\\POM\\driver\\chromedriver.exe");
		driver = new InternetExplorerDriver();
		}else if(browser.equals("opera")){
		System.setProperty("webdriver.opera.driver",
		"C:\\Users\\BABU\\eclipse-workspace\\POM\\driver\\chromedriver.exe");
		driver = new OperaDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://www.adactin.com/HotelApp/");
		return driver;
		}
		}
		