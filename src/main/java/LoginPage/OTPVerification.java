package LoginPage;

import java.io.IOException;

import org.checkerframework.checker.interning.qual.FindDistinct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Library.UtilityClass;

public class OTPVerification {

	@FindBy(xpath ="(//input[@aria-label='Please enter verification code. Digit 1'])[1]")private WebElement EmailOTp;
	@FindBy(xpath = "(//input[@aria-label='Please enter verification code. Digit 1'])[1]")private WebElement MobileOtp;
	@FindBy(xpath = "//button[text()='SignUp']")private WebElement SignUp;
	//@FindBy(xpath ="")private WebElement MobileOTP;

	private UtilityClass util = new UtilityClass();

	public OTPVerification(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	public void EnteremailOtp() throws Exception 
	{
		EmailOTp.sendKeys(UtilityClass.GmailUtils());
	}
	public void EnterMobileOTP() throws IOException
	{
		MobileOtp.sendKeys(util.getDatafromPropertyFile("MobileOTP"));		
	}	
	public void ClickonSignUp()
	{
		SignUp.click();
	}
}
