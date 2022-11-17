package com.obsqura.SeleniumAutomation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserBase
	{
		public WebDriver driver;
		public void initializeBrowse() {
			System.setProperty("webdriver.edge.driver","C:\\Users\\admin\\eclipse-workspace\\SeleniumAutomation\\src\\main\\java\\Resources\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://opesmount.in/grocerystore1/");
		}
		public void browserClose() {
			driver.close();
		}

		public void browserQuit() {
			driver.quit();
		}	
	}