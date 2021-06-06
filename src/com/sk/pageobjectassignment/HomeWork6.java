package com.sk.pageobjectassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sk.pageobjectmodel.ActiTimePages;

public class HomeWork6 
{
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args)
	{
		
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
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
	static void login()
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
	static void createCustomer()
	{
		try
		{
			Thread.sleep(1000);
			oPage.getTaskBar().click();
			Thread.sleep(1000);
			oPage.getAddnewBtn().click();
			Thread.sleep(1000);
			oPage.getNewCustomer().click();
			Thread.sleep(1000);
			oPage.getCustomerNameFeild().sendKeys("Customer0");
			Thread.sleep(1000);
			oPage.getCustomerDecripstion().sendKeys("Details about customer");
			Thread.sleep(1000);
			oPage.getCreateCustomerBtn().click();
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
			oPage.getClickOnCustomerName().click();
			Thread.sleep(1000);
			oPage.getAddnewBtn().click();
			Thread.sleep(1000);
			oPage.getClickNewProjectBtn().click();
			Thread.sleep(1000);
			oPage.getEnterProjectName().sendKeys("Project1");
			Thread.sleep(1000);
			oPage.getEnterProjectDecription().sendKeys("description about project");
			Thread.sleep(1000);
			oPage.getClickCreateProjectBtn().click();
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
			oPage.getClickOnProject().click();
			Thread.sleep(1000);
			oPage.getClickProjectStng().click();
			Thread.sleep(1000);
			oPage.getClickActionBtnInProject().click();
			Thread.sleep(1000);
			oPage.getClickDeleteBtnInProject().click();
			Thread.sleep(1000);
			oPage.getClickPermanentDeleteBtnInProject().click();
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
			oPage.getClickOnCustomer().click();
			Thread.sleep(1000);
			oPage.getClickOnActionBtn().click();
			Thread.sleep(1000);
			oPage.getClickOnDeleteBtn().click();
			Thread.sleep(1000);
			oPage.getClickPermentDeleteBtn().click();
			Thread.sleep(1000);
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
			oPage.getClickOnProject().click();
			Thread.sleep(1000);
			oPage.getClickProjectStng().click();
			Thread.sleep(1000);
			oPage.getClickTextAreaBtnInProject().click();
			Thread.sleep(1000);
			oPage.getModifyProjectName().clear();
			Thread.sleep(1000);
			oPage.getModifyProjectName().sendKeys("PROJECT1");
			Thread.sleep(1000);
			oPage.getModifyProjectDescription().clear();
			Thread.sleep(1000);
			oPage.getModifyProjectDescription().sendKeys("modified project description");
			Thread.sleep(1000);
			oPage.getSaveModifiedProject().click();
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
			oPage.getLogoutLink().click();
			Thread.sleep(1000);
		}catch(Exception e)
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

