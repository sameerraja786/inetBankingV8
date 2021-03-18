package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondTestNGDemo {
	static WebDriver driver;
	@Test
	public static void main(String [] args)
	{
		
		public void login()
		{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}
		
	}

}
