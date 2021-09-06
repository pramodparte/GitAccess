package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static String readData(int row, int column) throws IOException
	{
File src = new File("C:\\Users\\shree\\Desktop\\Test Data.xlsx");
		
		
		// To load that particular location in order to perform the operation
		FileInputStream fis = new FileInputStream(src);
		
	
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Testsheet");
		
		DataFormatter  df = new DataFormatter();
		String formatteddata = df.formatCellValue(sh1.getRow(row).getCell(column));
		
		
//		String value = sh1.getRow(0).getCell(1).getStringCellValue();
		
		
		return formatteddata;
}
	
	
	public void writeData() 
	{
		
		//To get the file loction and let java know where exactly it is 
				File src = new File("C:\\Users\\shree\\Desktop\\Test Data.xlsx");
				
				
				// To load that particular location in order to perform the operation
				FileInputStream fis = new FileInputStream(src);
				
			
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				
				XSSFSheet sh1 = wb.getSheet("Testsheet");
				
				
				
				File fout = new File("C:\\Users\\shree\\Desktop\\Testdata.xlsx");
				
				
				FileOutputStream fos = new FileOutputStream(fout);
				
				// to write data into "USED ROWS/ ALREADY CONTAINING DATA VALUES"
				
				sh1.getRow(5).getCell(1).setCellValue("Write operation test");
				
				// to write data into "USED ROWS/ ALREADY CONTAINING DATA VALUES but column is not available"
				
			sh1.getRow(6).createCell(14).setCellValue("Newly created column text");
			
			// to write data into "UNUSED ROWS and UNUSED COLUMN"
			
			
			sh1.createRow(50).createCell(10).setCellValue("New rowa and column test");
			sh1.createRow(51).createCell(11).setCellValue("646465456");
				wb.write(fos);
				
				
				// pesticide paradox
				// cyclomatic complexity
				// fuzz testing
				// Sprint Velocity
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// To get the file location and let java know where exactly it is
		
		
		File src = new File ("C:\\Users\\shree\\Desktop\\Test Data.xlsx");
		
		
		// To load that particular location in order to perform the operation
		
		FileInputStream fis = new FileInputStream(src);
		 
		
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("sheet1");		
//		String  value = sh1.getRow(0).getCell(1).getStringCellValue();
//		
//		System.out.println(value);
//		
//		int rowcount=sh1.getLastRowNum();
//		System.out.println(rowcount);
//		
//		int z=sh1.getLastRowNum();
//		System.out.println(z);
//		
		
		
		
		
		
	}

	
	

}
