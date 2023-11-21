package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Task2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Sam\\OneDrive\\Documents\\Selenium_UK_batch\\Book1.xlsx");
	
		Workbook book = WorkbookFactory.create(fis);
		Sheets sh = new Sheets();
		Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		
		String value1=sh.getRow(0).getCell(0).toString();
		System.out.println(value1);	
		
		
		
		
		
		
		public static void main(String[] args) throws IOException {
			
			System.out.println(getDataProperties("pwd"));
		}
		
		public static int sumOfTwoNumbers(int a, int b) {
		int result=a+b;
		return result;
				
	}
		public static String getDataProperties(String key) throws IOException {
			FileInputStream fis = new FileInputStream("C:\\Users\\Sam\\OneDrive\\Documents\\Selenium_UK_batch\\TestData.properties");
			Properties pobj = new Properties();
			pobj.load(fis);
			String value=pobj.getProperty(key);
			return value;

	
		
		
		
		
		
		}
	
}
