package com.sk.testngassignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class HomeWork3{
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	public void launchBrowser()
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

	@Test(priority=2)
	public void navigate()
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

	@Test(priority=3,dataProvider="getLoginCredentials")
	public void login(String username,String password)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(username);
			oBrowser.findElement(By.name("pwd")).sendKeys(password);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=4)
	public void flyWindowMinimize()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	@Test(priority=5)
	public void createCustomer()
	{
		try
		{
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
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	@Test(priority=6)
	public void deleteCustomer()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='node customerNode selected']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='actionButton']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
		}
		catch(Exception e)
		{
			
		}
	}

	@Test(priority=7)
	public void logOut()
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

	@Test(priority=8)
	public void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getLoginCredentials()
	{
		return new Object[][]  {{"admin","manager"}}; //{"admin","manager"},{"admin","manager"}};
	}

}