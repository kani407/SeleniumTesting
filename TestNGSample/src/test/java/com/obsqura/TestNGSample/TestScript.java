package com.obsqura.TestNGSample;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class TestScript extends BaseDriver {	
@Test
	public void verifyUrl() {
		String expectedUrl="https://www.amazon.com/";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}
@Test
public void verifyTitle() {
		String expectedTitle="Amazon.com. Spend less. Smile more.";
		String title=driver.getTitle(); 
		Assert.assertEquals(title, expectedTitle);
	}
@Test
	public void verifyTitleWithException() {
		String expectedTitle="Amazon.com. Spend less. Smile mre.";
		String title=driver.getTitle(); 
		Assert.assertEquals(title, expectedTitle);	
	}
@Test
	public void softAssertSample() {
		SoftAssert softAssert=new SoftAssert();
		String expectedUrl="https://www.amazon.com/";
		String actualUrl=driver.getCurrentUrl();
		softAssert.assertEquals(expectedUrl, actualUrl);
		String expectedTitle="Amazon.com. Spend less. Smile more.";
		String title=driver.getTitle(); 
		softAssert.assertEquals(expectedTitle, title);
		
		softAssert.assertAll();
	}
@Test
	public void softAssertSampleWithException() {
		SoftAssert softAssert=new SoftAssert();
		String expectedUrl="https://www.amazon.com/";
		String actualUrl=driver.getCurrentUrl();
		softAssert.assertEquals(expectedUrl, actualUrl);
		String expectedTitle="Amazon.com. Spend less. Smile mre.";
		String title=driver.getTitle(); 
		softAssert.assertEquals(expectedTitle, title);
		
		softAssert.assertAll();
	}	
}