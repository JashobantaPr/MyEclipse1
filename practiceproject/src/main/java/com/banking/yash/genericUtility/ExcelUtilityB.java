package com.banking.yash.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilityB {
	public String readDataFromExcelFile(int Rownum, int Cellnum) throws IOException {
		FileInputStream Fis = new FileInputStream("./src/test/resources/Book3.xlsx");
		Workbook WB = WorkbookFactory.create(Fis);
		Sheet Sh = WB.getSheet("Sheet1");
		Row row = Sh.getRow(Rownum);
		Cell cell = row.getCell(Cellnum);
		String CellValue = cell.getStringCellValue();
		return CellValue;
	}
}
