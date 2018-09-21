import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {

	
	public static void main(String[] args) throws Exception{
		
		
		System.setProperty("webdriver.gecko.driver","D:\\My Data\\Selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		
		driver.wait(200);
	}
}
