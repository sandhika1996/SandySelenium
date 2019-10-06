package ProjectBase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcelData(String excelFileName) throws IOException {
		XSSFWorkbook wBook=new XSSFWorkbook("./Data/"+excelFileName+".xlsx"
				);//Navigate the Workbook
		XSSFSheet sheet = wBook.getSheet("Sheet1");//Navigate to the sheet
		int rowCount=sheet.getLastRowNum();//with reference to the sheet
		int colCount = sheet.getRow(0).getLastCellNum();//sheet.getphysicalnumber
		String[][] data=new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++)	//iterate over the rows	
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colCount;j++)//iterate over the columns
			{
				XSSFCell cell = row.getCell(j);
				 data[i-1][j] = cell.getStringCellValue();//read the data from rows
				System.out.println(data[i-1][j]);
			}
		}
		wBook.close();
		return data;
	}

}
