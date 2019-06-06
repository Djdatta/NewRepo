import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class NewLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumNewPass\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//driver.findElement(new ByAll(By.name("q"), By.className("gLFyf gsfi"), By.xpath("//@input[@class='gLFyf gsfi']"))).sendKeys("Datta");
		
	//	driver.findElement(new ByIdOrName("q")).sendKeys("Datta"); 
		
		driver.findElement(new ByChained(By.className("a4bIc"), By.className("vdLsw gsfi"),By.name("q"))).sendKeys("Datta");
	}
}
