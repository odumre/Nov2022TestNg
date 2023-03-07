package testngSession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{


//testcase should be independent.
	//AAA rule---> Arrange,Act, Assert. This is commonly ....
	// One test case One Assert is good practise
	@Test()
	public void titlTest() {
		
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		Assert.assertEquals(title, "1Amazon.com. Spend less. Smile more.");
	}
@Test()
	public void searchExistTest() {
		boolean flag = driver.findElement(By.cssSelector("#twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test()
	public void isHelpExistTest() {
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
	}
	

}
