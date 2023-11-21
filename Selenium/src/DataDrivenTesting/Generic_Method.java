package DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;


//	public class Generic_Method_Example {
//		
//		public static void main(String[] args) {
//			
//			System.out.println("Sheet1");
//			
//		}
//		public static int sumOfTwoNumbers(int a, int b);
//		{
//			int result=a+b;
//			return result;
//		}
//		public static String getDataProperties(String key)
//		
//		{
//			FileInputStream fis = new FileInputStream("C:\\Users\\Sam\\OneDrive\\Documents\\Selenium_UK_batch\\Book1.xlsx");
//			Properties pobj = new Properties ();
//			pobj.load(fis);
//			String value=pobj.getProperty(key);
//		}
//	
//	}
//
//}
	
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class Generic_Method {
		
	public static String getDataProperties(String key) throws IOException
		
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.properties");
			Properties pobj = new Properties ();
			pobj.load(fis);
			String value=pobj.getProperty(key);
			return value;
			
		}
		
		
		public static String getDataFromExcel(String sheetName,int rownum,int cellNum) throws EncryptedDocumentException, IOException
		
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/Book1.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sh=book.getSheet(sheetName);
			String value=sh.getRow(rownum).getCell(cellNum).toString();
			return value;

	}
	}
