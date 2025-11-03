package UtilsLayer;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
	
	public static String getProperty(String key) {

		Properties prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//java//ConfigLayer//OHRM.properties");

			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();

		}

		return prop.getProperty(key);
	}

}
