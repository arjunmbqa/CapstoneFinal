package espocrm.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	
	private Properties properties;
	private FileInputStream fileInputStream;
	private String filePath;
	
	public ReadConfigFile(String filePath) {
		this.filePath = filePath;
		loadPropertiesFile();
	}
	
	public String getBrowserName() {
		return properties.getProperty("browserName");
	}
	
	public String getBaseUrl() {
		return properties.getProperty("baseUrl");
	}
	
	public int getWaitTime() {
		return Integer.parseInt(properties.getProperty("waitTime"));
	}
	
	public String getEspoCrmUsername() {
		return properties.getProperty("username");
	}
	
	public String getEspoCrmPassword() {
		return properties.getProperty("password");
	}
	
	private Properties loadPropertiesFile() {
		try {
			properties = new Properties();
			fileInputStream = new FileInputStream(filePath);
			properties.load(fileInputStream);
			return properties;
		}
		catch (IOException io) {
			io.printStackTrace();
			return null;
		}
		finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				}
				catch (IOException io) {
					io.printStackTrace();
				}
			}
		}
	}
}
