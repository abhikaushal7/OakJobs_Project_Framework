package readResults;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Read_Results {

	public static String results() throws BiffException, IOException {

		Workbook wb = Workbook.getWorkbook(new File("D:\\A.K FOLDER\\Workspace\\OakJobs_Project_Framework\\Result_Excel_File\\SignUpPage.xls"));
		Sheet mySheet = wb.getSheet("Test Cases_SignUp");
		int rows = mySheet.getRows();

		String html = "<table cellspacing='0' style='width:800px;' >";

		for (int i = 0; i < rows-1; i++) {

			String backColor = "";
			if (i % 2 == 0)
				backColor = "background-color: #F5EFFB;";

			String headerColumn = "";
			if (i == 0) {
				headerColumn = "font-size:14px; font-weight: bold; border-top:2px solid #9A2EFE;border-bottom:1px solid #9A2EFE;";
				html += " <tr style='border-top:1px solid #CC2EFA;border-bottom:1px solid #CC2EFA; text-align:center;" + backColor + "'> ";
			} else {
				headerColumn = "font-size:14px;";
			}
			html += " <tr style='" + backColor + "'> ";

			// 0th column and 1st row
			for (int j = 1; j < 8; j++) {

				jxl.Cell cell = mySheet.getCell(j, i);
				String contents = cell.getContents().toString();

				if (contents.equalsIgnoreCase("PASS"))
					html += "<td style='padding:10px;color:green; font-weight: bold; padding-left:20px; border-top:1px solid #9A2EFE;" + headerColumn + "'>" + contents + "</td>";
				else if (contents.equalsIgnoreCase("FAIL"))
					html += "<td style='padding:10px;color:red; padding-left:20px; font-weight: bold; border-top:1px solid #9A2EFE;" + headerColumn + "'>" + contents + "</td>";
				else
					html += "<td style='padding:10px; padding-left:20px; border-top:1px solid #9A2EFE;" + headerColumn + "'>" + contents + "</td>";
			}
			html += "</tr>";
		}
		html += "</table>";
		return html;
	}
}