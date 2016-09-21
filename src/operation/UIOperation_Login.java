package operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import excelExportAndFileIO.setHomePageData;
import excelExportAndFileIO.setLoginData;
import objects.LoginObjects;
import objects.homePageObjects;

public class UIOperation_Login {
    WebDriver driver;
    setLoginData msetData = new setLoginData();
    LoginObjects mLoginObjects =  new LoginObjects();
   AllMethods methods = new AllMethods(); 
   
   String LoginResultFile = "D:\\A.K FOLDER\\Workspace\\OakJobs_Project_Framework\\Result_Excel_File\\Login.xls";
   
    public UIOperation_Login(WebDriver driver){
        this.driver = driver;
    }
    public void perform_homePage(String operationLogin) throws Exception{
    	
    	switch (operationLogin.toUpperCase()) {
		
    	
    	 case "GOTOURL":
             //Get url of application
         	driver.get(mLoginObjects.pageURL);
             String URL = driver.getCurrentUrl();
             boolean URLMatch = URL.equals(mLoginObjects.pageURL);
         	 if (URLMatch == true){
             msetData.WriteDataPass(2);
             System.out.println("Page URL verified");
             System.out.println("====================");
             System.out.println("");
 			} 
         	else {
 	        msetData.WriteDataFail(2);
 	        System.out.println("====================");
             System.out.println("");
             Assert.fail();
 			}
             break;
             
             
         
         case "TITLE":
             //Verify Page title
         	String title = driver.getTitle();	
         	boolean x = title.contentEquals(mLoginObjects.pageTitle);
         	
         	if (x == true){
         	System.out.println("Page TITLE verified");
            System.out.println("====================");
            System.out.println("");
             }
             else {
             msetData.WriteDataFail(3);
             System.out.println("Page Title Not Verified.");
             System.out.println("====================");
             System.out.println("");
             Assert.fail();
 			} 
             break;
             
             
         
         case "LOGO":
         	//Verified Page LOGO
         	String Logo_src = driver.findElement(By.xpath(".//*[@id='page-top']/nav/div/div[1]/a/img")).getAttribute("src");
         	System.out.println(Logo_src);
         	boolean logomatch = Logo_src.contentEquals(mLoginObjects.pageLogoPath);
         	
         	if (logomatch == true){
         	System.out.println("Website LOGO verified");
         	System.out.println("====================");
         	System.out.println("");
 			} 
         	else {
 			msetData.WriteDataFail(4);
 			System.out.println("LOGO Path not matching.");
 			System.out.println("====================");
 	        System.out.println("");
 			Assert.fail();
         	}	
         break;
         
         
         
         case "TXT1":
             //verify LOGIN text
         	try {
          	boolean text1 =  driver.findElement(By.xpath(mLoginObjects.pageText1)).isDisplayed();
         	if (text1 == true){
         		System.out.println("LOGIN text located");
         		System.out.println("====================");
                System.out.println("");
         	}
         	} catch (Exception e) {
         		msetData.WriteDataFail(5);
         	    System.out.println("LOGIN text not located");
         	    System.out.println("====================");
            	System.out.println("");
            	Assert.fail("", e);
         	 }
         	break;
         	
         	
         	
         case "TXT2":
             //verify LOGIN text
         	try {
          	boolean text1 =  driver.findElement(By.xpath(mLoginObjects.pageText2)).isDisplayed();
         	if (text1 == true){
         		System.out.println("LOGIN text located");
         		System.out.println("====================");
                System.out.println("");
         	}
         	} catch (Exception e) {
         		msetData.WriteDataFail(6);
         	    System.out.println("LOGIN text not located");
         	    System.out.println("====================");
            	System.out.println("");
            	Assert.fail("", e);
         	 }
         	break;
         
         

         case "EMAIL":
        	 //Verify Email field
            try {
			boolean email = driver.findElement(By.xpath(mLoginObjects.emailField)).isDisplayed();
			if (email == true){
	         	System.out.println("EMAIL field located");
	         	System.out.println("====================");
	            System.out.println("");
			}
        	} catch (Exception e) {
        		msetData.WriteDataFail(7);
         	    System.out.println("EMAIL field not located");
         	    System.out.println("====================");
            	System.out.println("");
            	Assert.fail("", e);
			}
         	break;
        	 

         	
         case "PSW":
        	 //Verify PASSWORD field
            try {
			boolean password = driver.findElement(By.xpath(mLoginObjects.pwdField)).isDisplayed();
			if (password == true){
	         	System.out.println("PASSWORD field located");
	         	System.out.println("====================");
	            System.out.println("");
			}
        	} catch (Exception e) {
        		msetData.WriteDataFail(8);
         	    System.out.println("PASSWORD field not located");
         	    System.out.println("====================");
            	System.out.println("");
            	Assert.fail("", e);
			}
         	break;
        	 
         	
         	
         case "SGNIN":
        	 //Verify SIGNIN button
            try {
			boolean button = driver.findElement(By.xpath(mLoginObjects.signInButton)).isDisplayed();
			if (button == true){
	         	System.out.println("SIGN IN  button located");
	         	System.out.println("====================");
	            System.out.println("");
			}
        	} catch (Exception e) {
        		msetData.WriteDataFail(9);
         	    System.out.println("SIGN IN button not located");
         	    System.out.println("====================");
            	System.out.println("");
            	Assert.fail("", e);
			}
         	break;
         	
         	
         	
         case "LNK1":
        	 //Verify FORGOT PASSWORD link
            try {
			boolean button = driver.findElement(By.xpath(mLoginObjects.link1)).isDisplayed();
			String link = driver.findElement(By.xpath(mLoginObjects.link1)).getAttribute("href");
			if (button == true){
	         	System.out.println("FORGOT PASSWORD link located");
	         	System.out.println("href link is:-c" + link);
	         	System.out.println("====================");
	            System.out.println("");
			}
        	} catch (Exception e) {
        		msetData.WriteDataFail(10);
         	    System.out.println("FORGOT PASSWORD link not located");
         	    System.out.println("====================");
            	System.out.println("");
            	Assert.fail("", e);
			}
         	break;
         	
         	
         	
         case "TXT3":
        	 //Verify page text
        	try {
           	boolean text1 =  driver.findElement(By.xpath(mLoginObjects.pageText3)).isDisplayed();
           	if (text1 == true){
           		System.out.println("'Don't have an account? Sign Up' text located");
           		System.out.println("====================");
                System.out.println("");
             }
             } catch (Exception e) {
                System.out.println("'Don't have an account? Sign Up' text not located");
                System.out.println("====================");
              	System.out.println("");
               	Assert.fail("", e);
              }
             break;
         	
      
         case "LNK2":
        	 //Verify FORGOT PASSWORD link
            try {
			boolean button = driver.findElement(By.xpath(mLoginObjects.link2)).isDisplayed();
			String link = driver.findElement(By.xpath(mLoginObjects.link1)).getAttribute("href");
			if (button == true){
	         	System.out.println("FORGOT PASSWORD link located");
	         	System.out.println("href link is:-c" + link);
	         	System.out.println("====================");
	            System.out.println("");
			}
        	} catch (Exception e) {
        		msetData.WriteDataFail(12);
         	    System.out.println("FORGOT PASSWORD link not located");
         	    System.out.println("====================");
            	System.out.println("");
            	Assert.fail("", e);
			}
         	break;             
             
             
             
         	
		default:
		 		System.out.println("CASE DOES NOT MATCH......");
		 		System.out.println("====================");
		 		Assert.fail();
			break;
		}
    	
    	

    }	

}