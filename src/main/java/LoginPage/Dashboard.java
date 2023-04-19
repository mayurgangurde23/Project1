
package LoginPage;
	
	import javax.management.loading.PrivateClassLoader;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;
	
	public class Dashboard {
	
		@FindBy(xpath="//input[@type='email']")private WebElement Email;
		@FindBy(xpath="//input[@type='password']")private WebElement Passsword;	
		@FindBy(xpath="//button[text()='Login']")private WebElement ClickOnLoginButton;
		@FindBy(xpath="//button[text()='Start Investing']")private WebElement StartInvesting;
		@FindBy(xpath = "//span[text()='Capital Preservation']")private WebElement Q1;
		@FindBy(xpath = "//span[text()='PPF / Post Office Schemes']")private WebElement Q2;
		@FindBy(xpath = "//span[text()='1 to 3 Years']")private WebElement Q3;
		@FindBy(xpath = "//span[text()='Spouse + Children']")private WebElement Q4;
		@FindBy(xpath = "//span[text()='40 - 50%']")private WebElement Q5;
		@FindBy(xpath = "//span[text()='15 - 20%']")private WebElement Q6;
		@FindBy(xpath = "//span[text()='Wait for recovery and then act']")private WebElement Q7;
		@FindBy(xpath = "//span[text()='10-20 Lacs']")private WebElement Q8;
		@FindBy(xpath = "//span[text()='30 - 40%']")private WebElement Q9;
		@FindBy(xpath = "//span[text()='51 - 60']")private WebElement Q10;
		//@FindBy(xpath="//input[@type='checkbox']")private WebElement Checkbox;
		@FindBy(xpath="//button[text()='Change my risk profile']")private WebElement RiskProfile;
	    @FindBy(xpath="//div[@class='css-zfnw77']")private WebElement Moderate;
	    @FindBy(xpath="//button[text()='Confirm this risk profile']")private WebElement ClickOnConfirm;
	    @FindBy(xpath="//input[@type='number']")private WebElement EnterAmount;
	    @FindBy(xpath="//button[text()='2 Yr']")private WebElement SelectYear;
	    @FindBy(xpath="//div[text()='Choose this strategy if you want your portfolio to have only equity stocks. All future rebalances will follow the same strategy.']")private WebElement EquityStrategy;
	    @FindBy(xpath="//button[text()='Create my Portfolio']")private WebElement SelectPortfolio;
	    @FindBy(xpath="//div[text()='Unlock Full Portfolio']")private WebElement PortfolioCreation;
	    @FindBy(xpath = "//button[text()='Proceed to Pay']")private WebElement ProcedtoPay;
	    @FindBy(xpath = "(//div[@class='svelte-1365of8'])[1]")private WebElement PaymentOption;
	    @FindBy(xpath="//input[@id='card_number']")private WebElement CardNumber;
		@FindBy(xpath = "//input[@name='card[expiry]']")private WebElement Expiry;
		@FindBy(xpath = "//input[@id='card_cvv']")private WebElement CVV;
		@FindBy(xpath ="//span[@id='footer-cta']")private WebElement PAY;
		@FindBy(xpath = "//button[text()='Skip saving card']")private WebElement SkipSavingCard;
		@FindBy(xpath = "//button[text()='Success']")private WebElement Success;
	    @FindBy(xpath = "//button[text()='View Portfolio']")private WebElement ViewPortFolio;
	    @FindBy(xpath = "(//button[text()='Start Investing'])[2]")private WebElement StartInvesting1;
	  //  @FindBy(xpath = "//input[@id='mui-45']")private WebElement PAN;
	    @FindBy(xpath = "//input[@id='mui-35']")private WebElement PAN;
	    //@FindBy(xpath = "//input[@id='mui-46']")private WebElement DateOfBirth;
	    @FindBy(xpath = "//input[@id='mui-36']")private WebElement DateOfBirth;
	    @FindBy(xpath = "//button[text()='Submit for verification']")private WebElement SubmitForVerification; 
	    @FindBy(xpath="//button[text()='Proceed to Client Agreement']")private WebElement ClientAgreement;
	   // @FindBy(xpath="//*[@id=\"aadhaarSeedModal\"]/div/div/div[2]/div/div/div[4]/div/div")private WebElement eSign;
	    //@FindBy(xpath = "//button[text()=' Sign now ']")private WebElement Digio;
	    @FindBy(xpath = "//img[@src='data:image/gif;base64,iVBORw0KGgoAAAANSUhEUgAAABQAAAAUCAYAAACNiR0NAAAA60lEQVR42tXUPQqEMBAFYO+kYGFhYeFaWAm2qYyFlxBsraxELCzF1ip4Br2CR5klCyuLyeRni4UNTPf4ILxhHOfv3jzPMAwD6HJd1wFjTJ2r6xpc131NWZZoOMuyKzeOozzXtu0VUqGf2HuWZRHRKIqE4B2VYXwIISI4TZM0zIdSChjmeR5s2yb/dt/3KIph67qqizFFjTBT1ArTlcQnz3M7DCtAt1JfY8aoDaZFi6JQFqAqqmkaEU3TVNsmhlZVJYLHcUAQBNrVuKNxHMN5nvJv7/sOYRiC7/vKPePnjWNJkuCY7QOAx08O9BNR9VtE5qAr5wAAAABJRU5ErkJggg==']")private WebElement Digio;
	    @FindBy(xpath = "//button[text()='Go Back']")private WebElement GoBack;
	    @FindBy(xpath = "(//button[text()='Start Investing'])[1]")private WebElement StartInvesting2;
	    @FindBy(xpath = "//div[text()='Angel One']")private WebElement Broker;
	   // @FindBy(xpath = "//h2[text()='Login with your broker']")private WebElement LoginToBroker;
	    @FindBy(xpath = "(//button[@class='btn button__2pHpn '])[1]")private WebElement ChooseBroker;
	    
 	public Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	public void EnterEmailID(String email)
	{
		Email.sendKeys(email);
	}
	public void EnterPassword(String password)
	{
		Passsword.sendKeys(password);
	}
	public void ClickonLoginButton() throws InterruptedException
	{
		ClickOnLoginButton.click();	
		Thread.sleep(3000);
	}
	public void ClickOnStartInvesting() throws InterruptedException
	{
	StartInvesting.click();	
	Thread.sleep(3000);
	}
	public void SelectQuestions() throws InterruptedException
	{
	Q1.click();
	Thread.sleep(1000);
	Q2.click();
	Thread.sleep(1000);
	Q3.click();
	Thread.sleep(1000);
	Q4.click();
	Thread.sleep(1000);
	Q5.click();
	Thread.sleep(1000);
	Q6.click();
	Thread.sleep(1000);
	Q7.click();
	Thread.sleep(1000);
	Q8.click();
	Thread.sleep(1000);
	Q9.click();
	Thread.sleep(1000);
	Q10.click();
	Thread.sleep(1000);
	}
//	public void ClickonCheckBox() throws InterruptedException 
//	{
//		Checkbox.click();
//		Thread.sleep(1000);
//	}
	public void ClickonChangeRiskProfile() 
	{
		RiskProfile.click();
	}
	public void ClickOnModerate()
	{
		Moderate.click();
		}
	public void clickonconfirm()
	{
		ClickOnConfirm.click();
		}
	public void EnterAmount(String Number) throws InterruptedException
	{
	EnterAmount.sendKeys(Number);
	}
	public void Selectyear()
	{
		SelectYear.click();
		}
	public void SelectStrategy()
	{
	EquityStrategy.click();
	}
	public void SelectPortFolio()
	{
		SelectPortfolio.click();
		}
	public void PortfolioCreation()
	{
		PortfolioCreation.click();
	}
	public void ProcedToPay() throws InterruptedException
	{
		ProcedtoPay.click();
		Thread.sleep(3000);
	}
	public void selectpaymentption()
	{
		PaymentOption.click();
	}
	
	public void EnterCardnumber(String Number)
	{
		CardNumber.sendKeys(Number);
		}
	public void EnterExpiry(String pin) {
		Expiry.sendKeys(pin);
	}
	public void EnterCvv(String Pin) throws InterruptedException
	{
		CVV.sendKeys(Pin);
		Thread.sleep(3000);
	}
	public void ClickonPay() throws InterruptedException
	{
		PAY.click();
		Thread.sleep(3000);
	}
	public void SkipSavingCard() throws InterruptedException
	{
		SkipSavingCard.click();
		Thread.sleep(6000);
	}
	public void ClickOnSuccess() throws InterruptedException
	{
		Success.click();	
		Thread.sleep(8000);
	}
	public void ViewPortFolio() throws InterruptedException
	{
		ViewPortFolio.click();
		Thread.sleep(4000);
	}
	public void StartInvesting() throws InterruptedException
	{
		StartInvesting1.click();
		Thread.sleep(3000);
	}
	public void Enterpannumber(String Number)
	{
		PAN.sendKeys(Number);
	}
	public void EnterBirthDate(String Date)
	{
		DateOfBirth.sendKeys(Date);
		}
	public void SubmitforVerification() throws InterruptedException
	{
		SubmitForVerification.click();
		Thread.sleep(3000);
	}
	public void ClickTOProceedAgreement()
	{
		ClientAgreement.click();

	}
	public void ClickOnClose() throws InterruptedException
	{
		Digio.click();
		Thread.sleep(1000);
		GoBack.click();
	}
	public void StartInvesting2()
	{
		StartInvesting2.click();
	}
	public void SelectBroker()
	{
		Broker.click();
	}
//	public void LogintoBroker() throws InterruptedException
//	{
//		LoginToBroker.click();
//		Thread.sleep(1000);
//		
//	}
//	public void ChooseBroker()
//	{
//		ChooseBroker.click();
//		
//	}
	}
	
	
	
