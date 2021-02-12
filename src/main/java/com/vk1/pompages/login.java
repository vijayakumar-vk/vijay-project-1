package com.vk1.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	@FindBy(id="email")
	private WebElement usertb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy(id="u_0_b")
	private WebElement loginbtn;
	
	public login (WebDriver driver){

		PageFactory.initElements(driver, this);
	}
	
	public void usernasme() {
		usertb.sendKeys("vijay");
	}
	
	public void password() {
		passwordtb.sendKeys("sghjk");
		
	}
	
	public void loginpressed() {
		loginbtn.click();
	}
}


