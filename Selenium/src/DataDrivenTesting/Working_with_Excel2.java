package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_with_Excel2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Sam\\OneDrive\\Documents\\Selenium_UK_batch\\Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet2");
		
		//To get last Row number
		int lastRow = sh.getPhysicalNumberOfRows();
		System.out.println("Last Row Number:" +lastRow);
		
		//To get last Cell number
		int lastCell = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Last Cell Number:"+lastCell);
		
		
		for(int i=0;i<lastRow;i++) // generic method to get extra rows
		{
			for(int j=0;j<lastCell;j++) //generic method to get extra cells
			{
				String value = sh.getRow(i).getCell(j).toString();
				System.out.print(value+" ");
			}
			System.out.println();
			
		}
		
		
	}

}
