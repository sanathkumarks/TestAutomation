package com.sk.testngassignment;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeWork2 {
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
	public void createUser()
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
	
	@Test(priority=6)
	public void modifyUser()
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
	
	
	@Test (priority=7)
	public void deleteUser()
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
	
	@Test(priority=8)
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
	
	@Test(priority=9)
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