package seleniumgrid;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node1
{
	@Test(priority=1)
	public void method1() throws Exception
	{
		//At Node1
		URL u1=new URL("http://192.168.1.7:5555/wd/hub");
		DesiredCapabilities dc1=DesiredCapabilities.chrome();
		/*DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");*/
		RemoteWebDriver driver1=new RemoteWebDriver(u1,dc1);
		driver1.get("http://www.facebook.com");
		Thread.sleep(5000);
		driver1.close();
	}
}
