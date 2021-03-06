package ProductBuy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportsShoes {
	
	
	@FindBy(xpath = "//a[@class='_2Xp0TH fyt9Eu'][contains(.,'2')]")
	private WebElement secondPage;
	
	public WebDriver driver;
	
	public SportsShoes(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	
	public void scroll() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for(int sl=0;;sl++)
        {
            if(sl>=2)
            {
                break;
            }
            jse.executeScript("window.scrollBy(0,200)","");
            Thread.sleep(1000);
        }
      
      Thread.sleep(1000);
      secondPage.click();
      
	}

}
