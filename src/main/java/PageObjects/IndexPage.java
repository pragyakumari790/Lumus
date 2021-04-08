package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionClass.ActionClass;
import BasePackage.BaseClass;

public class IndexPage extends BaseClass {
	@FindBy(xpath = "//header/div[2]/div[4]/ul[1]/li[2]/div[1]")
	WebElement AccountLumen;
	@FindBy(xpath = "//header/div[2]/div[4]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]")
	WebElement Signin;
	@FindBy(xpath="//button[@id='createAccountBtn']")
	WebElement FirstCreateAccount;
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	public LoginPage ClickAccount() {
		
		ActionClass.click(driver, AccountLumen);
		ActionClass.click(driver, Signin);
		return new LoginPage();
	}
	public  IndexPage clickOnCrossIcon() {
	    WebElement crs    =driver.findElement(By.xpath("//div[@id='ltkpopup-close-button']"));
	        Actions act = new Actions(driver);
	        act.moveToElement(crs).build().perform();
	        act.click(crs).build().perform();
	        return new IndexPage();
	       
	    }
	public LoginPage CreAcc() {
//		driver.switchTo().alert();
		ActionClass.findelement(driver, FirstCreateAccount);
	    ActionClass.click(driver, FirstCreateAccount);
	    return  new LoginPage(); }
	
	

}
