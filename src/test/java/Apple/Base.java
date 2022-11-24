package Apple;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utility.ReadProperties;


public class Base {
	static WebDriver driver;
	
	ReadProperties read = new ReadProperties();
	
	
	@BeforeClass
	public void setup() throws IOException
	{
		
	
		System.setProperty("webdriver.chrome.driver","C:/Users/Arun Kumar KR/Eclipse folder/arunPractice/QacircleApple/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(read.getBaseUrl());		
	}

	
	
	@AfterClass
	public void close()
	{
		driver.close();
	}

}
