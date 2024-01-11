package data_provider56;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_registration 
{
	@DataProvider(name="data2")
	public Object[][] facebookregi()
{
	Object[][] data= new Object[5][4];
	
	data[0][0]= "chandra";
	data[0][1]= "Atla";
	data[0][2]= "7095720954";
	data[0][3]= "chandra123";
	data[1][0]= "mouli";
	data[1][1]= "setti";
	data[1][2]= "709554720";
	data[1][3]= "mouli123";
	data[2][0]= "Ram";
	data[2][1]= "patel";
	data[2][2]= "712260308";
	data[2][3]= "Ram@123";
	data[3][0]= "Sita";
	data[3][1]= "Jaiii";
	data[3][2]= "8716022230";
	data[3][3]= "Sita@123";
	data[4][0]= "Lakshmi";
	data[4][1]= "balaji";
	data[4][2]= "8712272054";
	data[4][3]= "Laxmi@123";
	return data;
													
	}
	@Test(dataProvider="data2")
	public void FacebooktoReg(String Fname, String Lname, String mno,String password ) throws InterruptedException

	{
		System.out.println(Fname.concat(Lname.concat(mno.concat(password))));
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569885%7Cb%7Cfb%20sign%20up%7C&placement=&creative=589460569885&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D1007740%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIsY3TlPHAgwMVKaZmAh12dAnWEAAYASAAEgIYdPD_BwE");
		
		Thread.sleep(3000);
		WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys(Fname);
		WebElement Sname=driver.findElement(By.name("lastname"));
		Sname.sendKeys(Lname);
		WebElement mnum=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mnum.sendKeys(mno);
		WebElement pw=driver.findElement(By.name("reg_passwd__"));
		pw.sendKeys(password);
		
	}

}
