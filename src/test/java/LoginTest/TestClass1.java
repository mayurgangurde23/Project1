 package LoginTest;


import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Library.BaseClass1;

import Library.UtilityClass;

import LoginPage.Dashboard;
public class TestClass1 extends BaseClass1 {
	Dashboard L1;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("report1.html");
	@BeforeSuite
	public void SetUp()
	{
		extent.attachReporter(spark);
		
	}
	@BeforeTest
	public void SetUpTest()
	{
		Initialisebrowser();
		L1=new Dashboard(driver);
	}
	@Test(priority = 1)
	public void VerifyLoginFunctionality() throws Exception
	{
		ExtentTest test = extent.createTest("VerifyLoginFunctionality").assignAuthor("Mayur");
		L1.EnterEmailID(UtilityClass.getDatafromPropertyFile("Email"));
		L1.EnterPassword(UtilityClass.getDatafromPropertyFile("Password"));
		L1.ClickonLoginButton();
		Thread.sleep(2000);
		System.out.println("Login Successful");
	}

	@Test(priority = 2)
	public void ClickOnStartInvesting() throws InterruptedException
	{
		ExtentTest test = extent.createTest("ClickOnStartInvesting");
		L1.ClickOnStartInvesting();
		Thread.sleep(2000);

	}	

	@Test(priority = 3)
	public void SelectQuestions() throws InterruptedException
	{
		ExtentTest test = extent.createTest("SelectQuestions");
		L1.SelectQuestions();
		Thread.sleep(6000);

	}
	//	@Test(priority = 4)
	//	public void SelectCheckBox() throws InterruptedException 
	//	{
	//		L1.ClickonCheckBox();
	//		Thread.sleep(3000);
	//	}

	@Test(priority = 4)
	public void ChangeMyRiskProfile() throws InterruptedException 
	{
		ExtentTest test = extent.createTest("ChangeMyRiskProfile");
		L1.ClickonChangeRiskProfile();
		Thread.sleep(4000);
	}

