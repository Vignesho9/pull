package com.datadriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.io.FileBackedOutputStream;

public class Read_Data {
	public static void read_Pirticular_Data() throws IOException {
      
		File f = new File("C:\\Users\\Vignesh\\git\\viki\\Mini_Projects\\Datadriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(5);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);
		}
	}
	public static void main(String[] args) throws Throwable {
		read_Pirticular_Data();
		all_Data();
		
	}
       public static void all_Data() throws Throwable {
    	   File f = new File("C:\\Users\\Vignesh\\git\\viki\\Mini_Projects\\Datadriven.xlsx");
   		FileInputStream fis = new FileInputStream(f);
   		Workbook wb = new XSSFWorkbook(fis);
   		Sheet sheetAt = wb.getSheetAt(0);
   		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
   		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
                 if (cellType.equals(cellType.STRING)) {
                	 String cellValue = cell.getStringCellValue();
					System.out.println(cellValue);
				}
                 else if (cellType.equals(cellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					int value = (int) cellValue;
					System.out.println(value);
				}
			}
		}
	}
}
