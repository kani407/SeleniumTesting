package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicCommandsOB extends BaseDriver {
@Test
	public void SingleInputFieldVerification() {
		String actualMsg,inputMsg="Your Message: Hello";
		String expectedMessage="Your Message : "+inputMsg;
		driver.findElement(By.id("single-input-field")).sendKeys(inputMsg);
		driver.findElement(By.id("button-one")).click();
		actualMsg=driver.findElement(By.id("message-one")).getText();
		Assert.assertEquals(actualMsg, expectedMessage," Message is not match");
		
	}
@Test
	public void twoInputFieldVerification() {
		String valueA="5",valueB="4";
		String val=valueA+valueB;
		String expectedResult="Total A + B :"+val;
		String actualResult;
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys(valueA);
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys(valueB);
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		actualResult=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(actualResult, expectedResult,"Total A + B : NAN" );
		
	}
}
