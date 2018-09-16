package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LogOutPage 
{

	WebDriver driver;
	
	 public LogOutPage(WebDriver maindriver) 
	 {
		this.driver=maindriver;
	 }
	
	@FindBy(xpath="//*[contains(text(),'Logout')]/@href") WebElement logoutLink;
	
	public void logOutFromApplication()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();",logoutLink);
	}
	
	
	

}
