package com.vk1.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	/**
	 * To handle dropdown
	 * @param ele
	 * @param text
	 */
	public void dropdown(WebElement ele,String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	/**
	 * To handle mouseAction
	 * @param driver
	 * @param ele
	 */
	public void mouseAction(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	/**
	 * To handle DoubleClick
	 * @param driver
	 * @param target
	 */
	
	public void doubleClick(WebDriver driver,WebElement target) {
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();
		}
	/**
	 * To handle ScrollBar
	 * @param driver
	 * @param x
	 * @param y
	 */
	

	public void scrollbar(WebDriver driver,int x,int y) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	/**
	 * To handle AlertPopup
	 * @param driver
	 */
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * To wait for the element
	 * @param driver
	 * @param element
	 */
	public void elementToBeClicable(WebDriver driver,WebElement element) {
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}

}
