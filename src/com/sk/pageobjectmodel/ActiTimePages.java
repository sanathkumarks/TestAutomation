package com.sk.pageobjectmodel;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ActiTimePages {
		
		public ActiTimePages(WebDriver oBrowser)
		{
			PageFactory.initElements(oBrowser, this);
		}
		
		//Create WebElement for UserName text field
		@FindBy(xpath="//*[@id='username']")
		private WebElement username;
		public WebElement getUserName()
		{
			return username;
		}
		//*[@id="loginFormContainer"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input
		
		//Create WebElement for Password Text Field
		@FindBy(xpath="//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
		private WebElement pwd;
		
		public WebElement getPassword()
		{
			return pwd;
		}
		
		//Create WebElement for Login button
		@FindBy(xpath="//*[@id='loginButton']/div")
		private WebElement oBtnLogin;
		
		public WebElement getLoginButton()
		{
			return oBtnLogin;
		}
		
		//Create WebElement for FlyOutWindow 
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutWindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		
		//click on the user btn 
		 
		 @FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
		 private WebElement user;
		 public WebElement getUserss()
		 {
			 return user;
		 }
		 //click on adduser btn
		 @FindBy(xpath="//*[@id='createUserDiv']/div")
		 private WebElement adduser;
		 public WebElement getaddUser()
		 {
			 return adduser;
		 }
		 
		 //In create user FirstName 
		 //@FindBy(xpath="//*[@id='userDataLightBox_firstNameField']")
		 private WebElement userDataLightBox_firstNameField;
		 public WebElement getFirstName()
		 {
			 return userDataLightBox_firstNameField;
		 }
		//In create user lastName 
		 //@FindBy(xpath="//*[@id='userDataLightBox_lastNameField']")
		 private WebElement userDataLightBox_lastNameField;
		 public WebElement getLastName()
		 {
			 return userDataLightBox_lastNameField;
		 }
		//In create user email 
		 //@FindBy(xpath="//*[@id='userDataLightBox_emailField']")
		 private WebElement userDataLightBox_emailField;
		 public WebElement getEmailId()
		 {
			 return userDataLightBox_emailField;
		 }
		//In create user Login Details
		// @FindBy(xpath="//*[@id='userDataLightBox_usernameField']")
		 private WebElement userDataLightBox_usernameField;
		 public WebElement getLoginDetail()
		 {
			 return userDataLightBox_usernameField;
		 }
		//In create user Password
		 //@FindBy(xpath="//*[@id='userDataLightBox_passwordField']")
		 private WebElement userDataLightBox_passwordField;
		 public WebElement getPassword1()
		 {
			 return userDataLightBox_passwordField;
		 }
		 //Retype Password
		// @FindBy(xpath="//*[@id='userDataLightBox_passwordCopyField']")
		 private WebElement userDataLightBox_passwordCopyField;
		 public WebElement getConfirmePassword1()
		 {
			 return userDataLightBox_passwordCopyField;
		 }
		 //create user button
		// @FindBy(xpath="//*[@id='userDataLightBox_passwordCopyField']")
		 private WebElement userDataLightBox_commitBtn;
		 public WebElement getCreateUserBtn()
		 {
			 return userDataLightBox_commitBtn;
		 }
		
		
		 @FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
		 private WebElement clickuse;
		 public WebElement getClickUser()
		 {
			 return clickuse;
		 }
		 //*[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]/table
		 //click on username to delete the user1
		 @FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
		 private WebElement clickuser;
		 public WebElement getClickUser1()
		 {
			 return clickuser;
		 }
		 
		//click on username to delete the user2
		 @FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
		 private WebElement clickuser2;
		 public WebElement getClickUser2()
		 {
			 return clickuser2;
		 }
		
		//click on username to delete the user3
		 @FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
		 private WebElement clickuser3;
		 public WebElement getClickUser3()
		 {
			 return clickuser3;
		 }
		 
		 //Click Tasks bar
		 @FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[3]/a")
		 private WebElement clicktaskbar;
		 public WebElement getTaskBar()
		 {
			 return clicktaskbar;
		 }
		 
		 //Click AddNew button to create customer
		
		 @FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")
		 private WebElement clickAddnewCustomer;
		 public WebElement getAddnewBtn()
		 {
			 return clickAddnewCustomer;
		 }
		 
		 //click New Customer button
		 
		 @FindBy(xpath="/html/body/div[14]/div[1]")
		 private WebElement clicknewcustomer;
		 public WebElement getNewCustomer()
		 {
			 return clicknewcustomer;
		 }
		 
		 //Enter Customer name
		 private WebElement customerLightBox_nameField;
		 public WebElement getCustomerNameFeild()
		 {
			 return customerLightBox_nameField;
		 }
		 
		 //enter customer description 
		 
		 private WebElement customerLightBox_descriptionField;
		 public WebElement getCustomerDecripstion()
		 {
			 return customerLightBox_descriptionField;
		 }
		 
		 //create customer btn
		
		 @FindBy(xpath="//*[@id='customerLightBox_commitBtn']/div")
		 private WebElement clickcreateCustomer;
		 public WebElement getCreateCustomerBtn()
		 {
			 return clickcreateCustomer;
		 }
		 
		 //delete customer click on customer name
		
		 @FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		 private WebElement clickonCustomer;
		 public WebElement getClickOnCustomer()
		 {
			 return clickonCustomer;
		 }
		 
		 // click on Action 
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")
		 private WebElement clickonAction;
		 public WebElement getClickOnActionBtn()
		 {
			 return clickonAction;
		 }
		 
		 //click on delete btn
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
		 private WebElement clickonDelete;
		 public WebElement getClickOnDeleteBtn()
		 {
			 return clickonDelete;
		 }
		 //click on delete permanently
		 					
		 private WebElement customerPanel_deleteConfirm_submitTitle;
		 public WebElement getClickPermentDeleteBtn()
		 {
			 return customerPanel_deleteConfirm_submitTitle;
		 }
		 
		 @FindBy(xpath="//*[@id='userDataLightBox_accountInformationSection']/div[2]")
		 private WebElement clickdeletebtn;
		 public WebElement getClickDeletebtn()
		 {
			 return clickdeletebtn;
		 }
		//*[@id="userDataLightBox_firstNameField"]
		 
		 //click on customer
		 @FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")
		 private WebElement clickoncst;
		 public WebElement getClickOnCustomerName()
		 {
			 return clickoncst;
		 }
		 
		 //modify the Customer
		
		 @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")
		 private WebElement clickoncstname;
		 public WebElement getClickCustomerName()
		 {
			 return clickoncstname;
		 }
		 @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
		 private WebElement cleartext;
		 public WebElement getModifyCustomerName()
		 {
			 return cleartext;
		 }
		 //modify customer description
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
		 private WebElement changecustmrdescription;
		 public WebElement getModifyCustomerDescription()
		 {
			 return changecustmrdescription;
		 }
		 
		 //save modification of customer
		
		 @FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
		 private WebElement savemodification;
		 public WebElement getSaveModifiedCustomer()
		 {
			 return savemodification;
		 }
		 //click new Project btn
		 
		 @FindBy(xpath="/html/body/div[14]/div[2]")
		 private WebElement clicknewproject;
		 public WebElement getClickNewProjectBtn()
		 {
			 return clicknewproject;
		 }
		 
		 //enter project name
		 
		 private WebElement projectPopup_projectNameField;
		 public WebElement getEnterProjectName()
		 {
			 return projectPopup_projectNameField;
		 }
		 
		 //enter project description
		
		 private WebElement projectPopup_projectDescriptionField;
		 public WebElement getEnterProjectDecription()
		 {
			 return projectPopup_projectDescriptionField;
		 }
		 
		 //click create project btn
		 
		 private WebElement projectPopup_commitBtn;
		 public WebElement getClickCreateProjectBtn()
		 {
			 return projectPopup_commitBtn;
		 }
		 
		 //click on project
		 @FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")
		 private WebElement clickproject;
		 public WebElement getClickOnProject()
		 {
			 return clickproject;
		 }
		 
		 //click setting btn in project
		
		 @FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		 private WebElement clickprojectsetting;
		 public WebElement getClickProjectStng()
		 {
			 return clickprojectsetting;
		 }
		 
		 //click action btn in project
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")
		 private WebElement clickaction;
		 public WebElement getClickActionBtnInProject()
		 {
			 return clickaction;
		 }
		 
		 //click delete btn in project
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
		 private WebElement clickDeletebtn;
		 public WebElement getClickDeleteBtnInProject()
		 {
			 return clickDeletebtn;
		 }
		 
		 //click on permanently delete btn
		 
		 private WebElement projectPanel_deleteConfirm_submitTitle;
		 public WebElement getClickPermanentDeleteBtnInProject()
		 {
			 return projectPanel_deleteConfirm_submitTitle;
		 }
		 
		 //click on project name modification bar
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
		 private WebElement clickonprojectname;
		 public WebElement getClickTextAreaBtnInProject()
		 {
			 return clickonprojectname;
		 }
		 
		 //modify project name
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
		 private WebElement modifyprojectname;
		 public WebElement getModifyProjectName()
		 {
			 return modifyprojectname;
		 }
		 
		 //modify project description
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
		 private WebElement modifyprojectdescription;
		 public WebElement getModifyProjectDescription()
		 {
			 return modifyprojectdescription;
		 }
		 
		 //save project modification
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
		 private WebElement saveModification;
		 public WebElement getSaveModifiedProject()
		 {
			 return saveModification;
		 }
		 
		 //click on AddnewTask
		

		 @FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div")
		 private WebElement clickaddnewtask;
		 public WebElement getClickAddNewTask()
		 {
			 return clickaddnewtask;
		 }
		 
		 //click create new task
		 
		@FindBy(xpath="/html/body/div[13]/div[1]")
		 private WebElement createnewtask;
		 public WebElement getCreateNewTask()
		 {
			 return createnewtask;
		 }
		//enter task name
		
		 @FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")
		 private WebElement entertaskname;
		 public WebElement getEnterTaskName()
		 {
			 return entertaskname;
		 }
				 
		 //Create Tasks
		 
		 private WebElement createTasksPopup_commitBtn;
		 public WebElement getCreateTask()
		 {
			 return createTasksPopup_commitBtn;
		 }
		 
		 //for deleting task click on task name
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div")
		 private WebElement clickontaskname;
		 public WebElement getClickOnTaskName()
		 {
			 return clickontaskname;
		 }
		 
		 //click on action btn
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div")
		 private WebElement actionButton;
		 public WebElement getBtnaction()
		 {
			 return actionButton;
		 }
		 
		 //click delete task btn
		
		 @FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")
		 private WebElement clickdeletebtns;
		 public WebElement getClickDeleteBtn()
		 {
			 return clickdeletebtns;
		 }
		 
		 //click permanently delete btn
		 
		 private WebElement taskPanel_deleteConfirm_submitBtn;
		 public WebElement getClicKDeleteBtn()
		 {
			 return taskPanel_deleteConfirm_submitBtn;
		 }
		 
		 //click welcome window
		
		 @FindBy(xpath="//*[@id='welcomeScreenBoxId']/div[3]/div")
		 private WebElement startExploringLinkq;
		 public WebElement getClickWelcomeWindowBtn()
		 {
			 return startExploringLinkq;
		 }
		//Create WebElement for Logout Link
		@FindBy(linkText="Logout")
		private WebElement oLnkLogout;
		public WebElement getLogoutLink()
		{
			return oLnkLogout;
		}
		
		
		

	}


