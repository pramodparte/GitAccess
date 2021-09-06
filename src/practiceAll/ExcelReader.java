package practiceAll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static String ready(int row, int column) throws IOException
	{
		File scr = new File("C:\\Users\\shree\\Desktop\\Excel data.xlsx");
		
		FileInputStream fis = new FileInputStream(scr);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		DataFormatter df = new DataFormatter();
		
		String ss = df.formatCellValue(sh.getRow(row).getCell(column));
		
		
		return ss;
		
		
		
		
	}
	

}
