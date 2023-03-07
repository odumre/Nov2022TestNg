package testngSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegetiveTest {

	public WebDriver driver;

	public boolean doLogin(String userName, String password) {
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errorMesg = driver.findElement(By.cssSelector("[class='alert alert-danger alert-dismissible']"))
				.getText();
		if (errorMesg.contains("Warning")) {
			return true;
		}
		return false;
	}

	@DataProvider
	public Object[][] getLoginNegativeData() {
		return new Object[][] { { "abc@gmail.com", "test123" }, { "abzzzzzc@gmail.com", "test123" }, { "", "test123" },
				{ "abc@gmail.com", "" }};
	}

	@Test(dataProvider = "getLoginNegativeData")
	public void loginTest(String userName, String password) {
		Assert.assertTrue(doLogin(userName, password));
	}

	@BeforeTest
	public void setup() {
		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
