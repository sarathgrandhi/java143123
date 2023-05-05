package mynewpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Relative_Xpath_And_Or {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://login.salesforce.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//to pause the execution
		Thread.sleep(5000);
		
		/*driver.findElement(By.xpath("//input[@type='email' and @id='username']")).sendKeys("Sarathgrandhi");
		driver.findElement(By.xpath("//input[@name='pw' and @type='password']")).sendKeys("S33377");
		driver.findElement(By.xpath("//input[@type='submit' and @id='Login']")).click();*/
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username' or @name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password' or @type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit' or @fdprocessedid='l9lty']")).click();

		

	}

}
