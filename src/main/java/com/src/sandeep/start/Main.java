package com.src.sandeep.start;

import com.src.sandeep.utils.Utils;

public class Main {
	public static void main(String args[]) {
		System.out.println("Started in main class");
		System.out.println("profile from property file is: " + Utils.getProfile());
		System.out.println("name from property file is: " + Utils.getName());
		System.out.println("employee id from property file is: " + Utils.getEmployeeId());
	}
}
