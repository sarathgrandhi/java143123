package mynewpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Edit_Text {

	public static void main(String[] args) throws InterruptedException {
		//to initailize the browser
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		/*//to focus on "username" editbox
		driver.findElement(By.id("username")).click();
		//to clear data
		driver.findElement(By.id("username")).clear();
		
		//to enter data
		driver.findElement(By.id("username")).sendKeys("Mindq");
		Thread.sleep(5000);
		
		//to clear data 
		driver.findElement(By.id("username")).clear();*/
		
		WebElement uidObj = driver.findElement(By.id("username"));
		
		uidObj.click();
		
		uidObj.clear();
		
		uidObj.sendKeys("Mindq");
		
		Thread.sleep(5000);
		
		uidObj.clear();
		
		
	}
}
