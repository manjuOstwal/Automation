package ProductBuy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	@FindBy(xpath = "//span[contains(.,'Men')]")
	private WebElement men;
	
	@FindBy(xpath = "//a[@href='/mens-footwear/sports-shoes/pr?sid=osp,cil,1cu&otracker=nmenu_sub_Men_0_Sports%20Shoes']")
	private WebElement sportsShoes;
	
	public WebDriver driver;
	
	public Dashboard(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	
	public SportsShoes clickMenCategory()
	{
		men.click();
		sportsShoes.click();
		return new SportsShoes(driver);
	}

}
