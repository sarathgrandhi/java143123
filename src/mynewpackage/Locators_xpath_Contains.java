package mynewpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_xpath_Contains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Forgotten password?')]")).click();
        
		
		int a =5;
		System.out.println(a);
		int b=++a;
		System.out.println(b);
		int c=++b;
		System.out.println(c);
		int d=++c;
		System.out.println(d);
		
		

	}

}
