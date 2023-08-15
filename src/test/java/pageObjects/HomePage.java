package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
		
	public HomePage(WebDriver driver) {
		
		
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	

	// Elements
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement lnkMyaccount;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='col-md-12 sign_in_button btn-sm pt-2 pb-2 pl-0 pr-0 ml-0 mr-0']")
	WebElement btn;
	

							

			@FindBy(xpath = "//input[@placeholder='_ _ _ _ _ _']")
			WebElement otp;
			 driver.findElement(By.xpath("//input[@placeholder='_ _ _ _ _ _']")).sendKeys(OTP);
			@FindBy(xpath = "//button[normalize-space()='Verify']")
			WebElement vrfy;
			
	driver.findElement(By.xpath("//button[normalize-space()='Verify']")).click();
	
	// Action Methods
	public void setusername(String uname) 
	{
		lnkMyaccount.sendKeys("uname");
	}

	public void setpassword(String pwd)
	{
		password.sendKeys("pwd");
	}

	 public void btn()
	 {
		 btn.click();
	 }
		
}