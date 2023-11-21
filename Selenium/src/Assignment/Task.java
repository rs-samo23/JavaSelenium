package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task {
	
//	public static int sum(int num1, int num2) {
//		return num1 + num2;
//	}
//
//	public static void main(String[] args) {
//
//		  int a = 5;
//	        int b = 7;
//	        int result = sum(a, b);
//	        System.out.println("The sum of " + a + " and " + b + " is: " + result);
//	    }
//
//	}

	public static void main(String[] args) throws IOException {
//		System.out.println(sumOfTwoNumbers (5,20));
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


		
		