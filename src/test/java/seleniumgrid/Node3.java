package seleniumgrid;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node3
{
	@Test(priority=3)
	public void method3() throws Exception
	{
		//At Node3
		URL u3=new URL("http://192.168.1.7:7777/wd/hub");
		DesiredCapabilities dc3=DesiredCapabilities.chrome();
		/*DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");*/
		RemoteWebDriver driver3=new RemoteWebDriver(u3,dc3);
		driver3.get("http://www.amazon.in");
		Thread.sleep(5000);
		driver3.close();
	}
}
