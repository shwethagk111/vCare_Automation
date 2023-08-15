package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CordiaadminPage;
import pageObjects.partnerAdmin;
import pageObjects.partnerdetailsPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_002_LoginDataDrivenTest extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void test_LoginDDT(String fname,String lname,String mbl,String fx,String eml,String sts,String ads,String ct,String pc,String stat,String cntry, String name,String alias,String mobile,String email, String UserID)
	{
		logger.info(" Starting TC_002_LoginDataDrivenTest ");

		
		partnerAdmin pm=new partnerAdmin(driver);
		logger.info("providing partner Name");
		
		pm.setpartnerButton();
		pm.setAddcust();
		pm.setFirstName(fname);
		pm.setLastName(lname);
		pm.setnumber(mbl);
		pm.setFax(fx);
		pm.setEmail(eml);
		pm.setSStatus(sts);
		pm.setAdress(ads);
		pm.setCity(ct);
		pm.setPostcode(pc);
		pm.setStatek(stat);
		pm.setCountry(cntry);
		
		CordiaadminPage ca=new CordiaadminPage(driver);
		ca.setFirstName(name);
		ca.setLastName(alias);
		ca.setDob("10/28/2023");
		ca.setGender("Female");
		ca.setDob(UserID);
		ca.setMobile(mobile);
		ca.setEmail(email);
		ca.setUserId(UserID);
		ca.setStatuss("Inactive");
		ca.setadress("nelamangala 5th cross bengaluru");
		ca.setcity("Bengaluru");
		ca.setPostcode("3456789");
		ca.setState("chennai");
	ca.clickcancel();
		
		
		
			
		/*partnerdetailsPage pa=new partnerdetailsPage(driver);
		
			pa.setFirstName(name);
			pa.setLastName(alias);
			pa.setDob("10/28/2023");
			pa.setGender("Female");
			pa.setMobile(mobile);
			pa.setEmail(email);
			pa.setUserId(UserID);
			pa.setStatuss("Active");
			pa.setadress("mangaluru,2nd cross");
			pa.setcity("chennai");
			pa.setPostcode("564345");
			pa.setState("Delhi");
			pa.clickcancel();*/
			
		
			//pa.clicksave();

		

		
	
		logger.info(" Finished TC_003_LoginDataDrivenTest");

	}

}