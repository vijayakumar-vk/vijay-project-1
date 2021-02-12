package com.vk1.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData implements AutoConstant {
	public String getexceldata (String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream f = new FileInputStream(excelpathfile);
		Workbook wb = WorkbookFactory.create(f);
				return wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}

}
