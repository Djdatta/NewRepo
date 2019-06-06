package infosys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	static Workbook book;
	static Sheet sheet;

	public static String TESTDATA_SHEET_PATH = "D:\\My Data\\SeleniumNewPass_6thOct\\SeleniumNewPass\\src\\main\\java\\infosys\\xb.xlsx";

	public static void main(String[] args) throws IOException {

		writeData();
		getTestData("xb_data");
		
	}

	public static void writeData() throws IOException {

		// obtains input bytes from a file
		FileInputStream io = new FileInputStream(
				"D:\\My Data\\SeleniumNewPass_6thOct\\SeleniumNewPass\\src\\main\\java\\infosys\\xb.xlsx");

		// pipeline between sheet and eclipse
		XSSFWorkbook workbook = new XSSFWorkbook(io);

		// Get sheet
		XSSFSheet sheet = workbook.getSheet("xb_data");

		Row row = sheet.createRow(1);

		/*
		 * for(int i=0;i<6;i++) {
		 * 
		 * row.createCell(i).setCellValue(""); }
		 */
		Cell cell = row.createCell(0);

		cell.setCellValue("40 GB");

		FileOutputStream fo = new FileOutputStream(
				"D:\\My Data\\SeleniumNewPass_6thOct\\SeleniumNewPass\\src\\main\\java\\infosys\\xb.xlsx");

		workbook.write(fo);

		fo.close();

		System.out.println("Added successfuly....");
	}

	// To read data from the Excel-- Best and simple utility..

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {

			book = WorkbookFactory.create(file);

		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = book.getSheet(sheetName);

		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
		}
		return data;
	}

	
	
}
