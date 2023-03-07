package testngSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	//global pre conditions
	//pre conditions
	//test case ----->test steps--->act vs exp result --->Assetion
	//post steps
	///post global steps
	@BeforeSuite
	public void startDBConnection() {
		System.out.println("This is demo line");
		System.out.println("BS---StartDBConnection");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT ---> CreateUser");
	}
	@BeforeClass
	public void lanucBrowser() {
		System.out.println("BC----> lancuh Browser");
		
	}
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM----loginToApp");
	}
		
		@Test
		public void homePageTitleTest() {
			System.out.println("Homepage Title Test");
		}
		@Test
		public void homePageUrlTest() {
			System.out.println("HomepageUrl Test");
		}
		@Test
		public void homePageSerchTest() {
			System.out.println("Home page Serach Test");
		}
	
	@AfterSuite
	public void disconnetDBConnection() {
		System.out.println("AS---DisconnectDB Connection");
	}
	@AfterTest
	public void deleteUser() {
		System.out.println("AT ---> Delete  User");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC----> close Browser");
		
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM-------logout");
	}
	
	

}
