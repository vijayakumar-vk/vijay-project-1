package com.vk1.generic;

import java.io.FileNotFoundException;
/**
 * To open and close the browser
 */
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements AutoConstant{

	
	public WebDriver driver;
	public Propertyfile p;
	public Photo p1;
	public Utilities u =new Utilities();
	/**
	 * to open the browser
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@BeforeMethod
	public void open() throws FileNotFoundException, IOException {
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		p = new Propertyfile();
		driver.get(p.getpropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * to close the browser and take photo
	 * @param r
	 * @throws IOException
	 */
	@AfterMethod
	public void close(ITestResult r ) throws IOException {
		int status = r.getStatus();
				String name = r.getName();
				if(status==2) {
					p1 = new Photo();
					p1.getphoto(driver, name);
				}
		driver.quit();
	}
}
