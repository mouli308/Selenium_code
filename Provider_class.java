package data_provider56;

import java.util.Scanner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider_class 
{
	@DataProvider(name="data1")
	public Object [][] method1()
	{
		return new Object[][] {{"Sachin"},{"Kohli"},{"Dhoni"},{"Iyer"},{"Pandya"},{"Rahul"}};
		
	}

	@Test(dataProvider="data1")
	public void testcase1 (String value1)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the name of the cricketer");
		
		String a1=s1.nextLine();
		if(a1.equals(value1))
		{
			System.out.println("Match the cricketer");			
		}
		else
		{
			System.out.println("Not Match the cricketer");	
		}
		s1.close();
		
		}

}
