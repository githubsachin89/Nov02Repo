package UtilsLayer;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static XSSFSheet sheet;
	static XSSFCell cells;
	
	
	public static ArrayList<LinkedHashMap<String, String>> readTestData(String sheetName) throws Exception {

		FileInputStream fis = new FileInputStream("//src//main//java//TestDataLayer//OrageHRMTestData.xlsx");
		
//		XSSFCell cells = sheet.getRow(row).getCell(cell);
//
//		// if(cells.getCellType() == XSSFCell.CELL_TYPE_STRING)
//		if (cells.getCellType() == CellType.STRING) {
//			return cells.getStringCellValue();
//		} else if (cells.getCellType() == CellType.NUMERIC) {
//			return cells.getRawValue();
//		} else if (cells.getCellType() == CellType.BOOLEAN) {
//			return cells.getBooleanCellValue();
//		} else if (cells.getCellType() == CellType.FORMULA) {
//			return cells.getCellFormula();
//		} else {
//			return null;
//		}
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);

		int totalRows = sheet.getLastRowNum() + 1;
		int totalColumns = sheet.getRow(0).getLastCellNum();

		ArrayList<LinkedHashMap<String, String>> data = new ArrayList<LinkedHashMap<String, String>>();

		for (int i = 1; i < totalRows; i++) {
			LinkedHashMap<String, String> h1 = new LinkedHashMap<String, String>();

			for (int j = 0; j < totalColumns; j++) {
				String columnName = sheet.getRow(0).getCell(j).getStringCellValue();
				String columnValue = sheet.getRow(i).getCell(j).getStringCellValue();

				h1.put(columnName, columnValue);
			}

			data.add(h1);
		}

		return data;

	}

}
