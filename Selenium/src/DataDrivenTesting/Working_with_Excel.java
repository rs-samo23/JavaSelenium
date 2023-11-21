package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_with_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Sam\\OneDrive\\Documents\\Selenium_UK_batch\\Book1.xlsx");
		
		//To access the workbook
		Workbook book = WorkbookFactory.create(fis);
		
		//To access the sheet
		Sheet sh = book.getSheet("Sheet1");
		
		//To access the Row (parse the Row number)
		Row row = sh.getRow(0);
		
		//To access the Cell
		Cell cell = row.getCell(0);
		
//		//To fetch the data in string format
//		String value =  cell.getStringCellValue();
//		System.out.println(value);
//		
//		double value1 = sh.getRow(2).getCell(0).getNumericCellValue();
//		System.out.println(value1);
		
		String value1=sh.getRow(0).getCell(0).toString();
		System.out.println(value1);
		
		String value2=sh.getRow(2).getCell(0).toString();
		System.out.println(value2);
		
					
	}

}
