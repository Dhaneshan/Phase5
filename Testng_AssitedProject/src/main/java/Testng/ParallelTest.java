package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;

	@Test(groups = "Chrome")
	public void LaunchChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(groups = "Chrome", dependsOnMethods = "LaunchChrome")
	public void TryChrome() {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
	}

	@Test(groups = "Internetexplorer")
	public void LaunchInternetexplorer() {
		System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer_x64_4.5.0/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(groups = "Internetexplorer", dependsOnMethods = "LaunchInternetexplorer")
	public void TryInternetexplorer() {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ravi28394");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println(Thread.currentThread().getId());
	}

}
