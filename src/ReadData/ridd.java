package ReadData;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ridd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./Excel2/Login3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("Sheet1");
		  int row = sh.getPhysicalNumberOfRows();
		  int col = sh.getRow(0).getLastCellNum();
		  for (int i = 4; i < row; i++) {
			  for (int j = 0; j < col; j++) {
				  Cell cl = sh.getRow(i).getCell(j);
				  System.out.println(cl);
			}
			
		}

	}

}
