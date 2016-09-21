package operation;

import java.util.Properties;
import objects.homePageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.thoughtworks.selenium.webdriven.commands.GetValue;

import operation.AllMethods;
import excelExportAndFileIO.*;

public class UIOperation_HomePage {
    WebDriver driver;
    setHomePageData setData = new setHomePageData();
    homePageObjects homeObjects =  new homePageObjects();
    AllMethods methods = new AllMethods(); 
	String HomeResultFile = "D:\\A.K FOLDER\\Workspace\\OakJobs_Project_Framework\\Result_Excel_File\\HomePage.xls";

   
    public UIOperation_HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void perform_homePage(String operationHomePage) throws Exception{
    	
    	switch (operationHomePage.toUpperCase()) {
    
        case "GOTOURL":
            //Get url of application
        	driver.get(homeObjects.pageURL);
            String URL = driver.getCurrentUrl();
            boolean URLMatch = URL.equals(homeObjects.pageURL);
        	if (URLMatch == true){
            setData.WriteDataPass(2);
            System.out.println("Page URL verified");
            System.out.println("====================");
            System.out.println("");
			} 
        	else {
	        setData.WriteDataFail(2);
	        System.out.println("====================");
            System.out.println("");
            Assert.fail();
			}
            break;
            
            
        
        case "TITLE":
            //Verify Page title
        	String title = driver.getTitle();	
        	boolean x = title.contentEquals(homeObjects.pageTitle);
        	
        	if (x == true){
        	setData.WriteDataPass(3);
        	System.out.println("Page TITLE verified");
            System.out.println("====================");
            System.out.println("");
            }
            else {
            setData.WriteDataFail(3);
            System.out.println("Page Title Not Verified.");
            System.out.println("====================");
            System.out.println("");
            Assert.fail();
			} 
            break;
            
            
        
        case "LOGO":
        	//Verifies page LOGO
        	String Logo_src = driver.findElement(By.className("img-responsive")).getAttribute("src");	
        	boolean logomatch = Logo_src.contentEquals(homeObjects.pageLogoPath);
        	
        	if (logomatch == true){
        	setData.WriteDataPass(4);
        	System.out.println("Website LOGO verified");
        	System.out.println("====================");
        	System.out.println("");
			} 
        	else {
			setData.WriteDataFail(4);
			System.out.println("LOGO Path not matching.");
			System.out.println("====================");
	        System.out.println("");
			Assert.fail();
        	}	
        break;
        	
        	
            
        case "SGNINBTN":
            //verify LOGIN button
        	try {
        	boolean BTN1 = driver.findElement(By.xpath(homeObjects.signinButton)).isDisplayed();
           	if (BTN1 == true){
           	 setData.WriteDataPass(5);
        		System.out.println("Sign In button located");
        		System.out.println("====================");
              	System.out.println("");
        	}
        	} catch (Exception e) {
        		setData.WriteDataFail(5);
        		System.out.println("Sign In button not located");
        		System.out.println("====================");
              	System.out.println("");
        		Assert.fail("", e);
        	
        	}
              	break;
        	
        	
            
        case "TXT1":
            //verify WHAT text
        	try {
				
         	boolean text1 =  driver.findElement(By.xpath(homeObjects.pageText1)).isDisplayed();
        	if (text1 == true){
        		 setData.WriteDataPass(6);
        		System.out.println("WHAT text located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
        		setData.WriteDataFail(6);
        	    System.out.println("WHAT text not located");
        	    System.out.println("====================");
           	    System.out.println("");
           	    Assert.fail("", e);
        	 }
        	break;
            
            
            
        case "TXT2":
        	//Verify WHERE text
        	try {
			boolean text2 =  driver.findElement(By.xpath(homeObjects.pageText2)).isDisplayed();
        	if (text2 == true){
        		 setData.WriteDataPass(7);
        		System.out.println("WHERE text located");
        		System.out.println("====================");
                System.out.println("");
        	}
    		} catch (Exception e) {
	        		setData.WriteDataFail(7);
	        		System.out.println("WHERE text not located");
	        		System.out.println("====================");
	        		System.out.println("");
	        		Assert.fail("", e);
			}
            break;
            
            
            
        case "SBMTBTN":
        	//Verify submit button
        	try {
        	boolean BTN2 = driver.findElement(By.xpath(homeObjects.submitButton)).isDisplayed();
        	if (BTN2 == true){
        		 setData.WriteDataPass(8);
        		System.out.println("SUBMIT button located");
        		System.out.println("====================");
                System.out.println("");
        	}
			} catch (Exception e) {
	        	setData.WriteDataFail(8);
	        	System.out.println("SUBMIT button not located");
	        	System.out.println("====================");
	        	System.out.println("");
	        	Assert.fail("", e);
	        }
           break;
            
            
            
        case "TXT3":
        	//Verify WHAT field text 
        	try {
        	boolean text3 =  driver.findElement(By.xpath(homeObjects.pageText3)).isDisplayed();
        	if (text3 == true){
        		 setData.WriteDataPass(9);
        		System.out.println("' job title, keywords or company name' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
			} catch (Exception e) {
	        		setData.WriteDataFail(9);
	        		System.out.println("' job title, keywords or company name' text not located");
	        		System.out.println("====================");
	        		System.out.println("");
	        		Assert.fail("", e);
			}
            break;
            
            
            
        case "TXT4":
        	//Verify WHERE field text 
        	try {
        	boolean text4 =  driver.findElement(By.xpath(homeObjects.pageText4)).isDisplayed();
        	if (text4 == true){
        		setData.WriteDataPass(10);
        		System.out.println("' city, state or zipcode' text located");
        		System.out.println("====================");
                System.out.println("");
        	}	
			} catch (Exception e) {

	        		setData.WriteDataFail(10);
	        		System.out.println("' city, state or zipcode' text not located");
	        		System.out.println("====================");
	        		System.out.println("");
	        		Assert.fail("",e);
			}
            break;
            
            
            
        case "TXT5":
        	//Verify WHERE field text 
        	try {
        	boolean text5 =  driver.findElement(By.xpath(homeObjects.pageText5)).isDisplayed();
        	if (text5 == true){
        		setData.WriteDataPass(11);
        		System.out.println("' Download the Free IOS or Android App and Search Millions of Jobs' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		setData.WriteDataFail(11);
            		System.out.println("' Download the Free IOS or Android App and Search Millions of Jobs' text not located");
            		System.out.println("====================");
            		System.out.println("");
            		Assert.fail("", e);
    		}
        	break;
            
            
            
        case "IMG1":
        	//verify google play logo  
        	try {
          	boolean image1 =  driver.findElement(By.xpath(homeObjects.googlePlayImage)).isDisplayed();
        	if (image1 == true){
        		setData.WriteDataPass(12);
        		System.out.println("Google Play Image located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		setData.WriteDataFail(12);
            		System.out.println("Google Play Image not located");
            		System.out.println("====================");
            		System.out.println("");
    				Assert.fail("", e);
			}
            break;
            
            
            
        case "IMG2":
            //Verify App Store Logo
        	try {
        	boolean image2 =  driver.findElement(By.xpath(homeObjects.appstoreImage)).isDisplayed();
        	if (image2 == true){
        		setData.WriteDataPass(13);
        		System.out.println("App Store Image located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		setData.WriteDataFail(13);
            		System.out.println("App Store Image not located");
            		System.out.println("====================");
            		System.out.println("");
            		Assert.fail("", e);
    		}
            break;
            
            
            
        case "LNK1":
            //Verify Link on webpage.
        try {
        	boolean Link1 =  driver.findElement(By.xpath(homeObjects.link1)).isDisplayed();
        	if (Link1 == true){
        		setData.WriteDataPass(14);
        		System.out.println("About Me Link located");
        		System.out.println("====================");
                System.out.println("");
        	}
        } catch (Exception e) {
        		setData.WriteDataFail(14);
        		System.out.println("About Me Link not located");
        		System.out.println("====================");
        		System.out.println("");
        		Assert.fail("", e);
 			}	
        	break;
        	
        	
            
        case "LNK2":
        	 //Verify Link on webpage.
        	try {
        	boolean Link2 =  driver.findElement(By.xpath(homeObjects.link2)).isDisplayed();
        	if (Link2 == true){
        		setData.WriteDataPass(15);
        		System.out.println("Terms of Service Link located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
        			setData.WriteDataFail(15);
            		System.out.println("Terms of Service Link not located");
            		System.out.println("====================");
            		System.out.println("");	
            		Assert.fail("", e);
        	}
            break;
            
            
            
        case "LNK3":
        	 //Verify Link on webpage.
        	try {
        	boolean Link3 =  driver.findElement(By.xpath(homeObjects.link3)).isDisplayed();
        	if (Link3 == true){
        		setData.WriteDataPass(16);
        		System.out.println("Privacy Policy Link located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		setData.WriteDataFail(16);
            		System.out.println("Terms of Service Link not located");
            		System.out.println("====================");
            		System.out.println("");
            		Assert.fail("", e);
        	}
            break;
            
            
            
        case "LNK4":
        	 //Verify Link on webpage.
        	try {
        	boolean Link4 =  driver.findElement(By.xpath(homeObjects.link4)).isDisplayed();
        	if (Link4 == true){
        		setData.WriteDataPass(17);
        		System.out.println("Contact Us Link located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		setData.WriteDataFail(17);
            		System.out.println("Contact Us Link not located");
            		System.out.println("====================");
            		System.out.println("");
            		Assert.fail("" , e);
        	}
        	break;
            
            
            
        case "TXT6":
        	 //Verify Link on webpage.
        	try {
        	boolean text6 =  driver.findElement(By.xpath(homeObjects.pageText6)).isDisplayed();
        	if (text6 == true){
        		setData.WriteDataPass(18);
        		System.out.println("'Copyright © Oak Job Alerts 2016. All Rights Reserved.' text located");
        		System.out.println("====================");
                System.out.println("");
        	}
        	} catch (Exception e) {
            		setData.WriteDataFail(18);
            		System.out.println("Copyright © Oak Job Alerts 2016. All Rights Reserved.' text not located");
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