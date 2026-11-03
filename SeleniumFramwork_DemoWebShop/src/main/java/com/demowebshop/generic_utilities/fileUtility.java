package com.demowebshop.generic_utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class fileUtility {
	public String readKeyValueFromPeopertyfile(String key) throws FileNotFoundException, IOException {
		Properties property=new Properties();
		property.load(new FileInputStream(FrameworkConstants.propertyFilepath));
		return property.getProperty(key);
	}

}
