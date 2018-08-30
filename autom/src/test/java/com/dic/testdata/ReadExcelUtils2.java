package com.dic.testdata;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUtils2 {

	public static void main(String[] args) {
		Object[][] o = getExcelData("calcTestData1.xls");
		for (int i = 0; i < o.length; i++) {
			for (int j = 0; j < o[i].length; j++) {
				System.out.print(o[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static Object[][] getExcelData(String filename) {
		Object[][] objs = null;
		InputStream is = ReadExcelUtils2.class.getClassLoader().getResourceAsStream(filename);
		Workbook wb = null;
		try {
			wb = new HSSFWorkbook(is);
			Sheet sheet = wb.getSheet("Sheet1");
			int lastRowNum = sheet.getLastRowNum();// 0开始
			Row titleRow = sheet.getRow(0);
			int lastCellNum = titleRow.getLastCellNum();// cell的编号加1
			objs = new Object[lastRowNum][lastCellNum];

			for (int i = 0; i < objs.length; i++) {
				Row row = sheet.getRow(i + 1);
				for (int j = 0; j < objs[i].length; j++) {
					Cell cell = row.getCell(j);
					objs[i][j] =getObject(cell);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				wb.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return objs;
	}

	private static Object getObject(Cell cell) {
		Object data = null;
		switch (cell.getCellTypeEnum()) {
		case BOOLEAN:
			data = cell.getBooleanCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				data = cell.getDateCellValue();
			} else {
				data = double2int(cell.getNumericCellValue());
			}
			break;
		case STRING:
			data = cell.getStringCellValue();
			break;

		default:
			data = null;
		}
		return data;
	}

	private static Object double2int(double from) {
		if (from - (int) from == 0) {
			return (int) from;
		} else {
			return from;
		}

	}

}
