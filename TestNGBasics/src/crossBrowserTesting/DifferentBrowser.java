package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DifferentBrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "C:\\Webdrivers\\operadriver_win32\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
	}

}
