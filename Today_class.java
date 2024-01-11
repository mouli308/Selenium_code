package data_provider56;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Today_class {
	
		@DataProvider(name="data1")
		public Object[][] amazonlogin()
	{
		Object[][] data= new Object[2][2];
		
		data[0][0]= "chandra";
		data[0][1]= "Chandra123";
		data[1][0]= "Mouli";
		data[1][1]= "mouli123";
		return data;
														
		}
		@Test(dataProvider="data1")
		public void amazontologin(String username, String password)
	
		{
			System.out.println(username.concat(password));
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			WebElement name=driver.findElement(By.id("ap_email"));
			name.sendKeys(username);
			WebElement pw=driver.findElement(By.id("ap_password"));
			pw.sendKeys(password);
			
		}
		
		

	}



