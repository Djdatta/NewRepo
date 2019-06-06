package infosys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XB1 {

	WebDriver driver;

	@BeforeMethod
	public void startUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumNewPass\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		// driver.get("https://10.206.39.86:11443/#Home");
		driver.get("http://builddb/");
	}

	@Test
	public void BuildDBXB1() throws IOException {
		
		WebElement studioList = driver.findElement(By.id("ctl00_ContentMain_ProjectsList"));

		Select puneStudio = new Select(studioList);

		puneStudio.selectByVisibleText("Far Cry Tetra - Pune");

		// Select Platform XB1(Durango)

		driver.findElement(By.xpath("//*[contains(text(),'Durango')]")).click();

		// Get build version name

		String buildVersion = driver
				.findElement(By.xpath(
						"//*[@id=\"ctl00_ContentMain_rptPlatformContents_ctl01_GridViewPlatforms\"]/tbody/tr[2]/td[3]"))
				.getText();

		System.out.println("Build Version =" + buildVersion);

		// Get build size
		String buildSize = driver
				.findElement(By.xpath(
						"//*[@id=\"ctl00_ContentMain_rptPlatformContents_ctl01_GridViewPlatforms\"]/tbody/tr[2]/td[7]"))
				.getText();

		System.out.println("Build size=" + buildSize);

		//If we need to convert string to double
		
		double d = Double.parseDouble(buildSize);

		System.out.println(d);

		// Get code data & sound

		String code = driver.findElement(By
				.xpath("//*[@id=\"ctl00_ContentMain_rptPlatformContents_ctl01_GridViewPlatforms\"]/tbody/tr[2]/td[12]"))
				.getText();

		String data = driver.findElement(By
				.xpath("//*[@id=\"ctl00_ContentMain_rptPlatformContents_ctl01_GridViewPlatforms\"]/tbody/tr[2]/td[13]"))
				.getText();

		String sound = driver.findElement(By
				.xpath("//*[@id=\"ctl00_ContentMain_rptPlatformContents_ctl01_GridViewPlatforms\"]/tbody/tr[2]/td[14]"))
				.getText();

		System.out.println("Code= " + code + " Sound = " + sound + " Data " + data);
	
		// Add to Excel
		// obtains input bytes from a file
		FileInputStream io = new FileInputStream(
				"D:\\My Data\\SeleniumNewPass_6thOct\\SeleniumNewPass\\src\\main\\java\\infosys\\xb.xlsx");

		// pipeline between sheet and eclipse
		XSSFWorkbook workbook = new XSSFWorkbook(io);

		// Get sheet
		XSSFSheet sheet = workbook.getSheet("xb_data");

		Row row = sheet.createRow(1);

		Cell cell = row.createCell(0);

		cell.setCellValue(buildVersion);
		
		row.createCell(1).setCellValue(buildSize);
		
		row.createCell(2).setCellValue(code);
		
		row.createCell(3).setCellValue(data);
		
		row.createCell(4).setCellValue(sound);

		FileOutputStream fo = new FileOutputStream(
				"D:\\My Data\\SeleniumNewPass_6thOct\\SeleniumNewPass\\src\\main\\java\\infosys\\xb.xlsx");

		workbook.write(fo);

		fo.close();

		System.out.println("Added successfuly....");

	}

	
	@Test
	
	public void buildDbPs4() throws IOException {
		
		WebElement studioList = driver.findElement(By.id("ctl00_ContentMain_ProjectsList"));

		Select puneStudio = new Select(studioList);

		puneStudio.selectByVisibleText("Far Cry Tetra - Pune");

		// Select Platform XB1(Durango)

		driver.findElement(By.xpath("//*[contains(text(),'PS4')]")).click();

		// Get build version name

		String buildVersion = driver
				.findElement(By.xpath(
						"//*[@id=\"ctl00_ContentMain_rptPlatformContents_ctl02_GridViewPlatforms\"]/tbody/tr[2]/td[3]"))
				.getText();

		System.out.println("Build Version =" + buildVersion);

		// Get build size
		String buildSize = driver
				.findElement(By.xpath(
						"//*[@id=\"ctl00_ContentMain_rptPlatformContents_ctl02_GridViewPlatforms\"]/tbody/tr[2]/td[7]"))
				.getText();

		System.out.println("Build size=" + buildSize);

		//If we need to convert string to double
		
		/*double d = Double.parseDouble(buildSize);

		System.out.println(d);*/

		// Get code data & sound

		
		//*[@id="ctl00_ContentMain_rptPlatformContents_ctl02_GridViewPlatforms"]/tbody/tr[2]/td[3] --ps4
		String code = driver.findElement(By
				.xpath("//*[@id=\"ctl00_ContentMain_rptPlatformContents_ctl02_GridViewPlatforms\"]/tbody/tr[2]/td[12]"))
				.getText();

		String data = driver.findElement(By
				.xpath("//*[@id=\"ctl00_ContentMain_rptPlatformContents_ctl02_GridViewPlatforms\"]/tbody/tr[2]/td[13]"))
				.getText();

		String sound = driver.findElement(By
				.xpath("//*[@id=\"ctl00_ContentMain_rptPlatformContents_ctl02_GridViewPlatforms\"]/tbody/tr[2]/td[14]"))
				.getText();

		System.out.println("Code= " + code + " Sound = " + sound + " Data " + data);
	
		// Add to Excel
		// obtains input bytes from a file
		FileInputStream io = new FileInputStream(
				"D:\\My Data\\SeleniumNewPass_6thOct\\SeleniumNewPass\\src\\main\\java\\infosys\\xb.xlsx");

		// pipeline between sheet and eclipse
		XSSFWorkbook workbook = new XSSFWorkbook(io);

		// Get sheet
		XSSFSheet sheet = workbook.getSheet("xb_data");

		Row row = sheet.createRow(2);

		Cell cell = row.createCell(0);

		cell.setCellValue(buildVersion);
		
		row.createCell(1).setCellValue(buildSize);
		
		row.createCell(2).setCellValue(code);
		
		row.createCell(3).setCellValue(data);
		
		row.createCell(4).setCellValue(sound);

		FileOutputStream fo = new FileOutputStream(
				"D:\\My Data\\SeleniumNewPass_6thOct\\SeleniumNewPass\\src\\main\\java\\infosys\\xb.xlsx");

		workbook.write(fo);

		fo.close();

		System.out.println("Added successfuly....");

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
