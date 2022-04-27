package Framework;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("Sheet1");
		Object testData[][]= {{"Sl.No","Account Name","Account Num"},
				{"1","Sredha Mohan","635353"},
				{"2","Aaren","635222"}
		};
		int row=testData.length;
		int col=testData[0].length;
		
		for(int i=0;i<row;i++) {
			XSSFRow r=sheet.createRow(i);
			for(int j=0;j<col;j++) {
				
				XSSFCell c=r.createCell(j);
				Object value=testData[i][j];
				
				if (value instanceof String)				
					c.setCellValue((String) value);
				if (value instanceof Integer)
					c.setCellValue((Integer) value);
				if (value instanceof Boolean)
					c.setCellValue((Boolean) value);
							
			}
			
		}
		
		try {
			FileOutputStream ft= new FileOutputStream(System.getProperty("user.dir") + "\\File\\Test.xlsx");
			
			workBook.write(ft);
			ft.close();
			System.out.println("Success");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
