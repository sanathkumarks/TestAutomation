package com.sk.xpathassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork6 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();	
		login();
		flyWindowMinimize();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
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
	
	

	static void createCustomer()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//a[@class='content tasks']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='addNewButton']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Customer");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//textarea[@id='customerLightBox_descriptionField']")).sendKeys("Description about customer");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createProject()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='addNewButton']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("Project1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//textarea[@id='projectPopup_projectDescriptionField']")).sendKeys("Project1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@id='projectPopup_commitBtn']")).click();
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='nameLabel']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//textarea[@class='textarea']")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//textarea[@class='textarea']")).sendKeys("modified project");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[1]")).click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void deleteProject()
	{
		
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='node projectNode selected']")).click();
		   Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteCustomer()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='icon']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='actionButton']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
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