package javaPrograms3110;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelReading {

	public static void main(String[] args) {
		ExcelReading ecr = new ExcelReading();
		String username = ecr.ReadExcel("ABCD", 1, 0); // Adjusted row index to 1 (assuming row index starts from 0)
		System.out.println("Usernme is: " + username);
		String password = ecr.ReadExcel("ABCD", 1, 1);
		System.out.println("Password is: " + password);
		
		ecr.WriteExcel("ABCD", 1, 2,"Pass");
	}

	public void WriteExcel(String sheetName, int row, int column, String data) {

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Testriq_D25\\Desktop\\ExcelRead.xlsx");
			Workbook wb = WorkbookFactory.create(fis);

			Sheet sheet = wb.getSheet(sheetName);

			Row r = sheet.getRow(row);

			Cell c = r.createCell(column);
			c.setCellValue(data);

			FileOutputStream fos = new FileOutputStream("C:\\Users\\Testriq_D25\\Desktop\\ExcelRead.xlsx");

			wb.write(fos);

			wb.close();
		} catch (Exception e) {
			System.out.println("ReadExcel catch block");
			e.printStackTrace();
		}

	}

	public String ReadExcel(String sheetName, int row, int column) {
		String data = "";
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Testriq_D25\\Desktop\\ExcelRead.xlsx");
			Workbook wb = WorkbookFactory.create(fis);

			Sheet sheet = wb.getSheet(sheetName);

			Row r = sheet.getRow(row);

			Cell c = r.getCell(column);

			data = c.getStringCellValue();

			wb.close();
		} catch (Exception e) {
			System.out.println("ReadExcel catch block");
			e.printStackTrace();
		}
		return data;
	}
}