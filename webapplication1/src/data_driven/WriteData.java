package data_driven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
String path = "F:\\eclipse\\workspace\\webapplication1\\npadDataDriven\\Book1.xlsx";
FileInputStream fis = new FileInputStream(path);
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet("sheet1");
Row row = sh.getRow(1);
Cell cel = row.getCell(3);
cel.setCellValue("PASS");
 
FileOutputStream fas = new FileOutputStream(path);
wb.write(fas);
wb.close();
System.out.println("Done");
	}
}
