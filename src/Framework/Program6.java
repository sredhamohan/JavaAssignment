package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program6 {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		 FileInputStream f = new FileInputStream(System.getProperty("user.dir") + "\\File\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(f);
		XSSFSheet sheet=workBook.getSheetAt(0);
		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<=row;i++) {
			XSSFRow r=sheet.getRow(i);
			for (int j=0;j<=col;j++)
			{
				XSSFCell c=r.getCell(j);
				DataFormatter formatter = new DataFormatter();
				
				if(j==2) {
					
					System.out.println(formatter.formatCellValue(c));
					
			}
			}
		}
		  XSSFCell cell = sheet.getRow(1).getCell(2);
		  
          cell.setCellType(CellType.STRING);
          cell.setCellValue("Passed");
          f.close();
          
          
          for(int i=0;i<=row;i++) {
  			XSSFRow r=sheet.getRow(i);
  			for (int j=0;j<=col;j++)
  			{
  				XSSFCell c=r.getCell(j);
  				DataFormatter formatter = new DataFormatter();
  				
  				if(j==2) {
  					
  					System.out.println(formatter.formatCellValue(c));
  					
  			}
  			}
  		}
          
          FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir") + "\\File\\TestData.xlsx");
          workBook.write(fileOut);

          System.out.println(" Excel is updated successfully");
          fileOut.close();

          // Closing the workbook
          workBook.close();

	
	}
	
	

}
