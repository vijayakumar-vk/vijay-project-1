package com.vk1.TestScripts;

import org.testng.annotations.Test;

import com.vk1.generic.BaseClass;
import com.vk1.pompages.login;

public class FbLoginPage extends BaseClass {
	@Test
	public void testcase1() {
		login l = new login(driver);
		l.usernasme();
		l.password();
		l.loginpressed();
		
	}

}
