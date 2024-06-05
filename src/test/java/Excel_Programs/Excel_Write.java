package Excel_Programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write 
{

		public static void main(String[] args) throws IOException {

			FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\XLSX\\Book2.xlsx");

			XSSFWorkbook work=new XSSFWorkbook();
			XSSFSheet sheet=work.createSheet("Data");
			Scanner sc=new Scanner(System.in);
			
			for(int r=0;r<=4;r++) 
			{
				XSSFRow row=sheet.createRow(r);
				
				for(int c=0;c<10;c++) 
				{
					
					System.out.println("enter a value");
					
					String value=sc.next();
				   row.createCell(c).setCellValue(value);
				}
			}
			
			work.write(file);
			work.close();
			file.close();
			System.out.println("No Data Remaining");
			
		}
}