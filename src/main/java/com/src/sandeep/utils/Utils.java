package com.src.sandeep.utils;

public class Utils {
	private final static String propertyFile = "config.properties";
	private static final ConfigHelper configHelper = ConfigHelper.getConfigHelperInstance(propertyFile);

	public static String getName() {
		return configHelper.getValueFromConfig("name");
	}

	public static String getEmployeeId() {
		return configHelper.getValueFromConfig("emp.id");
	}

	public static String getProfile() {
		return configHelper.getValueFromConfig("profile");
	}
}
