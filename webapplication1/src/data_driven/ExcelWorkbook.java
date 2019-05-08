package data_driven;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWorkbook {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("F:\\eclipse\\workspace\\webapplication1\\npadDataDriven\\Book1.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet("sheet1");
Row row = sh.getRow(4);
Cell cel = row.getCell(3);
String data = cel.getStringCellValue();
System.out.println(data);
wb.close();
	}

}
