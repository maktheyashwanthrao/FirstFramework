package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class properties {
	
	static Properties prop = new Properties();

	public static String readAppURL() throws IOException {
		InputStream input = new FileInputStream(
				"F:\\OnlineClasses\\AutomationmorningBatch\\SeleniumFramework\\src\\test\\java\\Config\\config.properties");
		prop = new Properties();
		prop.load(input);
		prop.getProperty("appURL");
		return prop.getProperty("appURL");

	}
	public static String readUserName() throws IOException {		
		prop.getProperty("username");
		return prop.getProperty("username");

	}
	
	public static String readPassword() throws IOException {		
		prop.getProperty("password");
		return prop.getProperty("password");

	}

}
