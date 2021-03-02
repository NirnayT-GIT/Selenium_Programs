package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookNewUser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "\"D:\\Selenium\\geckodriver.exe\"");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("www.google.com");
		
		driver.manage().window().maximize();
		
	
	}

}
