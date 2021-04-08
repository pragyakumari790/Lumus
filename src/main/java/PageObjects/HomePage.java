package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import ActionClass.ActionClass;
import BasePackage.BaseClass;

public class HomePage  extends BaseClass
{
	@FindBy(xpath="//input[@id='searchinput']")
	WebElement ser;
	@FindBy(xpath="//header/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/button[1]/i[1]")
	WebElement serc;//click search buttons
	@FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement FloorLa;
	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='main']/div[2]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement Lam;
	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='main']/div[2]/div[2]/div[5]/div[2]/div[7]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement Indus;
	@FindBy(xpath="//header/div[2]/div[4]/ul[1]/li[2]/div[1]")
	WebElement Account;
	
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	WebElement Signout;
	
	public HomePage () 
	{
		PageFactory.initElements(driver, this);
	}
	public LightPage Search(String srch) {
		ActionClass.findelement(driver, ser);
		ActionClass.type(ser, srch);
		ActionClass.click(driver, serc);
		return new LightPage();
	}
	public LightPage Products() {
		ActionClass.click(driver, FloorLa);
		return null;
		
	}
	public LightPage Product() {
		ActionClass.click(driver, Lam);
		return null;
	}
	public void logoff() {
		ActionClass.click(driver, Signout);
	}

}
