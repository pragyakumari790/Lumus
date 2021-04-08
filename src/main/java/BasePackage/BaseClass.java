package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	@BeforeTest
	public void loadConfig() throws IOException {
		 try 
		 {
		prop = new Properties();
		System.out.println("super constructor invoked");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\Configuration\\config.properties");
		prop.load(fis);
		} 
		 catch (FileNotFoundException e) 
		 {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browserName");
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("urlLumen"));
	}

}
