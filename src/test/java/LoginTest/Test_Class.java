package LoginTest;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Library.TestBase;
import Library.UtilityClass;
import LoginPage.Dashboard;
import LoginPage.OTPVerification;

import LoginPage.Signup_Page;

public class Test_Class extends TestBase{
	
	Signup_Page s1;
	OTPVerification v1;
	Dashboard L1;
	
	@BeforeClass
	public void openbrowser() throws InterruptedException
	{
		Initialisebrowser();
		s1=new Signup_Page(driver);
		v1=new OTPVerification(driver);
		L1=new Dashboard(driver);
		
	}
	
	@Test(priority = 1)
	public void VerifySignUpFunctionality() throws Exception
	{
		s1.Entername(UtilityClass.getDatafromPropertyFile("Name"));
		s1.Enteremail(UtilityClass.getDatafromPropertyFile("Email"));
		s1.Enternumber(UtilityClass.getDatafromPropertyFile("MobileNumber"));
		s1.Enterpassword(UtilityClass.getDatafromPropertyFile("Password"));
		s1.ClickOncheckbox1();
		Thread.sleep(2000);
		s1.ClickOnCheckbox2();
		Thread.sleep(2000);
		s1.Clickonrequestotpbutton();
		v1.EnteremailOtp(); 
		Thread.sleep(4000);
		v1.EnterMobileOTP();
		Thread.sleep(2000);
		v1.ClickonSignUp();
	}
	
	@Test(priority = 2)
	public void ClickOnStartInvesting() throws InterruptedException
	{
		L1.ClickOnStartInvesting();
		Thread.sleep(2000);
	}	
	
	@Test(priority = 3)
	public void SelectQuestions() throws InterruptedException
	{
	L1.SelectQuestions();
	Thread.sleep(7000);
	}

	@Test(priority = 4)
	public void ChangeMyRiskProfile() throws InterruptedException 
	{
		L1.ClickonChangeRiskProfile();
	Thread.sleep(6000);
	}
	
	@Test(priority = 5)
	public void SelectRiskProfile() throws InterruptedException
	{
		L1.ClickOnModerate();
		Thread.sleep(3000);
	}
	
	@Test(priority = 6)
	public void ConfirmRiskProfile() throws InterruptedException
	{
	L1.clickonconfirm();
	Thread.sleep(2000);
	}
	
	@Test(priority = 7)
	public void EnterAmount() throws InterruptedException, IOException
	{
		WebElement amount = driver.findElement(By.xpath("//input[@type='number']"));
		Actions act=new Actions(driver);
		act.moveToElement(amount).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();	
		Thread.sleep(3000);
		L1.EnterAmount(UtilityClass.getDatafromPropertyFile("Amount"));
		Thread.sleep(3000);
	}
	
	@Test(priority = 8)
	public void SelectYear() throws InterruptedException
	{
		L1.Selectyear();
		Thread.sleep(6000);
	}
	
	@Test(priority = 9)
	public void SelectEquityStrategy() throws InterruptedException
	{
		L1.SelectStrategy();
		Thread.sleep(1000);
	}
	@Test(priority = 10)
	public void SelectCreateMyPortfolio() throws InterruptedException
	{
		L1.SelectPortFolio();
		Thread.sleep(10000);	
	}
	
	@Test(priority = 11)
	public void UnlockFullPortfolio() throws InterruptedException
	{
		L1.PortfolioCreation();
		Thread.sleep(4000);
	}
	
	@Test(priority = 12)
	public void ClickOnProcedtoPay() throws InterruptedException
	{
		L1.ProcedToPay();
		Thread.sleep(6000);
	}
	
	@Test(priority = 13)
	public void SelectPaymentMethodCard() throws InterruptedException
	{
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']")));
		Thread.sleep(3000);
		L1.selectpaymentption();
		Thread.sleep(7000);
	}
	
	@Test(priority = 14)
	public void VerifyCardNumber() throws IOException
	{
		L1.EnterCardnumber(UtilityClass.getDatafromPropertyFile("CardNumber"));
	}
	
	@Test(priority = 15)
	public void VerifyExpiryDate() throws IOException, InterruptedException
	{
		L1.EnterExpiry(UtilityClass.getDatafromPropertyFile("Expiry"));
		Thread.sleep(1000);
	}
	
	@Test(priority = 16)
	public void VerifyCVV() throws IOException, InterruptedException
	{
		L1.EnterCvv(UtilityClass.getDatafromPropertyFile("CVV"));
		Thread.sleep(6000);
	}
	
	@Test(priority = 17)
	public void ClickToPAY() throws InterruptedException
	{
		L1.ClickonPay();

	Thread.sleep(5000);
	}
	
	@Test(priority = 18)	
	public void SkipSavingCard() throws InterruptedException
	{
		L1.SkipSavingCard();
		Thread.sleep(5000);
	}
	
	@Test(priority = 19)
	public void ClickonSuccessButton() throws InterruptedException
	{
		Set<String> AllId = driver.getWindowHandles();
		String ChildId = driver.getWindowHandle();
		ArrayList<String> al = new ArrayList<String>(AllId);
		String ChildWindowID = al.get(1);
		driver.switchTo().window(ChildWindowID);
		Thread.sleep(2000);
		L1.ClickOnSuccess();
		Thread.sleep(10000);
		driver.switchTo().window(al.get(0));	
	}
	
	@Test(priority = 20)
	public void ClickOnViewPortFolio() throws InterruptedException
	{
		
		L1.ViewPortFolio();
		Thread.sleep(11000);
	}
	
	@Test (priority = 21)
	public void ClickonStartInvesting() throws InterruptedException
	{
	
		L1.ClickOnStartInvesting();
		Thread.sleep(000);
	}          
	
	@Test (priority = 22)
	public void VerifyPANNumber() throws IOException, InterruptedException
	{
		L1.Enterpannumber(UtilityClass.getDatafromPropertyFile("PanNumber"));
		Thread.sleep(5000);
	}
	
	@Test(priority = 23)
	public void VerifyDateOfBirth() throws IOException, InterruptedException
	{
		L1.EnterBirthDate(UtilityClass.getDatafromPropertyFile("DateOfBirth"));
		Thread.sleep(6000);
	}
	
	@Test(priority = 24)
	public void VerifySubmitForVerification() throws InterruptedException
	{
		L1.SubmitforVerification();
		Thread.sleep(4000);
	}
	
	@Test(priority = 25)
	public void VerifyProceedtoClientAgreement() throws InterruptedException
	{
		L1.ClickTOProceedAgreement();
		Thread.sleep(4000);
	}
	
	@Test(priority = 26)
	public void ClosedDigioWindow() throws InterruptedException
	{
		L1.ClickOnClose();
		Thread.sleep(10000);
		
	}
	
	@Test(priority = 27)
	public void ClickonStartInvesting2() throws InterruptedException
	{
		
		L1.StartInvesting2();
		Thread.sleep(12000);
	}
	
	@Test(priority = 28)
	public void SelectBroker() throws InterruptedException
	{
		L1.SelectBroker();
		Thread.sleep(8000);
	}
//	@Test(priority = 29)
//	public void LogintoYourBroker() throws InterruptedException
//	{
//		L1.ChooseBroker();
//		Thread.sleep(10000);
//	}
	@AfterClass
	public void AfterTest()
	{
 	driver.quit();
		
	}
	}
