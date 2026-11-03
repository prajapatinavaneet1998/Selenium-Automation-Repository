package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

    public static void main(String[] args) throws IOException {

        // Step 1: Create File object
        File file = new File(
                "C:\\Users\\praja\\OneDrive\\Desktop\\Text.dataexcle.xlsx");

        // Step 2: Create FileInputStream object
        FileInputStream fis = new FileInputStream(file);

        // Step 3: Create XSSFWorkbook object
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // Navigate to Sheet1
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        // 1st row
        XSSFRow firstRow = sheet.getRow(0);

        XSSFCell firstCell = firstRow.getCell(0);

        String firstCellData = firstCell.toString();
        String secondCellData = firstRow.getCell(1).toString();
        String thirdCellData = firstRow.getCell(2).toString();
        String fourthCellData = firstRow.getCell(3).toString();

        // 2nd row
        XSSFRow secondRow = sheet.getRow(1);

        String firstCellData1 = secondRow.getCell(0).toString();
        String secondCellData1 = secondRow.getCell(1).toString();
        String thirdCellData1 = secondRow.getCell(2).toString();
        String fourthCellData1 = secondRow.getCell(3).toString();

        // 3rd row
        XSSFRow thirdRow = sheet.getRow(2);

        String firstCellData2 = thirdRow.getCell(0).toString();
        String secondCellData2 = thirdRow.getCell(1).toString();
        String thirdCellData2 = thirdRow.getCell(2).toString();
        String fourthCellData2 = thirdRow.getCell(3).toString();

        // 4th row
        XSSFRow fourthRow = sheet.getRow(3);

        String firstCellData3 = fourthRow.getCell(0).toString();
        String secondCellData3 = fourthRow.getCell(1).toString();
        String thirdCellData3 = fourthRow.getCell(2).toString();
        String fourthCellData3 = fourthRow.getCell(3).toString();

        // Printing the data

        System.out.print(firstCellData);
        System.out.print("--> " + firstCellData1);
        System.out.print("     " + firstCellData2);
        System.out.println("     " + firstCellData3);

        System.out.print(secondCellData);
        System.out.print("--> " + secondCellData1);
        System.out.print("     " + secondCellData2);
        System.out.println("     " + secondCellData3);

        System.out.print(thirdCellData);
        System.out.print("--> " + thirdCellData1);
        System.out.print("     " + thirdCellData2);
        System.out.println("     " + thirdCellData3);

        System.out.print(fourthCellData);
        System.out.print("     " + fourthCellData1);
        System.out.print("     " + fourthCellData2);
        System.out.println("     " + fourthCellData3);

        // Close workbook and input stream
        workbook.close();
        fis.close();
    }
}
