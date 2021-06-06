package com.sk.assignment;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment3
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{

		lanchBrowser();
		navigate();
		login();
		minimizeFlywindow();
		createCustomer();
		//modifyUser();
		deleteCustomer(); 
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
	static void createCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer0");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Description about customer");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(1000);
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
	
	
	static void deleteCustomer() 
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
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
