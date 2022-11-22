package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Locators extends BaseDriver {
@Test
	public void idLocators() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();	
	}
@Test
	public void classNameLocator() {
	driver.findElement(By.className("nav-logo-link"));
	}
@Test
	public void nameLocator() {
		driver.findElement(By.name("glow-validation-token"));
	}
@Test
	public void cssIdSelector() {
		driver.findElement(By.cssSelector("form#nav-search-bar-form"));
		
	}
@Test
	public void cssClassSelector() {
		driver.findElement(By.cssSelector("div.nav-right"));
	}
@Test
	public void cssAttributeSelector() {
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));
}
/*@Test
public void cssInnerTextSelector() {
	driver.findElement(By.cssSelector("a:contains(Customer Service)"));
}*/
@Test
public void cssIdXpath() {
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
}
@Test
public void cssClassXpath() {
	driver.findElement(By.xpath("(//div[@class='nav-fill'])[2]"));
	
}
}
