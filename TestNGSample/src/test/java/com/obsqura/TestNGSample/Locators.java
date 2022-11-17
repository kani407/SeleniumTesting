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
}
