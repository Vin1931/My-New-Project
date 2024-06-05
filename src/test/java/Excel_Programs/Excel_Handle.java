package Excel_Programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excel_Handle 
{
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);


		WebElement e1 = driver.findElement(By.xpath("//select[@id = 'searchDropdownBox']"));
		Select sc=new Select(e1);

		sc.selectByVisibleText("Books");
		 
		WebElement e2 = driver.findElement(By.xpath("//input[@value = 'Go']"));
		e2.click();
		List<WebElement> Books = driver.findElements(By.xpath("//ol[@class = 'a-carousel']"));
		
		int size = Books.size();
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Sheet1");
		
		for(int i=0;i<size;i++) {
			
			String values=Books.get(i).getText();
			
			XSSFRow row=sheet.getRow(i);
			
			if(row==null) {
				row=sheet.createRow(i);
				
				XSSFCell cell=row.createCell(0);
				cell.setCellValue(values);
			}
         FileOutputStream fo=new FileOutputStream("C:\\Users\\VINAY SURE\\Desktop\\W3S Java\\Main_Maven\\XLSX\\Amazon.xlsx");
			
			wb.write(fo);
			System.out.println(values);
			System.out.println();
		}
}
}