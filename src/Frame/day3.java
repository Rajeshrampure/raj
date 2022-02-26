package Frame;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void WebloginCarLaon()
	{
		System.out.println("WebloginCarLaon");
	}
	
	@Test
	public void MobileloginCarLaon()
	{
		System.out.println("MobileloginCarLaon");
	}
	
	@AfterTest
	public void LoginAPICarLaon()
	{
		System.out.println("APILoginCar");
	}
	
}
