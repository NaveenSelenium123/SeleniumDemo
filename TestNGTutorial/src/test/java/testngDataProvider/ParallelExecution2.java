package testngDataProvider;

import org.testng.annotations.Test;

public class ParallelExecution2 {
	@Test
	public void tc100() {
		System.out.println("TC100...."+" "+Thread.currentThread().getId());
	}
	@Test
	public void tc200() {
		System.out.println("TC200...."+" "+Thread.currentThread().getId());
	}
	@Test
	public void tc300() {
		System.out.println("TC300...."+" "+Thread.currentThread().getId());
	}
}
