package com.sk.assignment19_5_21;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		lanchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		createUser1();
		createUser2();
		createUser3();
		logout();
		user1Login();
		user1Logout();
		user2Login();
		user2Logout();
		user3Login();
		user3Logout();
		login();
		deleteUser1();
		deleteUser1();
		deleteUser1();
		logout();
		closeApplication();
		
		
	}
	static void lanchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}
		catch(Exception e)
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
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.holdsLock(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyWindow()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser1()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("jhone");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("s");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("jhone@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Scott");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("s");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("scott@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("smitt");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("s");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("smitt@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user3");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("user3");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("user3");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication()
	{
		try 
		{
			oBrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void user1Login()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void user1Logout()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void user2Login()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void user2Logout()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void user3Login()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user3");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void user3Logout()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser1()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
