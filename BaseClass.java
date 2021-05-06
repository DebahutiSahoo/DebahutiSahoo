package com.RMS.TestCases;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.RMS.PageObjects.Login;
import com.RMS.Utilities.ReadConfig;


public class BaseClass {	
	static ReadConfig readconfig=new ReadConfig();	
	public String URL= readconfig.getApplicationURL();
	public String Username= readconfig.getUserName();
	public String Password= readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	public Login l=new Login(driver);
	@Parameters("Browser")
	@BeforeClass(alwaysRun = true)
	public static void setup( String br){			
		logger = Logger.getLogger(TC_TopmenuButtonaTest_001.class);
		//DOMConfigurator is used to configure logger from xml configuration file
         //DOMConfigurator.configure("Log4j.xml");
		PropertyConfigurator.configure("log4j.properties");
		if(br.equals("Chrome"))
		{
		System.setProperty ("webdriver.chrome.driver",readconfig.getChromepath() );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}else if(br.equals("FireFox"))
		{
		System.setProperty ("webdriver.gecko.driver",readconfig.getFirefoxpath());
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		}else{
		System.setProperty ("webdriver.ie.driver",readconfig.getIEDriverpath());
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		}
	
	}
	@BeforeMethod(alwaysRun = true)
	public void TestLogin() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	driver.get(URL);
	Thread.sleep(5000);
	logger.info("URL Is opened");	
	l.Setusername(Username);	
	logger.info("Entered Username");
	l.SetPwd(Password);	
	logger.info("Entered password");
	l.Loginclick();
	Thread.sleep(4000);
	logger.info("Login To the RMS Application");
	}
	@AfterMethod(alwaysRun = true)
	public void TestLogout() throws InterruptedException
	{
		l.LogoutClick();
		Thread.sleep(4000);
		logger.info("Logout From The RMS Application");
	}
	
	@AfterClass(alwaysRun = true)
	public void teardown()
	{
		driver.quit();
		}

public void captureScreen(WebDriver driver,String tname) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"/ScreenShots/"+tname+".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
	}
	}

