package com.obsqura.TestNGSample;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseDriver {
	public WebDriver driver;
@BeforeTest
	public void initializeBrowse() {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\SampleJunit\\src\\main\\java\\Resources\\chromedriver.exe");
				driver=(WebDriver) new ChromeDriver();
				driver.get("https://www.amazon.com/");
			}
			public void browserClose() {
				driver.close();
			}
@AfterTest
			public void browserQuit() {
				driver.quit();
			}

}
