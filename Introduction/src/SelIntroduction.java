import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - class called ChromeDriver--> Methods--> call Methods
		//Webdriver is the main interface which consists of all Selenium-
		// -methods which can be used in all browsers
		
		// chromedriver.exe(3rd party lib provided by chrome)--> chrome browser
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// webdriver.chrome.driver (key value)-->value of path in local
		WebDriver driver = new ChromeDriver();
		
		//Firefox launch (gecko driver)
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Charul\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		
		//webdriver.gecko.driver 
		 
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	

	}

}
