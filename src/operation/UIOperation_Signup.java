package operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import excelExportAndFileIO.setSignupData;
import objects.SignUpObjects;

public class UIOperation_Signup {
    WebDriver driver;
    setSignupData msetData = new setSignupData();
    SignUpObjects mSignupObjects =  new SignUpObjects();
    AllMethods methods = new AllMethods(); 
	String HomeResultFile = "D:\\A.K FOLDER\\Workspace\\OakJobs_Project_Framework\\Result_Excel_File\\HomePage.xls";

   
    public UIOperation_Signup(WebDriver driver){
        this.driver = driver;
    }
    public void perform_Signup(String operationSignup) throws Exception{
    	
    	switch (operationSignup.toUpperCase()) {
    
        case "GOTOURL":
            //Get url of application
        	driver.get(mSignupObjects.pageURL);
            String URL = driver.getCurrentUrl();
            boolean URLMatch = URL.equals(mSignupObjects.pageURL);
        	if (URLMatch == true){
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
        	boolean x = title.contentEquals(mSignupObjects.pageTitle);
        	
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
        	//Set text on control
        	String Logo_src = driver.findElement(By.xpath(".//*[@id='page-top']/nav/div/div[1]/a/img")).getAttribute("src");
         	System.out.println(Logo_src);
         	boolean logomatch = Logo_src.contentEquals(mSignupObjects.pageLogoPath);
         	
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
            //verify  "Create Your Account" text
        	try {
				
         	boolean text1 =  driver.findElement(By.xpath(mSignupObjects.pageText1)).isDisplayed();
        	if (text1 == true){
        		System.out.println(" 'Create Your Account' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
        		msetData.WriteDataFail(5);
        	    System.out.println(" 'Create Your Account' text not located");
        	    System.out.println("====================");
           	    System.out.println("");
           	    Assert.fail("", e);
        	 }
        	break;
            
            
            
        case "TXT2":
        	//Verify 'First Name' text
        	try {
			boolean text2 =  driver.findElement(By.xpath(mSignupObjects.pageText2)).isDisplayed();
        	if (text2 == true){
        		System.out.println("'First Name' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
    		} catch (Exception e) {
	        		msetData.WriteDataFail(6);
	        		System.out.println("'First Name' text not located");
	        		System.out.println("====================");
	        		System.out.println("");
	        		Assert.fail("", e);
			}
            break;
            
            
            
        case "TXT3":
        	//Verify ''Last Name'' field text 
        	try {
        	boolean text3 =  driver.findElement(By.xpath(mSignupObjects.pageText3)).isDisplayed();
        	if (text3 == true){
        		System.out.println("'Last Name' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
			} catch (Exception e) {
	        		msetData.WriteDataFail(7);
	        		System.out.println("'Last Name' text not located");
	        		System.out.println("====================");
	        		System.out.println("");
	        		Assert.fail("", e);
			}
            break;
            
            
            
        case "TXT4":
        	//Verify WHERE field text 
        	try {
        	boolean text4 =  driver.findElement(By.xpath(mSignupObjects.pageText4)).isDisplayed();
        	if (text4 == true){
        		System.out.println("' city, state or zipcode' text located");
        		System.out.println("====================");
                System.out.println("");
        	}	
			} catch (Exception e) {

	        		msetData.WriteDataFail(8);
	        		System.out.println("' city, state or zipcode' text not located");
	        		System.out.println("====================");
	        		System.out.println("");
	        		Assert.fail("",e);
			}
            break;
            
            
            
        case "TXT5":
        	//Verify 'Email Address' field text 
        	try {
        	boolean text5 =  driver.findElement(By.xpath(mSignupObjects.pageText5)).isDisplayed();
        	if (text5 == true){
        		System.out.println("'Email Address' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		msetData.WriteDataFail(9);
            		System.out.println("'Email Address' text not located");
            		System.out.println("====================");
            		System.out.println("");
            		Assert.fail("", e);
    		}
        	break;
        	
        	
        case "TXT6":
        	//Verify 'Email Address' field text 
        	try {
        	boolean text6 =  driver.findElement(By.xpath(mSignupObjects.pageText6)).isDisplayed();
        	if (text6 == true){
        		System.out.println("'Phone Number' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		msetData.WriteDataFail(10);
            		System.out.println("'Phone Number' text not located");
            		System.out.println("====================");
            		System.out.println("");
            		Assert.fail("", e);
    		}
        	break;
        	
        	
        	
        case "TXT7":
        	//Verify 'Email Address' field text 
        	try {
        	boolean text7 =  driver.findElement(By.xpath(mSignupObjects.pageText7)).isDisplayed();
        	if (text7 == true){
        		System.out.println("'Password' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		msetData.WriteDataFail(11);
            		System.out.println("'Password' text not located");
            		System.out.println("====================");
            		System.out.println("");
            		Assert.fail("", e);
    		}
        	break;
        	
        	
        	
        case "TXT8":
        	//Verify 'Email Address' field text 
        	try {
        	boolean text8 =  driver.findElement(By.xpath(mSignupObjects.pageText8)).isDisplayed();
        	if (text8 == true){
        		System.out.println("'Confirm Password' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		msetData.WriteDataFail(12);
            		System.out.println("'Confirm Password' text not located");
            		System.out.println("====================");
            		System.out.println("");
            		Assert.fail("", e);
    		}
        	break;
        	
        	
        case "TXT9":
        	//Verify 'Email Address' field text 
        	try {
        	boolean text9 =  driver.findElement(By.xpath(mSignupObjects.pageText9)).isDisplayed();
        	if (text9 == true){
        		System.out.println("I would like to receive job alerts from OakJobAlerts.com' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		msetData.WriteDataFail(13);
            		System.out.println("'I would like to receive job alerts from OakJobAlerts.com' text not located");
            		System.out.println("====================");
            		System.out.println("");
            		Assert.fail("", e);
    		}
        	break;
        	
        	
        case "TXT10":
        	//Verify 'Email Address' field text 
        	try {
        	boolean text10 =  driver.findElement(By.xpath(mSignupObjects.pageText10)).isDisplayed();
        	if (text10 == true){
        		System.out.println("'I agree to the Terms of Service and Privacy Policy of this site' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		msetData.WriteDataFail(14);
            		System.out.println("'I agree to the Terms of Service and Privacy Policy of this site' text not located");
            		System.out.println("====================");
            		System.out.println("");
            		Assert.fail("", e);
    		}
        	break;
        	
        	
        case "TXT11":
        	//Verify 'Email Address' field text 
        	try {
        	boolean text11 =  driver.findElement(By.xpath(mSignupObjects.pageText11)).isDisplayed();
        	if (text11 == true){
        		System.out.println("'Already registered? Click here to login' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		msetData.WriteDataFail(15);
            		System.out.println("'Already registered? Click here to login' text not located");
            		System.out.println("====================");
            		System.out.println("");
            		Assert.fail("", e);
    		}
        	break;
            
            
            
        case "BTN":
            //Verify App Store Logo
        	try {
        		boolean button = driver.findElement(By.xpath(mSignupObjects.button)).isDisplayed();
    			if (button == true){
    	         	System.out.println("REGISTER  button located");
    	         	System.out.println("====================");
    	            System.out.println("");
    			}
            	} catch (Exception e) {
            		msetData.WriteDataFail(16);
             	    System.out.println("REGISTER button not located");
             	    System.out.println("====================");
                	System.out.println("");
                	Assert.fail("", e);
    		}
            break;
            
            
            
        case "LNK1":
            //Verify Link on webpage.
        try {
        	boolean Link1 =  driver.findElement(By.xpath(mSignupObjects.link1)).isDisplayed();
        	if (Link1 == true){
        		System.out.println("Terms of Service Link located");
        		System.out.println("====================");
                System.out.println("");
        	}
        } catch (Exception e) {
        		msetData.WriteDataFail(17);
        		System.out.println("Terms of Service Link not located");
        		System.out.println("====================");
        		System.out.println("");
        		Assert.fail("", e);
 			}	
        	break;
        	
        	
            
        case "LNK2":
        	 //Verify Link on webpage.
        	try {
        	boolean Link2 =  driver.findElement(By.xpath(mSignupObjects.link2)).isDisplayed();
        	if (Link2 == true){
        		System.out.println("Privacy Policy Link located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
        			msetData.WriteDataFail(18);
            		System.out.println("Privacy Policy Link not located");
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
