package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static Object[][] getData(
            String filePath,
            String TestData) {

        Object[][] data = null;

        try {

            FileInputStream fis =
                    new FileInputStream(filePath);

            XSSFWorkbook workbook =
                    new XSSFWorkbook(fis);
            
            System.out.println("Available Sheets:");
            
            for(int i = 0; i < workbook.getNumberOfSheets(); i++) {
            	System.out.println(workbook.getSheetName(i));
            }

            XSSFSheet sheet =
                    workbook.getSheet(TestData);
            
            System.out.println("Loking for sheet: " + TestData);
            
            if(sheet == null) {
            	throw new RuntimeException(
            			"Sheet not found: " + TestData);
            }

            int rows =
                    sheet.getPhysicalNumberOfRows();

            int cols =
                    sheet.getRow(0)
                            .getPhysicalNumberOfCells();

            data =
                    new Object[rows - 1][cols];

            for(int i = 1; i < rows; i++) {

                Row row = sheet.getRow(i);

                for(int j = 0; j < cols; j++) {

                    Cell cell = row.getCell(j);

                    data[i - 1][j] =
                            cell.toString();
                }
            }

            workbook.close();

        } catch(Exception e) {

            throw new RuntimeException(
            		"Failed to read Excel data", e);
        }

        return data;
    }
}
