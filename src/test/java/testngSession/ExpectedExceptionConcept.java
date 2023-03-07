package testngSession;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void loginTest() {
		System.out.println("login Test");
		int i=9/0;
	}
	@Test(expectedExceptions=Exception.class)
	public void loginTest1() {
		System.out.println("login Test");
		int i=9/0;
	}
	@Test(expectedExceptions=Throwable.class)
	public void loginTest2() {
		System.out.println("login Test");
		int i=9/0;
	}

}
