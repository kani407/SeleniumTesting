package com.obsqura.SeleniumAutomation;
import org.junit.Assert;
public class EdgeBrowserCommands extends EdgeBrowserBase {
	public void titleCompare() {
		String expectedTitle="Grocerystore";
		String title=driver.getTitle();
		Assert.assertEquals(expectedTitle, title);
	}
	public void getUrl() {
		String url=driver.getCurrentUrl();
		String expectedrUrl="https://opesmount.in/grocerystore1/";
		Assert.assertEquals(expectedrUrl, url);
	}
	public void navigation() {
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
			
	}
	public static void main(String args[]){
		EdgeBrowserCommands obj=new EdgeBrowserCommands();
		obj.initializeBrowse();
		obj.titleCompare();
		obj.getUrl();
		obj.navigation();
		obj.browserClose();
		obj.browserQuit();
	}
}
