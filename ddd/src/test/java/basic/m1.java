package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class m1
{
	@Test
	public void bb()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.facebook.com/");
	}

}
