package firefoxHeadlessMode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxSetUp {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		
		
		
		if (ChromeDriver2.browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumNewPass\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if (ChromeDriver2.browserName.equals("ff")) {
			
			//Notice care fuly key is gecko and value is chrome still it is not giving the error-- it will open chrome driver
			//System.setProperty("webdriver.gecko.driver", "D:\\SeleniumNewPass\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumNewPass\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
	/*	driver.get("http://www.facebook.com");
		
		String title=driver.getTitle();
		
		System.out.println("Title Name- " +title);*/
		
		String a=driver.getPageSource();
		
		System.out.println(a); 	//output-<html><head></head><body></body></html>
		
		try {
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println(driver.getWindowHandle());
			System.out.println(driver.toString());
			System.out.println(driver.hashCode());
			System.out.println(driver.getClass());
			System.out.println(driver.getWindowHandles());
			System.out.println(driver.manage().toString());
			System.out.println(driver.manage().hashCode());
			System.out.println(driver.manage().getClass());
			System.out.println(driver.manage().getCookieNamed(a));
			System.out.println(driver.manage().ime());
			System.out.println(driver.manage().logs());
			System.out.println(driver.manage().timeouts());
			System.out.println(driver.manage().window());
			System.out.println(driver.switchTo().parentFrame());
			
			driver.quit();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	
}
