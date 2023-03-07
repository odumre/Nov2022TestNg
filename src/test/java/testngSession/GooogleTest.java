package testngSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GooogleTest extends BaseTest {
	
	
	@Test()
	public void titlTest() {
		
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		Assert.assertEquals(title, "Google");
	}

}
