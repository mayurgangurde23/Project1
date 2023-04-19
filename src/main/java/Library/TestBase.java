package Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	public void Initialisebrowser() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayurgangurde23\\eclipse-workspace\\Jarvis__\\Browser\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://35.154.154.159:3003/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()=' Sign up']")).click();
		Thread.sleep(3000);
	
	}
}
