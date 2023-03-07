package testngSession;

import org.testng.annotations.Test;

public class InvocationCount {//if same pruduct serch again and again that time same test case we can use
	@Test(invocationCount=10)
	public void createUserTest() {
		System.out.println("create user");
	}

}
