package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties 
{
	Properties pro = new Properties();
	
	public ReadProperties()
	{
		
		InputStream ip = null;
		try {
			ip = new FileInputStream("C:\\Users\\Arun Kumar KR\\Eclipse folder\\arunPractice\\QacircleApple\\Input\\Inputdata.properties");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Exception is "+e.getMessage());
		}
		try {
			pro.load(ip);
		} 
		catch (IOException e) {
			System.out.println("Exception is "+e.getMessage());
		}
		
	}
	
	public String getBaseUrl()
	{
		String path=pro.getProperty("baseurl");
		return path;
	}
	
	public String getPincode()
	{
		String pin=pro.getProperty("pincode");
		return pin;
	}
}
