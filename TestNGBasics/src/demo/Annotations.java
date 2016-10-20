package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotations {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("AfterClass");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("AfterSuite");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("AfterMethod");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("AfterTest");
	}
	
	@Test
	public void test1(){
		System.out.println("Test1");
	}
	
	@Test
	public void test2(){
		System.out.println("Test2");
	}
	

}
