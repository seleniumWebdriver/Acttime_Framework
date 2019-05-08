package data_driven;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTwoColmn {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("F:\\eclipse\\workspace\\webapplication1\\npadDataDriven\\Book2.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet("Sheet2");
  for(int i=0 ; i<=sh.getLastRowNum() ; i++)
  {
	  Row row = sh.getRow(i);
	  String firstcell = row.getCell(0).getStringCellValue();
	  String secondcell = row.getCell(1).getStringCellValue();
	  System.out.println(firstcell+"\t"+secondcell);
  }
	}

}
