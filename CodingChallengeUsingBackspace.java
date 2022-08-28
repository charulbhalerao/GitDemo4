import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CodingChallengeUsingBackspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://todomvc.com/");
		
		driver.findElement(By.xpath("//*[@role='tab']/*[text()='Labs']")).click();
		driver.findElement(By.partialLinkText("Angular 2.0")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='What needs to be done?']")).sendKeys("Hamburjar");
		driver.findElement(By.cssSelector("input[placeholder='What needs to be done?']")).sendKeys(Keys.ENTER);
		
		Actions act = new Actions(driver);
		
		act.doubleClick(driver.findElement(By.xpath("//ul[@class='todo-list']/li//label"))).perform();
		driver.findElement(By.xpath("//ul[@class='todo-list']//input[@class='edit']")).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		driver.findElement(By.xpath("//ul[@class='todo-list']//input[@class='edit']")).sendKeys("ger");
		driver.findElement(By.xpath("//ul[@class='todo-list']//input[@class='edit']")).sendKeys(Keys.ENTER);	
		
	}

}

