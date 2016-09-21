package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import operation.UIOperation_HomePage;
import operation.UIOperation_Login;
import operation.UIOperation_Signup;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import excelExportAndFileIO.getExcelData;
import excelExportAndFileIO.setHomePageData;
import excelExportAndFileIO.setSignupData;
import excelExportAndFileIO.setLoginData;
import jxl.Cell;
import jxl.Sheet;
import jxl.read.biff.BiffException;

public class ExecuteTest {
	public WebDriver driver ;
	setHomePageData mSetHomeData = new setHomePageData();
	setLoginData mSetLoginData = new setLoginData();
	setSignupData mSetSignupData = new setSignupData();
	getExcelData file = new getExcelData();
	String HomeResultFile = "D:\\A.K FOLDER\\Workspace\\OakJobs_Project_Framework\\Result_Excel_File\\HomePage.xls";
	String LoginResultFile = "D:\\A.K FOLDER\\Workspace\\OakJobs_Project_Framework\\Result_Excel_File\\Login.xls";
	String SignupResultFile = "D:\\A.K FOLDER\\Workspace\\OakJobs_Project_Framework\\Result_Excel_File\\Signup.xls";
	
	@BeforeMethod
public void beforeTest() {
	  System.setProperty("webdriver.firefox.marionette","OakJobs_Project_Framework\\gecko_driver\\geckodriver.exe");
	 driver = new FirefoxDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30000,TimeUnit.MILLISECONDS);
	}
	
	
	@AfterMethod
public void afterTest() {
		driver.close();
		driver.quit();
	}
			
/*	
// Verifies the Home-Page Web-Elements.	
	@Test (priority= 0)
	 public void testHomePage() throws Exception {
	UIOperation_HomePage mOperationHomePage = new UIOperation_HomePage(driver);


	//Read keyword sheet
	Sheet sheet = file.ReadExcel("Test Cases_HomePage" );


	int row = sheet.getRows();
    for (int i = 2; i <=row-1 ; i++) {
     //Loop over all the rows
     Cell cell = sheet.getCell(2, i);
     String content = cell.getContents().toString();
      
     //Print the new testcase name when it started
     System.out.println("New Testcase->"+content +" Started");
        
     //Call perform function to perform operation on UI
     mOperationHomePage.perform_homePage(content);
    	}
	mSetHomeData.WriteData("PASS");
    }
	
	
	// Verifies the Login Page Web-Elements
	@Test(priority=1)
	private void testLoginPage() throws Exception {
	UIOperation_Login mOperationLogin = new UIOperation_Login(driver);
		
	//Read Keyword sheet for LoginPage
	Sheet sheet =	file.ReadExcel("Test Cases_Login");
	
	int row = sheet.getRows();
	for(int i =2; i<=row-1; i++){
		Cell cell = sheet.getCell(2, i);
		
		String content = cell.getContents().toString();
		System.out.println("New Testcase->"+content +" Started");
		
		// Call the function to perform the UIoperation
		mOperationLogin.perform_homePage(content);
		}
	mSetLoginData.WriteData("PASS");
	}*/
	
	
	// Verifies the SignUp Page Web-Elements
		@Test(priority=1)
		private void testSignUpPage() throws Exception {
		UIOperation_Signup mOperationSignup = new UIOperation_Signup(driver);
			
		//Read Keyword sheet for LoginPage
		Sheet sheet =	file.ReadExcel("Test Cases_SignUp");
		
		int row = sheet.getRows();
		for(int i =2; i<=row-1; i++){
			Cell cell = sheet.getCell(2, i);
			
			String content = cell.getContents().toString();
			System.out.println("New Testcase->"+content +" Started");
			
			// Call the function to perform the UIoperation
//			mOperationLogin.perform_homePage(content);
			}
		mSetSignupData.WriteData("PASS");
		}
	
	
}
