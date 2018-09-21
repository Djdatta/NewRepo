
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\My Data\\Selenium\\geckodriver.exe");
		
		 WebDriver driver=new FirefoxDriver();
		
		 //driver.manage().window().maximize();
		
		 // get url
		driver.get("https://accounts.google.com/SignUp");
		
		//get firstname field and insert data.
		driver.findElement(By.id("FirstName")).sendKeys("Datta");
		
		driver.findElement(By.id("LastName")).sendKeys("Jadhav");
		
		
		driver.findElement(By.id("GmailAddress")).sendKeys("dmjadhav123");
		
		
		driver.findElement(By.id("Passwd")).sendKeys("123444sdfs");
		
		driver.findElement(By.id("PasswdAgain")).sendKeys("123444sdfs");
		
		
		driver.findElement(By.className("i18n_phone_number_input-inner_input")).sendKeys("9922130484");
		
	
	}

	

}
