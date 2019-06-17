package planA_jira;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFromTexArea {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumNewPass\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/tags/tag_textarea.asp");
		driver.findElement(By.className("w3-code notranslate htmlHigh")).getText();
	}
}
