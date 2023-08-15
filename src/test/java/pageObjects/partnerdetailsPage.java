package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class partnerdetailsPage 
{
	WebDriver driver;

	public partnerdetailsPage (WebDriver driver)
	{
		

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress","localhost:9989");
		WebDriver driver1=new ChromeDriver(options);
		
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}

	
	     @FindBy(xpath ="//input[@placeholder='First Name']")
		WebElement txtFirstname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
		WebElement txtLalias;
		
		@FindBy(xpath ="//input[@name='dob']")
		WebElement textdob;
		

		@FindBy(xpath ="//select[@name='gender']")
		WebElement textgender;
		
		
		
		@FindBy(xpath ="//div[@class='required row d-flex justify-content-center form-group form-inline mt-1 mb-1 pt-1 pb-1']//input[@id='phone']")
		WebElement textmobile;
		

		@FindBy(xpath = "//input[@name='adminemail']")
		WebElement txtEmail;

		@FindBy(xpath ="//input[@placeholder='UserId']")
		WebElement txtuserId;
		

		@FindBy(xpath = "//select[@name='status']")
		WebElement statuss;

		@FindBy(xpath = "//input[@name='address']")
		WebElement adress;
		
		@FindBy(xpath = "//input[@name='userCity']")
		WebElement textcity;
		
		@FindBy(xpath = "//input[@name='userPostalCode']")
		WebElement textpostcode;
		

		@FindBy(xpath = "//select[@name='userState']")
		WebElement state;
		
		//@FindBy(xpath = "//button[normalize-space()='Save']")
		WebElement save;
		
		@FindBy(xpath = "//button[normalize-space()='Cancel']")
		WebElement cancel;
		

	

		//@FindBy(xpath = "//input[@value='Continue']")
		//WebElement btnContinue;

		
	

		public void setFirstName(String finame) {
		
			txtFirstname.sendKeys(finame);

		}

		public void setLastName(String laname) {
			
			txtLalias.sendKeys(laname);

		}

		public void setDob(String db) {
			textdob.sendKeys(db);

		}

		public void setGender(String gend) {
			 textgender.sendKeys(gend);

		}
		
		public void setMobile(String mb) 
		{
			textmobile.clear();
			textmobile.sendKeys(mb);

		}
		
		

		
		public void setEmail(String email) {
			txtEmail.sendKeys(email);

		}
		
		public void setUserId(String uID) {
			
			txtuserId.sendKeys(uID);
		}
		
        public void setStatuss(String sts) {
			
			new Select(statuss).selectByVisibleText(sts);
		}
		
          public void setadress(String adrs) {
			
        	  adress.sendKeys(adrs);
		   }
		
		

		public void setcity(String cit) {
			textcity.sendKeys(cit);

		}
		
		public void setPostcode(String pc)
		{
			textpostcode.sendKeys(pc);

		}
		

		public void setState(String st) {
		new Select(state).selectByVisibleText("Delhi");

		}
		
		public void clickcancel()
		{
			cancel.click();
			
		}
		

	//	public void clicksave()
		{
	     save.click();

		}


			//sol2 
			//btnContinue.submit();
			
			//sol3
			//Actions act=new Actions(driver);
			//act.moveToElement(btnContinue).click().perform();
						
			//sol4
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("arguments[0].click();", btnContinue);
			
			//Sol 5
			//btnContinue.sendKeys(Keys.RETURN);
			
			//Sol6  
			//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
			
		
		}
