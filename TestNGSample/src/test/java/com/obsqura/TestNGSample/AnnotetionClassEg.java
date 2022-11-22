package com.obsqura.TestNGSample;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class AnnotetionClassEg {
@BeforeSuite   
	 public void before_suite()   
	 {   
	     System.out.println("@BeforeSuite");   
	 }   
@BeforeMethod   
	public void before_method()   
	{   
	System.out.println("@BeforeMethod   ");   
	}   
@BeforeClass   
	 public void before_class()   
	 {   
	     System.out.println("@BeforeClass ");   
	 }   
@Test   
	 public void testcase2()   
	 {   
	     System.out.println("Test case2");   
	 }   
 @Test   
 	public void testcase1()   
	 {   
	     System.out.println("Test case1");   
	 }   
@AfterClass   
	 public void after_class()   

	 {   
	     System.out.println("@AfterClass ");   
	 }   
@AfterMethod   
	public void after_method()   
	{   
	System.out.println("@AfterMethod");   
	} 
@AfterSuite  
	public void after_suite()  
	{  
	    System.out.println("@AfterSuite");  	      
	}  
}