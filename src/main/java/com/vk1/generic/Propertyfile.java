package com.vk1.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile implements AutoConstant {
	public String getpropertydata(String keyvalue) throws FileNotFoundException, IOException  {
		
		Properties p = new Properties();
		p.load(new FileInputStream(propertyfilepath));
		return p.getProperty(keyvalue);
		
		
	}

}
