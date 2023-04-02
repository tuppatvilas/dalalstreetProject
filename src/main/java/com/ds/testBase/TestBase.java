package com.ds.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashBoardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.TransitionPage;
import com.ds.utilities.ReadConfig;
import com.ds.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public LoginPage login_obj;
	public DashBoardPage dash_obj;
	public TransitionPage get_data;
	public UtilClass util_obj;
	public ExchangePage exchange_obj;
	public static Logger logger;
	
	@BeforeTest
	public void start()
	{
	     logger = Logger.getLogger("DalalStreet automation Framework");
		PropertyConfigurator.configure("Log4jfile.properties");	
		logger.info("framework exicution started");
	}
	@AfterTest
	public void stop()
	{
		logger.info("framework exicution stoped");
	}
	
public static WebDriver driver;
	
    @Parameters("browser")
	@BeforeMethod
	public void setUp(String br)
	{
		
		
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		ReadConfig config_obj = new ReadConfig();
		driver.get(config_obj.geturl());
		//driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("brauser loncg,url,maximise");
	//---------obj creation----------------------------	
		
		login_obj = new LoginPage(driver);
	     dash_obj = new DashBoardPage(driver);
		get_data =new TransitionPage(driver);
		util_obj = new UtilClass();
		exchange_obj = new ExchangePage(driver);
		logger.info("object creation");
		
		
//----------login---------------------------------------------
		//login_obj.enteremailadd("vilastuppat@gmail.com");
		login_obj.enteremailadd(config_obj.getemailadd());
		//login_obj.enterpassword("Vilas@3113");
		login_obj.enterpassword(config_obj.getpassword());
		login_obj.clickonloginbtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("login to the application");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
//		driver.quit();
	}
	
	/*public static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		//Thread.sleep(2000);
		//driver.quit();
	}
	*/

}
