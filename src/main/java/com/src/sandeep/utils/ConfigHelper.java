package com.src.sandeep.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigHelper {

	private Properties props;

	private ConfigHelper() {
	}

	private void loadProperties(InputStream inputStream) throws IOException {
		if (inputStream != null) {
			props = new Properties();
			props.load(inputStream);
		}
	}

	public String getValueFromConfig(String key) {
		return props.getProperty(key);
	}

	public static ConfigHelper getConfigHelperInstance(String propertiesFile) {
		ConfigHelper configHelper = new ConfigHelper();
		try {
			configHelper.loadProperties(ConfigHelper.class.getClassLoader().getResourceAsStream(propertiesFile));
		} catch (IOException e) {
			System.out.println("Could not load property file" + e.getMessage());
		}
		return configHelper;
	}
}
