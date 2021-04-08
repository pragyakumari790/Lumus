package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageObjects.HomePage;
import PageObjects.IndexPage;
import PageObjects.LoginPage;

public class LumenTest extends BaseClass {
	IndexPage index ;
	LoginPage login;
	HomePage home;
			
	
  @Test(enabled = true)
  public void Login() throws InterruptedException {
	  index.clickOnCrossIcon();
	  index.ClickAccount();
	  index.CreAcc();
	  home =login.AccountCreate(
			  prop.getProperty("FirstName"),prop.getProperty("LastName"),
			  prop.getProperty("usrName"),prop.getProperty("Pwd"));
	 
  }
  @BeforeMethod
  public void setup() {
	  launchApp();
	  if(index == null) {
		  index = new IndexPage();
		  
	  }
	  if (login == null) {
		  login = new LoginPage();
	  }
	  if(home == null) {
		  home = new HomePage();
	  }
  }

  
}
