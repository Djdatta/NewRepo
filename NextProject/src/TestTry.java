import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestTry {

	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","D:\\My Data\\Selenium\\geckodriver.exe");
		
		 WebDriver driver=new FirefoxDriver();
		
		 //driver.manage().window().maximize();
		
		 
		 
		 // get url
		driver.get("https://accounts.google.com/SignUp");
		
		System.out.println("Google window is open!!!!");
				
		driver.findElement(By.id("FirstName")).sendKeys("Datta");
		
		driver.findElement(By.id("LastName")).sendKeys("Jadhav");
		
		driver.findElement(By.id("GmailAddress")).sendKeys("dattjadhav");
		
		driver.findElement(By.name("Passwd")).sendKeys("qwert123");
		
		driver.findElement(By.id("PasswdAgain")).sendKeys("qwert123");
		
		//driver.findElement(By.className(" form-error")).sendKeys("qwer123");
		
		driver.findElement(By.id("submitbutton")).click();
		
//			WebElement dayObj=driver.findElement(By.className("goog-inline-block goog-flat-menu-button jfk-select"));
//			
//			Select selectDay=new Select(dayObj);
//			
//			selectDay.selectByVisibleText("day-label");
		
		System.out.println("Will close now");
		
		
		
	
		
	}
}
