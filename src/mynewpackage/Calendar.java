package mynewpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.justdial.com/travel/Train-Booking");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("frm_stn")).sendKeys("Guntur");
		
		driver.findElement(By.id("to_stn")).sendKeys("Hyderbad");
		
		
		//to click on departure
		driver.findElement(By.id("departDate")).click();
		
		Thread.sleep(5000);
		
		//to select the 15th of april
		
		driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[2]/table/tbody/tr[3]/td[7]/a")).click();	
	}

}
