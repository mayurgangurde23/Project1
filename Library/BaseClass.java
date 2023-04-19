package Library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	// Base class consist of Mandatory code that run everytime like open browser
	// Use extends keyword to inherited Base class
	//Declared Globally 

public WebDriver driver;

public void initializebrowser() throws IOException
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mayurgangurde23\\eclipse-workspace\\Jarvis__\\Browser\\chromedriver.exe");
	driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
}
}
