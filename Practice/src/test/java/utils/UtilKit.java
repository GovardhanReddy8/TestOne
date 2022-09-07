package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import comments.BagePage;

public class UtilKit extends BagePage{
	
	public static Object[][] data(String sheetname, String dataname) throws IOException {
		FileInputStream fis = new FileInputStream("TestData\\Book.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		ArrayList<Row> rows = new ArrayList<Row>();
		rows=getRow(sheet,dataname);
		System.out.println(rows.size());
		System.out.println(rows.get(0).getLastCellNum());
		Object[][] obj=new Object[rows.size()-1][rows.get(0).getLastCellNum()-1];
		for (int i = 0; i < rows.size()-1; i++) {
			for (int j = 0; j < rows.get(0).getLastCellNum()-1; j++) {
				obj[i][j]=rows.get(i+1).getCell(j+1).toString();
				
			}
			
		}
		return obj;
		
	}

	private static ArrayList<Row> getRow(Sheet sheet, String dataname) {
		ArrayList<Row> row = new ArrayList<Row>();
		ArrayList<Row> cells = new ArrayList<Row>();
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getLastRowNum());
		for (int i = 0; i <=sheet.getLastRowNum(); i++) {
			if (!(sheet.getRow(i)==null)) {
				row.add(sheet.getRow(i));
			}
			
		}
		System.out.println(row.size());
		for (int i = 0; i < row.size(); i++) {
			if (row.get(i).getCell(0).getStringCellValue().equals(dataname)) {
				cells.add(row.get(i));
				
			}
			
		}
		return cells;
	}

}
