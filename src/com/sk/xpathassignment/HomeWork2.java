package com.sk.xpathassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();	
		login();
		flyWindowMinimize();
		createUser();
		modifyUser();
		deleteUser();
		logOut();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			oBrowser.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//a[@id='loginButton']")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void flyWindowMinimize()
	{
		try 
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("createUserDiv")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='firstName']")).sendKeys("jhone");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='lastName']")).sendKeys("a");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='email']")).sendKeys("john@gmail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='password']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(500);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[@class='userNameSpan']")).click();
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='firstName']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='firstName']")).sendKeys("smitt");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='lastName']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='lastName']")).sendKeys("b");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='email']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='email']")).sendKeys("smitt@gmail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='username']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='password']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='password']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//span[@class='buttonTitle']")).click();
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[@class='userNameSpan']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
		}
		catch(Exception e)
		{
			
		}
	}
	static void logOut() 
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//a[@id='logoutLink']")).click();
		}
		catch(Exception e)
		{
			
		}
	}
	static void closeApplication()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.close();
		}
		catch(Exception e)
		{
			
		}
	}
}
