package testBase;

import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

public WebDriver driver;
public Logger logger;
	
	@BeforeClass
	public void setup()
	{
		
		logger=LogManager.getLogger(this.getClass());
		//driver=new ChromeDriver();no needed
		
		//driver.manage().deleteAllCookies();no needed
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));no needed
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress","localhost:9989");
		WebDriver driver=new ChromeDriver(options);
		
		/*driver.get("https://stage.d2wc8um6ks5pbt.amplifyapp.com/login");
		
		
			
				
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("khushbooverma");

		  
				 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@1234");
				
				
				driver.findElement(By.xpath("//button[@class='col-md-12 sign_in_button btn-sm pt-2 pb-2 pl-0 pr-0 ml-0 mr-0']")).click();
				
				System.out.println("Enter OTP:");
				Scanner obj = new Scanner(System.in);
				String OTP = obj.nextLine();
								
				 driver.findElement(By.xpath("//input[@placeholder='_ _ _ _ _ _']")).sendKeys(OTP);	
				 
				driver.findElement(By.xpath("//button[normalize-space()='Verify']")).click();
				
				   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));*/

				
		driver.manage().window().maximize();
	}
	
	/*@AfterClass
	public void tearDown()
	{
		driver.close();
	}*/


	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}
	
	public String randomeNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
	}
}