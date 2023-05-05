package mynewpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_Text2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		WebElement uidObj=driver.findElement(By.id("username"));
		
		uidObj.click();
		
		uidObj.clear();
		
		uidObj.sendKeys("Mindq");
		
		Thread.sleep(5000);
		
		uidObj.sendKeys("Systems");
		
		String uid =uidObj.getAttribute("value");
		
		Thread.sleep(5000);
		
		uidObj.clear();

		
		if(uid.equalsIgnoreCase("Mindqsystems")) {
			System.out.println("sendkeys() method will not overwrite existing value");
			
		}
		else {
			System.out.println("sendkeys() method will overwrite existing value");
		}
	}

}
