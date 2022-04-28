package Framework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		File f = new File(System.getProperty("user.dir") + "\\File\\ReadExcel.xlsx");

		try {
			XSSFWorkbook wb = new XSSFWorkbook(f);
			XSSFSheet sheet = wb.getSheetAt(0);

			int rows = sheet.getLastRowNum();
			int col = sheet.getRow(0).getLastCellNum();

			for (int i = 0; i <= rows; i++) {
				XSSFRow row = sheet.getRow(i);

				for (int j = 0; j <= col; j++) {

					XSSFCell cell = row.getCell(j);

					DataFormatter formatter = new DataFormatter();
					a.add(formatter.formatCellValue(cell));

					System.out.println(a);
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
