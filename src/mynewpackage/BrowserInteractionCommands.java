package mynewpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInteractionCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//To open facebook login page
		driver.get("https://facebook.com");
		
		//To Maximize browser window
		driver.manage().window().maximize();
		
		//To get page source
		String Pgsrc = driver.getPageSource();
		System.out.println(Pgsrc);
		
		//To close the page
		//driver.close();
		
		//To quit the page
		//driver.quit();
		
		//To read page title
		String pgTitle=driver.getTitle();
		System.out.println("page title is :"+pgTitle);
		
		//To read page url
		String pgUrl=driver.getCurrentUrl();
		System.out.println("page url is:" +pgUrl);
		
		//To open google
		driver.navigate().to("https://google.co.in");
		
		//To Refresh the page
		driver.navigate().refresh();
		
		//To move back by one page 
		driver.navigate().back();
		
		//To move forward by one page
		driver.navigate().forward();
		

	}

}
