package testng;

import java.io.FileInputStream;  
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class excel {

	@DataProvider
	
	public static String[][] read() throws Exception{
		String st[][];
		
		FileInputStream fis = new FileInputStream("./Excel2/Login.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int rowCount = sh.getPhysicalNumberOfRows();
		int colCount = sh.getRow(0).getLastCellNum();
		
		st = new String[rowCount-1][colCount];
		for (int i = 1; i <rowCount; i++) {
			for (int j = 0; j <colCount; j++) {
			Cell cl = sh.getRow(i).getCell(j);
			st[i-1][j] = cl.toString();
			}
		}
		return st;
	}
}
