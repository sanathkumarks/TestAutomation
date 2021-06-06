package com.sk.log4jassignment;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeWork4 {
	public static Logger log=Logger.getLogger("Output for fourth HomeWork");
		public static WebDriver oBrowser=null;
		@Test(priority=1)
		static void LaunchBrowser()
		{
			try
			{
				log.info("The Execution of fourth HomeWork Starts Here!!!!!");
				System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new FirefoxDriver();
				oBrowser.manage().window().maximize();
				log.info("Browser Opened SuccessFully");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=2)
		static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost/login.do");
				Thread.sleep(2000);
				log.info("Navigated SuccessFully");
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
				oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
				log.info("Username Entered SuccessFully");
				oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("manager");
				log.info("Password Entered SuccessFully");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[starts-with(text(),'Log')]")).click();
				Thread.sleep(2000);
				log.info("Login SuccessFully");
				oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
				log.info("PopUpWindow closed SuccessFully");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=4)
		static void CreateCustomer() {
			try {
				oBrowser.findElement(By.xpath("//*[@class='content tasks']")).click();
				oBrowser.findElement(By.xpath("//*[@class='downIcon']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@class='item createNewCustomer ellipsis']")).click();
				oBrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("Customer1");
				log.info("Customer name entered SuccessFully");
				oBrowser.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys("Customer discription");
				log.info("Discription entered SuccessFully");
				oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']")).click();
				Thread.sleep(1000);
				log.info("Customer Created SuccessFully");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=5)
		static void ModifyCustomer() {
			try {
				oBrowser.findElement(By.xpath("//*[@class='editButton available']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@class='descriptionInput']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@class='textarea']")).clear();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@class='textarea']")).sendKeys("Modified discription");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@class='editButton available']")).click();
				log.info("Customer Modified SuccessFully");
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=6)
		static void DeleteCustomer()
		{
			try {
				oBrowser.findElement(By.xpath("//*[@class='editButton available']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@class='action']")).click();
				oBrowser.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
				oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
				log.info("Customer deleted SuccessFully");
				Thread.sleep(1000);		
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=7)
		static void logout() {
			try {
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				log.info("Customer logot SuccessFully");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=8)
		static void closeApplication()
		{
			try
			{
				oBrowser.close();
				log.info("Application Closed SuccessFully");
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		@DataProvider
		public Object[][] getLoginCredentials()
		{
			return new Object[][]  {{"admin","manager"}};
		}

	}
