 package com.utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
    public static String readParticularData(int rowValue, int columnValue) {
        String data = "";
        try (FileInputStream fis = new FileInputStream("C:\\Users\\user\\Downloads\\DataDriven_testData.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {
             
            Sheet sheet = workbook.getSheet("Sheet1");
            Row row = sheet.getRow(rowValue);
            Cell cell = row.getCell(columnValue);
            DataFormatter formatter = new DataFormatter();
            data = formatter.formatCellValue(cell);

            System.out.println(data);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void readAllCellData(int rowIndex) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\user\\Downloads\\DataDriven_testData.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {
             
            Sheet sheet = workbook.getSheet("Sheet1");
            Row row = sheet.getRow(rowIndex);
            DataFormatter formatter = new DataFormatter();

            for (int i = 0; i < row.getLastCellNum(); i++) {
                Cell cell = row.getCell(i);
                String cellData = formatter.formatCellValue(cell);
                System.out.println(cellData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
