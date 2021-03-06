package ProductBuy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage 
{
	
public WebDriver driver;
	
	@FindBy(xpath = "//a[contains(.,'Login & Signup')]")
	private static WebElement login;
	
			 
	 public HomePage(WebDriver driver)
			 {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			 }

           
		  public LoginPopUp flipkartHomePage() throws InterruptedException 
		  {
			  Thread.sleep(20);
		   login.click();
		   Thread.sleep(20);
		   return new LoginPopUp(driver);
		   
		  }
		 
		  
    
}
