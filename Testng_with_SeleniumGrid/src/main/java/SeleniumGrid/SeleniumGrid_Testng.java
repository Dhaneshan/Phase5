package SeleniumGrid;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumGrid_Testng 
{

    public static void main(String[] args) throws MalformedURLException
    {
    	DesiredCapabilities cap= new DesiredCapabilities();
    	cap.setBrowserName("chrome");
    	cap.setPlatform(Platform.WIN10);
    	URL url=new URL(" http://192.168.29.30:4444/wd/hub");
    	WebDriver driver=new RemoteWebDriver(url,cap);
    	driver.get("https://www.google.com");
    	System.out.println("Google title is :"+driver.getTitle());
    	driver.close();
    	
    }

}
