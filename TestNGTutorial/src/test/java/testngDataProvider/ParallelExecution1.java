package testngDataProvider;

import org.testng.annotations.Test;

public class ParallelExecution1 {
	@Test
	public void tc1000() {
		System.out.println("TC1000...."+" "+Thread.currentThread().getId());
	}
	@Test
	public void tc2000() {
		System.out.println("TC2000...."+" "+Thread.currentThread().getId());
	}
	@Test
	public void tc3000() {
		System.out.println("TC3000...."+" "+Thread.currentThread().getId());
	}

}
