package PageObjects;

import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class LightPage extends BaseClass{
	public LightPage() 
	{
		PageFactory.initElements(driver, this);
	}
}
