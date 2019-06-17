package dataprovider;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot {

	
	WebDriver driver;
	
	@BeforeMethod
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumNewPass\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
	}

	@Test
	public void takeScreenShot() throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		//copy to destination
		FileUtils.copyFile(src, new File("D:\\google.jpg"));
		System.out.println("done");

	}
	
	@Test
	
	public void takeAnotherScreenShot() throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("D:\\a.jpg"));
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	
}
