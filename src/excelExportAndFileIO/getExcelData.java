package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class getExcelData {
	
	
	public  Sheet ReadExcel (String string) throws BiffException, IOException{
	
		 //Create a object of File class to open xlsx file
	    File file =    new File("D:\\A.K FOLDER\\Workspace\\OakJobs_Project_Framework\\Excel_File\\OakJobsDataSheet.xls");
	    //Create an object of FileInputStream class to read excel file
		Workbook wb = Workbook.getWorkbook (file);
		
		Sheet sh = wb.getSheet(string);
		
	return sh;
	 
	}
}
