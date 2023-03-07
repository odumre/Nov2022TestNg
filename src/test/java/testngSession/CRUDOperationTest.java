package testngSession;

import org.testng.annotations.Test;

public class CRUDOperationTest {
	
public void createUser() {
	System.out.println("createUser");
}
public void getUser() {
	
}
public void updateUser() {
	
}
public void deleteUser() {
	
}
	@Test
	public void createUsetTest() {
		createUser();
	}
	@Test
	public void getUserTest() {
		System.out.println("getUserTest");
		createUser();//post
		getUser();//get
	}
	@Test
	public void updateUserTest() {
		createUser();//post
		getUser();//get
		updateUser();//put
		getUser();//get
	}
	@Test
	public void deleteUserTest() {
		getUserTest();
		createUser();//post
		getUser();//get
		deleteUser();//delete
		getUser();//get
	}
	
}
