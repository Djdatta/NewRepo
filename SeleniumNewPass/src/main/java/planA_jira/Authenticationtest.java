package planA_jira;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationtest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumNewPass\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://mdc-tomcat-jira139.ubisoft.org/jira/login.jsp");
		
				
		driver.findElement(By.name("os_username")).sendKeys("dattatray.jadhav@ubisoft.com");
		driver.findElement(By.name("os_username")).clear();
		//driver.findElement(By.xpath("input[@name='os_password']")).sendKeys("Djdatta@12");
		Thread.sleep(10000);
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.findElement(By.name("os_username")).getAttribute("name"));
	}
}
