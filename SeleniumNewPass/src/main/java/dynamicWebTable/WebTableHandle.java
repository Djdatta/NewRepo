package dynamicWebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableHandle {

	WebDriver driver;

	@BeforeMethod
	public void startUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumNewPass\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
	}

	@Test
	public void specificCellData() {
		// Get specific data
		String SecondRThrdColdata = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table//tbody/tr[2]/td[3]")).getText();
		System.out.println(SecondRThrdColdata);
	}

	@Test
	public void getMaxPrice() {

		List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));

		System.out.println("No. of colums = " + col.size());

		List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table//tbody/tr/td[1]"));

		System.out.println("No. of row = " + row.size());

		// Take all data from first column
		System.out.println("Following is the excpected Data..");

		for (int i = 1; i <= row.size(); i++) {

			// System.out.println(driver.findElement(By.xpath(*"//*[@id=\"leftcontainer\"]/table//tbody/tr["+i+"]/td[1]")).getText());

			String list = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table//tbody/tr[" + i + "]/td[4]")).getText();
			
			System.out.println(list);

		}
	}

	@Test
	public void getAllData() {

		WebElement myTabel = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table//tbody"));

		List<WebElement> rowTable = myTabel.findElements(By.tagName("tr"));

		int row_count = rowTable.size();

		System.out.println("No. of Row = " + row_count);

		for (int row = 0; row < row_count; row++) {

			// td in specific row
			List<WebElement> col_row = rowTable.get(row).findElements(By.tagName("td"));
			int col_count = col_row.size();

			System.out.println("Column count in row " + row + " is " + col_count);

			for (int col = 0; col < col_count; col++) {
				String colText = col_row.get(col).getText();

				System.out.println("Cell value of row no. " + row + " and col no. " + col + " is " + colText);
			}

		}

		/*
		 * //all td in table List<WebElement>
		 * col=myTabel.findElements(By.tagName("td"));
		 * 
		 * int col_count=col.size();
		 * 
		 * System.out.println("Col count is = "+col_count);
		 */
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
}
