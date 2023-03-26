package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.eventusermodel.XSSFBReader;

public class FetchExcelData {
	
	public static ArrayList<Object[]> getDataFromExcel() throws EncryptedDocumentException, IOException {
		
		ArrayList<Object[]> al = new ArrayList<Object[]>();
		
//		FileInputStream file;
//		file=new FileInputStream("C:\\Users\\GAURAV\\OneDrive\\Desktop\\Book2.xlsx");
//		int rows = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum();
//		
//		file=new FileInputStream("C:\\Users\\GAURAV\\OneDrive\\Desktop\\Book2.xlsx");
//		int cols = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
//		
//		
//		for(int i=1; i<=rows; i++) {
//			for(int j=0; j<cols; j++) {
//				file=new FileInputStream("C:\\Users\\GAURAV\\OneDrive\\Desktop\\Book2.xlsx");
//				String data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
//			}
//		}
		
		
		
		
		
		return null;
		
	}

}
