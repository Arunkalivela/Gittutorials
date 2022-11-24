package Apple;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ExecuteTest extends Base {
	
	@Test
	public void toTest() throws InterruptedException, IOException
	{
		
		driver.findElement(By.linkText("TV & Home")).click();
		driver.findElement(By.linkText("Apple TV app")).click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,10000)");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Buy")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class=\"rc-dimension-selector-row form-selector\"][2]")).click();
		JavascriptExecutor jp=(JavascriptExecutor) driver;
		jp.executeScript("window.scroll(0,700)");
		
		driver.findElement(By.xpath("//span[text()='Get delivery dates']")).click();
		Thread.sleep(2000);
		
		WebElement popup = driver.findElement(By.xpath("//div[@class='rc-overlay-popup-content']/..//input[@name='postalCode']"));
	
		Actions action = new Actions(driver);
		action.doubleClick(popup);
		
		popup.sendKeys(read.getPincode());
		
		driver.findElement(By.xpath("//button[@class='rc-overlay-close']")).click();
		Thread.sleep(2000);
		
         driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
         
         File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     	FileUtils.copyFile(file,new File("C:/Users/Arun Kumar KR/Eclipse folder/arunPractice/QacircleApple/Screenshot"+".png"));
     	}
		
	
}


