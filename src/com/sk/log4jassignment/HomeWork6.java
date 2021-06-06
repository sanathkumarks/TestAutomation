package com.sk.log4jassignment;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class HomeWork6{
	public static Logger log=Logger.getLogger("OutPut for HomeWork6");
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			log.info("The Execution of Sixth HomeWork Starts Here!!!!!");
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			log.info("browser launched successfully");
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
			log.info("successfully navigated");
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
			log.info("user name entered");
			oBrowser.findElement(By.name("pwd")).sendKeys(password);
			log.info("password entered");
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
			log.info("fly window minimized successfully");
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
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@class='content tasks']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='addNewButton']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Customer");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//textarea[@id='customerLightBox_descriptionField']")).sendKeys("Description about customer");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			log.info("customer created successfully");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void createProject()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='addNewButton']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("Project1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//textarea[@id='projectPopup_projectDescriptionField']")).sendKeys("Project1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[@id='projectPopup_commitBtn']")).click();
			log.info("project created successfully");
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void modifyProject()
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
			log.info("project modified successfully");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	public void deleteProject()
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
			log.info("project deleted successfully");
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void deleteCustomer()
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
			log.info("customer deleted successfully");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
	}

	@Test(priority=10)
	public void logOut()
	{
		try
		{

			oBrowser.findElement(By.linkText("Logout")).click();
			log.info("logout successfull");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=11)
	public void closeApplication()
	{
		try
		{
			oBrowser.close();
			log.info("application closed successfully");
			log.info("The Execution of Sixth HomeWork ends Here!!!!!");
			log.info("------------------------------------------------");
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