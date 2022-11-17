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
	     System.out.println("First method");   
	 }   
@BeforeMethod   
	public void before_method()   
	{   
	System.out.println("This method will be invoked before every test method");   
	}   
@BeforeClass   
	 public void before_class()   
	 {   
	     System.out.println("This method is executed before Class1");   
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
	     System.out.println("This  will be executed after all test methods ");   
	 }   
@AfterMethod   
	public void after_method()   
	{   
	System.out.println("This method will be invoked after the execution of each test method");   
	} 
@AfterSuite  
	public void after_suite()  
	{  
	    System.out.println("Last method");  	      
	}  
}