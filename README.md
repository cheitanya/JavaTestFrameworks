#JavaTestFrameworks
//Setup new user on Mac machines (For volunteers)
//> Create new user on your Mac machine with the name ‘VodQA’
//Add a user
//In Users & Groups preferences, click Add (+) below the list of users.
//Choose the type of user you want to create from the New Account pop-up menu.
//Be sure you know the different user types before you choose. For descriptions, see:
//Type a full name for the new user. An account name is generated automatically. To use a different account name, enter it now—you can’t change it later.
//Enter a password for the user, then enter it again to verify. Using a password hint is recommended to help the user remember his or her password. (Recommended to keep it the same as password)
//Click Create User.
//
//> Set the password as ‘Vodqavodqa@1’ (We recommend to keep this as the password hint)
//
//Setup IDE and Project for Test Automation (For volunteers)
//
//> Download and Install “Community Edition” of intelliJ  (Make sure JAVA is installed)
//          https://www.jetbrains.com/idea/#chooseYourEdition
//> Download chromedriver for Chrome
//	https://sites.google.com/a/chromium.org/chromedriver/downloads
//
//Setup Application under Test (All volunteers need not do this step. We will setup the server in one machine and share the URL)
//
//> Download and install “Docker”
//	https://docs.docker.com/
//> Open Docker,  Make sure Docker is up and running
//> Open command line run below command;
//	docker run -p 3000:3000 -it rlister/spree
//> Once ‘spree app’ is pulled and running , Open the Browser
//> Open URL “http://localhost:3000”  . Make sure spree app is running.
//
//
//Following steps to be done by Participants
//
//> Open Intellij and choose create ‘New Project’ ->  Choose ‘Maven’
//> Enter <group_id> -> <artifact_id> and Next <project Name>
//
//> Expand the project and open pom.xml (choose option ‘Enable Auto Import’)
//> Enter below dependencies in the maven
//
//
//
//Instructions
//# Create a project
//   Create  a maven project with below dependencies
//<dependencies>
//   <dependency>
//       <groupId>org.seleniumhq.selenium</groupId>
//       <artifactId>selenium-java</artifactId>
//       <version>3.0.0</version>
//   </dependency>
//   <dependency>
//       <groupId>org.testng</groupId>
//       <artifactId>testng</artifactId>
//       <version>6.9.13.6</version>
//   </dependency>
//   <dependency>
//       <groupId>com.beust</groupId>
//       <artifactId>jcommander</artifactId>
//       <version>1.48</version>
//   </dependency>
//</dependencies>
//
//
//# Create Below Folder structure
//
//
//
//
//
//
//
//
//
//
//
//
//
//# Write TestNG Tests
//Login Tests
//@Test
//public void verifyValidLogintoSpree()
//{
//	// add code
//}
//
//@Test
//public void verifyInvalidLogintoSpree()
//{
////add code
//}
//
//
//# Create testng xml
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
//<suite name="Regression">
//   <test name="regression">
//       <classes>
//           <class name="login.LoginTest"/>
//           <class name="search.SearchProductsTest" />
//      </classes>
//   </test>
//</suite>
//
//
//# Execute Tests
//	java -cp <tests classes path>:<testng jar path>:<jcommander jar path>  org.testng.TestNG testng.xml
//
//
//#Tag tests and Set Priority
//Add it to xml
//<groups>
//   <run>
//       <include name="regression" />
//       <exclude name="sanity" />
//   </run>
//</groups>
//
//Add it to tests
//@Test(groups = {"smoke"}, priority = 2)
//
//
//# Set Before suite and After Suite
//@BeforeSuite
//public void verifyBeforeSuite()
//{
//   DriverManager manager = new DriverManager();
//}
//
//# Create Page Objects
//public class HomePage {
//   @FindBy(how= How.LINK_TEXT, using = "MY ACCOUNT")
//   WebElement my_account;
//   @FindBy(how= How.ID, using = "link-to-login")
//   WebElement login_link;
//   @FindBy(how= How.LINK_TEXT, using = "LOGOUT")
//   WebElement logout;
//   public void clickOnLoginLink()
//   {
//       login_link.click();}
//   public String getMyAccountText()
//   {
//       return  my_account.getText();}
//   public void clickLogOut() {
//       logout.click();  }
//}
//
//
//
//# Separate out Tests , Objects , and Implementation Flows
//Steps
//public String InvalidLogin(String userName, String password) {
//   HomePage homePage = PageFactory.initElements(DriverManager.driver, HomePage.class);
//   homePage.clickOnLoginLink();
//
//   LoginPage loginPage = PageFactory.initElements(DriverManager.driver, LoginPage.class);
//   loginPage.enterUsername(userName);
//   loginPage.enterPassword(password);
//   loginPage.clickSubmit();
//   return loginPage.getInvalidLoginText();}
//
//Test
//@Test
//public void verifyValidLogintoSpree()
//{
//   LoginSteps loginSteps = new LoginSteps();
//   String expected_message = loginSteps.Login("xt@xt.xom", "xtxtxt");
//   Assert.assertEquals(expected_message, "MY ACCOUNT");
//}
//
//# Parameterize Tests
//Add it to xml
//<parameter name="userName" value="xt@xt.xom"/>
//<parameter name="password" value="xtxtxt" />
//
//Add it to tests
//@Test
//@Parameters({"userName", "password"})
//public void verifyValidLogintoSpree(String userName, String password)
//
//# Data Providers
//@DataProvider(name = "login")
//public static Object[][] loginData() {
//   return new Object[][] {{"xt@xt.xom", "xtxtxt"}, {"xt@xt.xom", "xtxtxt"}};}
//
//@Test (dataProvider = "login")
//public void verifyValidLogintoSpreeWithDataProvider(String userName, String password)
//
//
//
