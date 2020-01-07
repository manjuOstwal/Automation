package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ProductBuy.Dashboard;
import ProductBuy.HomePage;
import ProductBuy.LoginPopUp;
import ProductBuy.SportsShoes;


public class FlipkartTestCase 
{
	public WebDriver driver;
	
	@BeforeTest

    public void setup(){
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumGecko\\geckodriver.exe");
		
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.flipkart.com");

    }
	
	@AfterTest
	
	public void tearDown()
	{ 
		driver.close();
	}

	@Test(priority=0)

    public void testFlipKartAssessment() throws InterruptedException{

        //Create Login Page object

		HomePage hm = new HomePage(driver);
		LoginPopUp lgpop = hm.flipkartHomePage();
		Dashboard dash = lgpop.loginWithCredentials();
		SportsShoes ss = dash.clickMenCategory();
		
        
    }


}