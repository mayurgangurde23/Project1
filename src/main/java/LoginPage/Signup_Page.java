package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_Page {

	@FindBy(xpath="//input[@type='text']")private WebElement Name;
	@FindBy(xpath="//input[@type='email']")private WebElement Email;
	@FindBy(xpath="//input[@type='number']")private WebElement MobileNumber;	
	@FindBy(xpath="//input[@type='password']")private WebElement Password;
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")private WebElement Checkbox1;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")private WebElement Checkbox2;
	@FindBy(id = "mui-10")private WebElement RequestOTP;


	public Signup_Page(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);
	}
	public void Entername(String name)
	{
		Name.sendKeys(name);
		}
	public void Enteremail(String email)
	{
		Email.sendKeys(email);	
	}
	public void Enternumber(String number) {
		MobileNumber.sendKeys(number);
	}
	public void Enterpassword(String  password)
	{
		Password.sendKeys(password);
		}
	public void ClickOncheckbox1()
	{
		Checkbox1.click();
	}
	public void ClickOnCheckbox2()
	{
		Checkbox2.click();
	}
	
	public void Clickonrequestotpbutton() {
		RequestOTP.click();
	}

}