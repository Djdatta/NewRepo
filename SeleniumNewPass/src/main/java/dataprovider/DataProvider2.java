package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {

	WebDriver driver;
	
	@BeforeMethod
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumNewPass\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	
	@DataProvider(name="hello")
	public Object[][] getData() {
		return new Object[][]{{"adim","adimn"},{"admin123","admin123"}};
		
		
	}
	
	@Test(dataProvider="hello")
	public void testData(String uname, String pwd) {
	
		System.out.println(uname+" "+pwd);
		
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
