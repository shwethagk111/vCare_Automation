package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CordiaadminPage;
import pageObjects.partnerAdmin;

import testBase.BaseClass;

public class TC_001_PartnerDetails extends BaseClass{
	@Test
	public void PartnerDetails()
	{
		
		
		//p.btn();
		partnerAdmin regpage=new partnerAdmin(driver);
		
		
		logger.info("providing partner Name");
		regpage.setpartnerButton();
		regpage.setAddcust();
		regpage.setFirstName("varshini");
		regpage.setLastName("rai");
		regpage.setnumber("+919916371217");
		regpage.setFax("5467654");
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setSStatus("Inactive");
		regpage.setAdress("chamarajanagara,kumsur");
		regpage.setCity("mandya");
		regpage.setPostcode("123456754");
		regpage.setStatek("Karnataka");
		regpage.setCountry("India");

		
		CordiaadminPage co=new CordiaadminPage(driver);
		co.setFirstName("kiran");
		co.setLastName("ravi");
		co.setDob("10/28/2023");
		co.setGender("Female");
		co.setMobile("+4591999758");
		co.setEmail("shwethagk34@gmail.com");
		co.setUserId("AUT008");
		co.setStatuss("Active");
		co.setadress("managlore 1st cross");
		co.setcity("chennai");
		co.setPostcode("3456789");
		co.setState("Delhi");
		
	}
}


		
		
		/*cd.setFirstName("vinaya");
		cd.setLastName("bob");
		cd.setDob("10/28/2023");
		cd.setGender("Female");
		cd.setMobile("+919632803696");
		cd.setEmail("vinibob28@gmail.com");
		cd.setUserId("AUT_003");
		cd.setStatuss("Inactive");
		cd.setadress("mangaluru,2nd cross");
		cd.setcity("chennai");
		cd.setPostcode("564345");
		cd.setState("Delhi");
		//crdreg.clicksave();*/
		
		
	
		
