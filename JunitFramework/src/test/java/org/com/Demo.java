package org.com;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Browser launch");
	}
@AfterClass
public static void afterClass() {
	System.out.println("close browser");
}
@Before
public void beforeMethod() {
	Date d =new Date();
	System.out.println(d);
}
@After
public void afterMethod() {	
Date d=new Date();
System.out.println(d);
}
@Test
public void tc1() {
	System.out.println("TC1...........................");
}
@Test
public void tc2() {
	System.out.println("TC2...................");
}
@Test
public void tc3() {
	System.out.println("TC3.......................");
}
}
