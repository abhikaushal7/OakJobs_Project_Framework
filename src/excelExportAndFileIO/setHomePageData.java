package excelExportAndFileIO;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class setHomePageData {
	
	 String oldFile= "D:\\A.K FOLDER\\Workspace\\OakJobs_Project_Framework\\Excel_File\\OakJobsDataSheet.xls";
	 String resultFile = "D:\\A.K FOLDER\\Workspace\\OakJobs_Project_Framework\\Result_Excel_File\\HomePage.xls";

	
		// Method to only write  FAIL data to sheet for failed test cases
	 public void WriteDataFail(int i) throws BiffException, IOException, WriteException {
			
		try {	
		Workbook wb = Workbook.getWorkbook(new File(oldFile));
		WritableWorkbook copy = Workbook.createWorkbook(new File(resultFile), wb);
		WritableSheet sheetToEdit = copy.getSheet(1);
				
					Label l = new Label(6, i, "FAIL");
				//	Label l = new Label(currentColumn, currentRow, value);
					sheetToEdit.addCell(l);
		
		
		copy.write();
		copy.close();
		wb.close();
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}
	
	
	// Method to only write data to sheet and String DATA will be declared in method
	public void WriteData(String data ) throws BiffException, IOException, WriteException {
		
		try {
		Workbook wb = Workbook.getWorkbook(new File(oldFile));
		WritableWorkbook copy = Workbook.createWorkbook(new File(resultFile), wb);
		WritableSheet sheetToEdit = copy.getSheet(1);
		int rows = sheetToEdit.getRows();
	
		for (int i=2; i<=rows-1; i++){
					Label l = new Label(6, i, data);
				//	Label l = new Label(currentColumn, currentRow, value);
					sheetToEdit.addCell(l);
		}
	
		copy.write();
		copy.close();
		wb.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	// Method to only write PASS data to sheet for Passed test cases
	public void WriteDataPass(int i) throws BiffException, IOException, WriteException {
		
		try {
		Workbook wb = Workbook.getWorkbook(new File(oldFile));
		WritableWorkbook copy = Workbook.createWorkbook(new File(resultFile), wb);
		WritableSheet sheetToEdit = copy.getSheet(1);
				
					Label l = new Label(6, i, "PASS");
				//	Label l = new Label(currentColumn, currentRow, value);
					sheetToEdit.addCell(l);
		
		
		copy.write();
		copy.close();
		wb.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}

