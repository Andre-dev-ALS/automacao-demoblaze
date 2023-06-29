package com.demoblaze.utilities;

import static com.demoblaze.utilities.Context.getId;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.InvalidArgumentException;

public class ExcelActions {

	private static XSSFWorkbook workFolder;
	private static XSSFSheet sheet;
	private static XSSFCell cell;

	public ExcelActions(String pathWorkFolder, String worksheetName) {
		setExcelFile(pathWorkFolder, worksheetName);
	}

	private void setExcelFile(String pathWorkFolder, String worksheetName) {
		try {
			File file = new File(pathWorkFolder);
			workFolder = new XSSFWorkbook(file);
		} catch (Exception e) {
			throw new RuntimeException("workbook not found, check the specified path", e);
		}

		try {
			sheet = workFolder.getSheet(worksheetName);

			if (sheet.equals(null)) {
			}
		} catch (Exception e) {
			throw new RuntimeException("worksheet not found , check the specified name", e);
		}
	}

	private int findColumn(String columnName) {
		int cellcount = sheet.getRow(0).getLastCellNum();
		for (int indexColumn = 0; indexColumn < cellcount; indexColumn++) {
			String attribute = getFileCellValue(0, indexColumn);
			if (attribute.equalsIgnoreCase(columnName)) {
				return indexColumn;
			}
		}
		throw new InvalidArgumentException("the argument" + columnName + "not exist");
	}

	private String getFileCellValue(int lineNumber, int icellNumber) {
		if (sheet.getRow(lineNumber).getCell(icellNumber) != null) {
			cell = sheet.getRow(lineNumber).getCell(icellNumber);
			return cell.getStringCellValue();
		}
		throw new NullPointerException("returned an empty cell");
	}

	public String getValueInTheWorksheet(String id, String columnName) {
		int col = findColumn(columnName);
		String searchData = id;
		String dataFound = "";
		int indexId = 0;
		for (; indexId <= getTotalRows(); indexId++) {
			dataFound = getFileCellValue(indexId, 0);
			if (dataFound.equalsIgnoreCase(searchData)) {
				dataFound = getFileCellValue(indexId, col);
				break;
			}
		}
		return dataFound;
	}

	public String getValueInTheWorksheet(String columnName) {
		return getValueInTheWorksheet(getId(), columnName);
	}

	private int getTotalRows() {
		int totalRows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		return totalRows;
	}

	public void closeExcel() {
		try {
			workFolder.close();
		} catch (Exception e) {
			throw new RuntimeException("error when trying to close excel");
		}
	}
}