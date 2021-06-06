package com.sk.pageobjectassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sk.pageobjectmodel.ActiTimePages;

public class HomeWork9 {
		public static WebDriver oBrowser=null;
		public static ActiTimePages oPage=null;
		public static void main(String[] args) {
//LaunchBrowser-->/ navigate --> /login as admin -->/ create user1 -->/ logout -->/ login as user1 -->/ create user2 --> /
//logout -->/ login as user2 -->/ create user3 -->/ logout-->/login as admin -->/ modify user1 -->/ logout -->/ login as user1 -->/ 
//modify user2 -->/ logout -->/login as user2 -->/ modify user3 --> /logout -->/login as user2 --> /delete user3 -->/ logout -->/ login as user1 --> 
//delete user2 --> /logout --> /login as admin --> /delete user1 --> /logout --> /close application
			launchBrowser();
			navigate();
			loginAsAdmin();
			flyOutWindow();
			createUser1();
			logout();
			
			loginUser1();
			createUser2();
			logoutuser1();
			
			loginUser2();
			createUser3();
			logoutuser2();
			
			loginAsAdmin();
			modifyUser1();
			logout();
			
			loginModifiedUser1();
			modifyUser2();
			logoutuser1();
			
			loginModifiedUser2();
			modifyUser3();
			logoutuser2();
			
			loginModifiedUser2();
			deleteUser3();
			logoutuser2();
			
			loginModifiedUser1();
			deleteUser2();
			logoutuser1();
			
			loginAsAdmin();
			deleteUser1();
			logout();
			
			//loginUser3();
			//logoutuser3();
			//loginAsAdmin();
			
			
		
			logout();
			closeApplication();
		}
		
