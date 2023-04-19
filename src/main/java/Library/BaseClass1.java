package Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {

public WebDriver driver;
public void Initialisebrowser()
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mayurgangurde23\\\\eclipse-workspace\\\\Jarvis__\\\\browsers\\\\chromedriver.exe");	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://35.154.154.159:3003/login");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
}
