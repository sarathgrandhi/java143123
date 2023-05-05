package mynewpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_id {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//To open facebook login page
				//driver.get("https://facebook.com");
				
				//To Maximize browser window
				driver.manage().window().maximize();
		//driver.findElement(By.id("email")).sendKeys("9533377319");
		
		
		driver.get("https://login.salesforce.com");
		
		
		driver.findElement(By.id("username")).sendKeys("Mindq");
		driver.findElement(By.id("password")).sendKeys("Sr nagar");
		driver.findElement(By.id("Login")).click();
		
		

	}

}
