package Excel_Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Task 
{
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\VINAY SURE\\Desktop\\W3S Java\\Main_Maven\\XLSX\\Excel Practice.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int colmns = sheet.getRow(rows).getLastCellNum();
		System.out.println(rows);
		System.out.println(colmns);
		
		for(int i=1;i<=rows;i++) {
			XSSFRow row=sheet.getRow(i);
			
			for(int c=0;c<colmns;c++) {
				String value=row.getCell(c).toString();
				System.out.print(value);
				
				System.out.println();
			}
	}
}
}