		static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();
				oPage=new ActiTimePages(oBrowser);
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
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void loginAsAdmin()
		{
			try
			{
				oPage.getUserName().sendKeys("admin");
				oPage.getPassword().sendKeys("manager");
				oPage.getLoginButton().click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void flyOutWindow()
		{
			try
			{
				oPage.getFlyOutWindow().click();
				Thread.sleep(1000);
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
				oPage.getUserss().click();
				//Thread.sleep(1000);
				oPage.getaddUser().click();
				//Thread.sleep(1000);
				oPage.getFirstName().sendKeys("jhone");
				Thread.sleep(1000);
				oPage.getLastName().sendKeys("d");
				Thread.sleep(1000);
				oPage.getEmailId().clear();
				oPage.getEmailId().sendKeys("jhoneaaa@gmail.com");
				Thread.sleep(1000);
				oPage.getLoginDetail().clear();
				oPage.getLoginDetail().sendKeys("user1");
				Thread.sleep(1000);
				oPage.getPassword1().clear();
				oPage.getPassword1().sendKeys("user1");
				Thread.sleep(1000);
				oPage.getConfirmePassword1().clear();
				oPage.getConfirmePassword1().sendKeys("user1");
				Thread.sleep(1000);
				oPage.getCreateUserBtn().click();
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
				Thread.sleep(1000);
				oPage.getUserss().click();
				Thread.sleep(1000);
				oPage.getaddUser().click();
				Thread.sleep(1000);
				oPage.getFirstName().sendKeys("Smitt");
				Thread.sleep(1000);
				oPage.getLastName().sendKeys("e");
				Thread.sleep(1000);
				oPage.getEmailId().sendKeys("smitt@gmail.com");
				Thread.sleep(1000);
				oPage.getLoginDetail().clear();
				oPage.getLoginDetail().sendKeys("user2");
				Thread.sleep(1000);
				oPage.getPassword1().clear();
				oPage.getPassword1().sendKeys("user2");
				Thread.sleep(1000);
				oPage.getConfirmePassword1().clear();
				oPage.getConfirmePassword1().sendKeys("user2");
				oPage.getCreateUserBtn().click();
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
				Thread.sleep(1000);
				oPage.getUserss().click();
				Thread.sleep(1000);
				oPage.getaddUser().click();
				Thread.sleep(1000);
				oPage.getFirstName().sendKeys("scott");
				Thread.sleep(1000);
				oPage.getLastName().sendKeys("f");
				Thread.sleep(1000);
				oPage.getEmailId().sendKeys("scott@gmail.com");
				Thread.sleep(1000);
				oPage.getLoginDetail().clear();
				oPage.getLoginDetail().sendKeys("user3");
				
				oPage.getPassword1().clear();
				oPage.getPassword1().sendKeys("user3");
				
				oPage.getConfirmePassword1().clear();
				oPage.getConfirmePassword1().sendKeys("user3");
				oPage.getCreateUserBtn().click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void loginUser1()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getUserName().sendKeys("user1");
				//Thread.sleep(1000);
				oPage.getPassword().sendKeys("user1");
				Thread.sleep(1000);
				oPage.getLoginButton().click();
				Thread.sleep(1000);
				oPage.getClickWelcomeWindowBtn().click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void loginUser2()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getUserName().sendKeys("user2");
				//Thread.sleep(1000);
				oPage.getPassword().sendKeys("user2");
				Thread.sleep(1000);
				oPage.getLoginButton().click();
				Thread.sleep(1000);
				oPage.getClickWelcomeWindowBtn().click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void loginUser3()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getUserName().sendKeys("user3");
				//Thread.sleep(1000);
				oPage.getPassword().sendKeys("user3");
				Thread.sleep(1000);
				oPage.getLoginButton().click();
				//Thread.sleep(1000);
				oPage.getClickWelcomeWindowBtn().click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void modifyUser1()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getUserss().click();
				oPage.getClickUser1().click();
				Thread.sleep(1000);
				oPage.getFirstName().clear();
				oPage.getFirstName().sendKeys("Robert");
				oPage.getLastName().clear();
				oPage.getLastName().sendKeys("a");
				oPage.getEmailId().clear();
				oPage.getEmailId().sendKeys("robert@gamil.com");
				oPage.getLoginDetail().clear();
				oPage.getLoginDetail().sendKeys("USER1");
				oPage.getPassword1().clear();
				oPage.getPassword1().sendKeys("USER1");
				oPage.getConfirmePassword1().clear();
				oPage.getConfirmePassword1().sendKeys("USER1");
				oPage.getCreateUserBtn().click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void modifyUser2()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getUserss().click();
				oPage.getClickUser2().click();
				Thread.sleep(1000);
				oPage.getFirstName().clear();
				oPage.getFirstName().sendKeys("Karthi");
				oPage.getLastName().clear();
				oPage.getLastName().sendKeys("b");
				oPage.getEmailId().clear();
				oPage.getEmailId().sendKeys("Karthi@gamil.com");
				oPage.getLoginDetail().clear();
				oPage.getLoginDetail().sendKeys("USER2");
				oPage.getPassword1().clear();
				oPage.getPassword1().sendKeys("USER2");
				oPage.getConfirmePassword1().clear();
				oPage.getConfirmePassword1().sendKeys("USER2");
				oPage.getCreateUserBtn().click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void modifyUser3()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getUserss().click();
				oPage.getClickUser3().click();
				Thread.sleep(1000);
				oPage.getFirstName().clear();
				oPage.getFirstName().sendKeys("Uday");
				oPage.getLastName().clear();
				oPage.getLastName().sendKeys("c");
				oPage.getEmailId().clear();
				oPage.getEmailId().sendKeys("Uday@gamil.com");
				oPage.getLoginDetail().clear();
				oPage.getLoginDetail().sendKeys("USER3");
				oPage.getPassword1().clear();
				oPage.getPassword1().sendKeys("USER3");
				oPage.getConfirmePassword1().clear();
				oPage.getConfirmePassword1().sendKeys("USER3");
				oPage.getCreateUserBtn().click();
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
				//Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
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
				e.printStackTrace();
			}
		}
		static void deleteUser2()
		{
			try
			{
				//Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
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
				e.printStackTrace();
			}
		}
		static void deleteUser3()
		{
			try
			{
				//Thread.sleep(1000);userInOtherProduct
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
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
				e.printStackTrace();
			}
		}
		static void logout()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getLogoutLink().click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void logoutuser1()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getLogoutLink().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void logoutuser2()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getLogoutLink().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void logoutuser3()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getLogoutLink().click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void loginModifiedUser1()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getUserName().sendKeys("USER1");
				//Thread.sleep(1000);
				oPage.getPassword().sendKeys("USER1");
				Thread.sleep(1000);
				oPage.getLoginButton().click();
				Thread.sleep(1000);
				oPage.getClickWelcomeWindowBtn().click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void loginModifiedUser2()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getUserName().sendKeys("USER2");
				//Thread.sleep(1000);
				oPage.getPassword().sendKeys("USER2");
				Thread.sleep(1000);
				oPage.getLoginButton().click();
				Thread.sleep(1000);
				oPage.getClickWelcomeWindowBtn().click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void loginModifiedUser3()
		{
			try
			{
				Thread.sleep(1000);
				oPage.getUserName().sendKeys("USER3");
				//Thread.sleep(1000);
				oPage.getPassword().sendKeys("USER3");
				Thread.sleep(1000);
				oPage.getLoginButton().click();
				//Thread.sleep(1000);
				oPage.getClickWelcomeWindowBtn().click();
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
}
