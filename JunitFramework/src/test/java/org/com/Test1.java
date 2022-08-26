package org.com;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {
	@Test
	public void tc1() {
System.out.println("TC1--------");		

	}
	@Test
	public void tc2() {
		Assert.assertTrue("Verify TC2",false);
	System.out.println("TC2------------");	
	}
}
