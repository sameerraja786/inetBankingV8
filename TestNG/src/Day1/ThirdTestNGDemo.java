package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTestNGDemo {
	WebDriver driver;

		@Test
		public void StartBrowser()
		{
			driver=new ChromeDriver();
			System.out.println("===================Start Browser========================");
		}
		
		@Test
		public void StartApp()
		{
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
			String CurrentUrl=driver.getCurrentUrl();
			Assert.assertTrue(CurrentUrl.contains("auth/login"));
			System.out.println("========Website Open SuccessFull==========");
		}
		
		@Test(dependsOnMethods="StartApp")
		public void LoginApp()
		{
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			boolean status= driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).isDisplayed();
			System.out.println("==========Login Successfull=============");
		}
	}


