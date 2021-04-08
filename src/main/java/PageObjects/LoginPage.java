package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ActionClass.ActionClass;
import BasePackage.BaseClass;

public class LoginPage extends BaseClass {
	/*
	 * // @FindBy(xpath="//button[@id='createAccountBtn']") // WebElement
	 * CreateAccount;
	 */
	@FindBy(xpath = "//header/div[2]/div[4]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]")
	WebElement FirstUsername;
	@FindBy(xpath= "//header/div[2]/div[4]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]")
	WebElement LastUserName;
	@FindBy(xpath ="//input[@id='dwfrm_profile_customer_email']")
	WebElement Email;
	@FindBy(xpath= "//input[@id='dwfrm_profile_customer_emailconfirm']")
	WebElement Nemail;
	
	@FindBy(xpath="//input[@id='dwfrm_profile_login_password']")
	WebElement pswd;
	
	@FindBy(xpath="//input[@id='dwfrm_profile_login_passwordconfirm']")
	WebElement cpswd;
	
	@FindBy(xpath="//button[@name='dwfrm_profile_confirm']")
	WebElement SignUpCreateAccount;

	public HomePage AccountCreate( String FirstName, String LastName,String usrName, String pwd) throws InterruptedException {
		/*
		 * driver.switchTo().alert(); ActionClass.findelement(driver, CreateAccount);
		 * ActionClass.click(driver, CreateAccount);
		 */
	    
		ActionClass.findelement(driver, FirstUsername);
		ActionClass.type(FirstUsername, FirstName);
		ActionClass.findelement(driver, LastUserName);
		ActionClass.type(LastUserName, LastName);
		ActionClass.findelement(driver, Email);
		ActionClass.type(Email, usrName);
		ActionClass.findelement(driver, Nemail);
		ActionClass.type(Nemail, usrName);
		ActionClass.findelement(driver, pswd);
		ActionClass.type(pswd, pwd);
		ActionClass.findelement(driver, cpswd);
		ActionClass.type(cpswd, pwd);
		SignUpCreateAccount.click();
		return new HomePage();
		
	}
	
	    
	}
