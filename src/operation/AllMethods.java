package operation;

import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.annotations.Test;

public class AllMethods {
	WebDriver driver;

	public void Assert(String Actual, String Expected) {
		// TODO Auto-generated method stub
		
		Assert.assertEquals(Actual, Expected);
	}
	
	public void FindXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).getText();
	}

	

}

