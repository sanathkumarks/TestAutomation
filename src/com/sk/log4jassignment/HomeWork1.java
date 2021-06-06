package com.sk.log4jassignment;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeWork1 {
	public static Logger log=Logger.getLogger("Home Work1");
	public static WebDriver oBrowser=null;
		@Test(priority=1)
		static void LaunchBrowser()
		{
			try
			{
				log.info("The Execution Program Starts Here!!!!!");
				System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				log.info("WebBrowser opens Successfully!!!!!");
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();
				log.info("Successfully maximized!!!!!!!!!!");
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
				log.info("login page navigated Successfully!!!!!");
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
				oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
				log.info("user name entered  Successfully!!!!!");
				oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys(password);
				Thread.sleep(2000);
				log.info("Password entered  Successfully!!!!!");
				oBrowser.findElement(By.xpath("//div[starts-with(text(),'Log')]")).click();
				Thread.sleep(2000);
				log.info("Login Button entered  Successfully!!!!!");
				oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
				log.info("popup window closed Successfully!!!!!");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=4)
		static void CreateUser() {
			try {
				oBrowser.findElement(By.xpath("//*[@class='content users']")).click();
				log.info("UserButton Clicked Successfully!!!!!");
				oBrowser.findElement(By.xpath("//*[@class='buttonText']")).click();
				oBrowser.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Akash");
				log.info("firstname entered Successfully!!!!!");
				oBrowser.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Kalkura");
				log.info("lastname entered Successfully!!!!!");
				oBrowser.findElement(By.xpath("//*[@name='email']")).sendKeys("akash@gmail.com");
				log.info("email entered Successfully!!!!!");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='username']")).sendKeys("akash");
				log.info("Usernsme entered Successfully!!!!!");
				oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("akash");
				log.info("password entered Successfully!!!!!");
				oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("akash");
				log.info("passwordCopy enterd sucessfully!!!!!");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@class='buttonTitle']")).click();
				log.info("UserCreated Successfully!!!!!");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=5)
		static void DeleteUser() {
			try {
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@class='groupName']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@class='deleteContainer']")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				log.info("Delete User Successfully!!!!!");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=6)
		static void logout() {
			try {
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				log.info("Logout Successfully!!!!!");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		@Test(priority=7)
		static void closeApplication()
		{
			try
			{

				oBrowser.close();
				log.info("Closed Application Successfully!!!!!");
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

