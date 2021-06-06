package com.sk.assignment;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment2 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		lanchBrowser();
		navigate();
		login();
		minimizeFlywindow();
		createUser();
		modifyUser();
		deleteUser(); 
		logout();
		close();
	}
	static void lanchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
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
			Thread.sleep(1000);;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void  login()
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']")).click();
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
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlywindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
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
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Jhone124");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Smitt124");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("jhone214@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("admin23");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("2241jhone1");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("2241jhone1");
			Thread.sleep(1000);
			oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(3000);
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
			Thread.sleep(1000);
			oBrowser.findElement(By.className("timeZoneGroupName")).click();
			Thread.sleep(1000);
			
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Jhone142");			
			Thread.sleep(1000);
			
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("sk214");
			Thread.sleep(1000);
			
			oBrowser.findElement(By.id("userDataLightBox_emailField")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("s14k@gmial.com");
			Thread.sleep(1000);
			
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("124sk");
			Thread.sleep(1000);
			
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("sk14dk");
			Thread.sleep(1000);
			
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("sk14dk");
			Thread.sleep(1000);
			
			oBrowser.findElement(By.className("buttonTitle")).click();
			Thread.sleep(1000);	
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
			Thread.sleep(1000);
			oBrowser.findElement(By.className("timeZoneGroupName")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void close()
	{
		try 
		{
			Thread.sleep(1000);
			oBrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
