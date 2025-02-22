package com.neotech.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private static Workbook book;
	private static Sheet sheet;
	
	/**
	 * This method initializes a Workbook object given the filePath.
	 * 
	 * @param filePath
	 */
	private static void openExcel(String filePath)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(filePath);
			book = new XSSFWorkbook(fis);
		} 
		catch (IOException e) 
		{
				e.printStackTrace();
		}
			
	}
	
	/**
	 * This method loads a sheet given the sheetName.
	 * @param sheetName
	 */
	private static void loadSheet(String sheetName)
	{
		sheet = book.getSheet(sheetName);
	}
	
	/**
	 * This method returns the row count of the current sheet.
	 * @return
	 */
	private static int rowCount()
	{
		return sheet.getPhysicalNumberOfRows();
	}
	
	/**
	 * This method returns the column count for a given row index in the current sheet.
	 * @param rowIndex
	 * @return
	 */
	private static int colCount(int rowIndex)
	{
		return sheet.getRow(rowIndex).getLastCellNum();
	}
	
	/**
	 * This method returns the cell data as a String given the row and column indexes.
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 */
	private static String cellData(int rowIndex, int colIndex)
	{
		return sheet.getRow(rowIndex).getCell(colIndex).toString();
	}
	
	public static List<Map<String, String>> excelIntoListOfMaps(String filePath, String sheetName)
	{
		
		// open the file: filePath
		openExcel(filePath);
		
		// load the sheet: sheetName
		loadSheet(sheetName);
		
		//initialize the list to fill the data and then return it
		List<Map<String, String>> list = new ArrayList<>();
		
		
		for (int row = 1; row < rowCount(); row++)
		{
			Map<String, String> rowMap = new LinkedHashMap<>();
			
			for (int col = 0; col < colCount(row); col++)
			{
				String key = cellData(0, col);
				String value = cellData(row, col);
				
				rowMap.put(key, value);
			}
			
			//add the filled map to the list
			list.add(rowMap);
		}

		return list;
	}

}
