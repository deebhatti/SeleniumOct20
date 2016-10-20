package crossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBT {
WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void openBrowser(String browser){
		if (browser.equals("Firefox")){
			driver = new FirefoxDriver();
		}
		
		else if (browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		//Adding a comment in line number 30 so as to see it in GithHub
		else if (browser.equals("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Webdrivers\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		else if (browser.equalsIgnoreCase("opera")){
			System.setProperty("webdriver.opera.driver", "C:\\Webdrivers\\operadriver_win32\\operadriver.exe");
			driver = new OperaDriver();
		}	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.barnesandnoble.com/");
	}	
	
	@Test
	public void titleVerification(){
		String expectedTitle = "Online Bookstore: Books, NOOK ebooks, Music, Movies & Toys | Barnes & Noble®";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	
	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}
	


}
