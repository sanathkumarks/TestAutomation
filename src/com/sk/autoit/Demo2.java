package com.sk.autoit;

public class Demo2 {
	public static void main(String[] args) {
		executeAutoITScript();
	}
	
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("D:\\AutoIt\\DemoTestScript2.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
