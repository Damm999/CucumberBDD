package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import Constants.GlobalConstants;

public class ReadConfigFile {
	
	protected InputStream input = null;
	protected Properties prop = null;
	
	public ReadConfigFile() {
		try {
			//input = ReadConfigFile.class.getClassLoader().getResourceAsStream(GlobalConstants.Config_Properties_Loc);
			input = new FileInputStream(GlobalConstants.Config_Properties_Loc);
			prop = new Properties();
			prop.load(input);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getBrowser() {
		if(prop.getProperty("browserName")== null)
			return "";
		else
			return prop.getProperty("browserName");
	}

}