	@Test(priority = 5)
	public void SelectRiskProfile() throws InterruptedException
	{
		ExtentTest test = extent.createTest("SelectRiskProfile");
		L1.ClickOnModerate();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void ConfirmRiskProfile() throws InterruptedException
	{
		ExtentTest test = extent.createTest("ConfirmRiskProfile");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
		L1.clickonconfirm();
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void EnterAmount() throws InterruptedException, IOException
	{
		ExtentTest test = extent.createTest("EnterAmount");
		WebElement amount = driver.findElement(By.xpath("//input[@type='number']"));
		Actions act=new Actions(driver);
		act.moveToElement(amount).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();	
		Thread.sleep(3000);
		L1.EnterAmount(UtilityClass.getDatafromPropertyFile("Amount"));
		Thread.sleep(4000);
	}

	@Test(priority = 8)
	public void SelectYear() throws InterruptedException
	{
		ExtentTest test = extent.createTest("SelectYear");
		L1.Selectyear();
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void SelectEquityStrategy() throws InterruptedException
	{
		ExtentTest test = extent.createTest("SelectEquityStrategy");
		L1.SelectStrategy();
		Thread.sleep(1000);
	}
	@Test(priority = 10)
	public void SelectCreateMyPortfolio() throws InterruptedException
	{
		ExtentTest test = extent.createTest("SelectCreateMyPortfolio");
		L1.SelectPortFolio();
		Thread.sleep(10000);	
	}

	@Test(priority = 11)
	public void VerifyUnlockFullPortfolioutton() throws InterruptedException
	{
		ExtentTest test = extent.createTest("VerifyUnlockFullPortfolioutton");
		L1.PortfolioCreation();
		Thread.sleep(4000);
	}

	@Test(priority = 12)
	public void VerifyProcedtoPayButton() throws InterruptedException
	{
		ExtentTest test = extent.createTest("VerifyProcedtoPayButton");
		L1.ProcedToPay();
		Thread.sleep(8000);
	}
	//	@Test(priority =13)
	//	public void ClickOnQrCode() throws InterruptedException
	//	{
	//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']")));
	//		Thread.sleep(2000);
	//		L1.ClickonQR();
	//		Thread.sleep(10000);
	//	}

	@Test(priority = 13)
	public void SelectPaymentMethodCard() throws InterruptedException
	{
		ExtentTest test = extent.createTest("SelectPaymentMethodCard");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']")));
		Thread.sleep(3000);
		L1.selectpaymentption();
		Thread.sleep(8000);
	}

	@Test(priority = 14)
	public void VerifyCardNumber() throws IOException
	{
		ExtentTest test = extent.createTest("VerifyCardNumber");
		L1.EnterCardnumber(UtilityClass.getDatafromPropertyFile("CardNumber"));
	}

	@Test(priority = 15)
	public void VerifyExpiryDate() throws IOException, InterruptedException
	{
		ExtentTest test = extent.createTest("VerifyExpiryDate");
		L1.EnterExpiry(UtilityClass.getDatafromPropertyFile("Expiry"));
		Thread.sleep(1000);
	}

	@Test(priority = 16)
	public void VerifyCVV() throws IOException, InterruptedException
	{
		ExtentTest test = extent.createTest("VerifyCVV");
		L1.EnterCvv(UtilityClass.getDatafromPropertyFile("CVV"));
		Thread.sleep(6000);
	}

	@Test(priority = 17)
	public void ClickToPAYButton() throws InterruptedException
	{
		ExtentTest test = extent.createTest("ClickToPAYButton");
		L1.ClickonPay();
		Thread.sleep(5000);
	}

	@Test(priority = 18)	
	public void SkipSavingCard() throws InterruptedException
	{
		ExtentTest test = extent.createTest("SkipSavingCard");
		L1.SkipSavingCard();
		Thread.sleep(5000);
	}

	@Test(priority = 19)
	public void VerifySuccessButton() throws InterruptedException
	{
		ExtentTest test = extent.createTest("VerifySuccessButton");
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
		ExtentTest test = extent.createTest("ClickOnViewPortFolio");
		L1.ViewPortFolio();
		Thread.sleep(11000);
	}

	@Test (priority = 21)
	public void ClickonStartInvesting() throws InterruptedException
	{
		ExtentTest test = extent.createTest("ClickonStartInvesting");
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1100)");
		//Thread.sleep(3000);
		L1.ClickOnStartInvesting();
		Thread.sleep(6000);
	}          

	@Test (priority = 22)
	public void VerifyPANNumber() throws IOException, InterruptedException
	{
		ExtentTest test = extent.createTest("VerifyPANNumber");
		L1.Enterpannumber(UtilityClass.getDatafromPropertyFile("PanNumber"));
		Thread.sleep(3000);
	}

	@Test(priority = 23)
	public void VerifyDateOfBirth() throws IOException, InterruptedException
	{
		ExtentTest test = extent.createTest("VerifyDateOfBirth");
		L1.EnterBirthDate(UtilityClass.getDatafromPropertyFile("DateOfBirth"));
		Thread.sleep(3000);
	}

	@Test(priority = 24)
	public void VerifySubmitForVerification() throws InterruptedException
	{
		ExtentTest test = extent.createTest("VerifySubmitForVerification");
		L1.SubmitforVerification();
		Thread.sleep(4000);
	}

	@Test(priority = 25)
	public void VerifyProceedtoClientAgreement() throws InterruptedException
	{
		ExtentTest test = extent.createTest("VerifyProceedtoClientAgreement");
		L1.ClickTOProceedAgreement();
		Thread.sleep(4000);
	}

	@Test(priority = 26)
	public void ClosedDigioWindow() throws InterruptedException
	{
		ExtentTest test = extent.createTest("ClosedDigioWindow");
		L1.ClickOnClose();
		Thread.sleep(8000);

	}

	@Test(priority = 27)
	public void ClickonStartInvesting2() throws InterruptedException
	{
		ExtentTest test = extent.createTest("ClickonStartInvesting2");
		L1.StartInvesting2();
		Thread.sleep(9000);
	}

	@Test(priority = 28)
	public void SelectBroker() throws InterruptedException
	{
		ExtentTest test = extent.createTest("SelectBroker");
		L1.SelectBroker();
		Thread.sleep(2000);
	}

	//	@Test(priority = 30)
	//	public void LoginToYourBroker() throws InterruptedException
	//	{
	//		driver.switchTo().frame("//iframe[@class='scdk-middle-frame']");
	//		
	//		L1.LogintoBroker();
	//		Thread.sleep(3000);
	//	}

	//	@Test(priority = 31)
	//	public void ChooseBroker() throws InterruptedException
	//	{
	//		L1.Ch0oseBroker();
	//		Thread.sleep(2000);
	//	}
	@AfterTest
	public void TearDownTest()
	{
		driver.close();
	}
	@AfterSuite
	public void Teardown()
	{
		extent.flush();
	}
}

