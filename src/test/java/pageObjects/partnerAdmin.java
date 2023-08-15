package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class partnerAdmin  {
	  WebDriver driver;
	
	

	public partnerAdmin (WebDriver driver)
	{
		//super(driver);

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress","localhost:9989");
		WebDriver driver1=new ChromeDriver(options);
		
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}

	// Elements

	   @FindBy(xpath = "//a[normalize-space()='Partners']")
	    WebElement clickbutton;
	
	
		@FindBy(xpath = "//button[@class='col-md-12 float-right add_customer']")
		WebElement clickbtn;
		
		@FindBy(xpath = "//input[@id='customerName']")
		WebElement txtFirstname;

		@FindBy(xpath = "//input[@placeholder='Alias Name']")
		WebElement txtLalias;
		
		@FindBy(xpath ="//input[@id='phone']")
		WebElement textmobile;
		
		@FindBy(xpath ="//input[@placeholder='Fax']")
		WebElement txtfax;

		@FindBy(xpath = "//input[@name='orgemail']")
		WebElement txtEmail;
		

		@FindBy(name = "status")
		WebElement sstatus;

		@FindBy(xpath = "//input[@name='orgAddress']")
		WebElement adress;
		
		@FindBy(xpath = "//input[@name='orgCity']")
		WebElement city;
		
		@FindBy(xpath = "//input[@name='orgPostalCode']")
		WebElement postcode;
		

		@FindBy(xpath = "//select[@name='state']")
		WebElement stateK;

		@FindBy(xpath = "//select[@name='country']")
		WebElement country;
		
		
		
		
		public void setpartnerButton()
		{
			clickbutton.click();

		}

		public void setAddcust() 
		{
			clickbtn.click();

		}

		public void setFirstName(String fname)
		{
			txtFirstname.sendKeys(fname);

		}

		public void setLastName(String lname) 
		{
			txtLalias.sendKeys(lname);

		}

		

		public void setnumber(String mb)
		{
		
			textmobile.sendKeys(mb);

		}
		
		
		
		public void setFax(String fax)
		{
			txtfax.sendKeys(fax);

		}
		
		public void setEmail(String email)
		{
			txtEmail.sendKeys(email);

		}
		
		public void setSStatus(String sts) 
		{
			new Select(sstatus).selectByVisibleText(sts);

		}

		public void setAdress(String adrs) 
		{
			adress.sendKeys(adrs);

		}

		public void setCity(String ct) 
		{
			city.sendKeys(ct);

		}

		public void setPostcode(String pstc) 
		{
			postcode.sendKeys(pstc);

		}

		public void setStatek(String stat) 
		{
			new Select(stateK).selectByVisibleText(stat);
		}
			
		public void setCountry(String cntry) 
		{
			new Select(country).selectByVisibleText(cntry);
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
	
	
	


