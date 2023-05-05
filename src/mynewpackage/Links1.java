package mynewpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links1 {

	public static void main(String[] args) throws InterruptedException {
		String w1 = "";
		String w2 = "";
		
		//to initialize the browser
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		
		
		String pgTitle = driver.getTitle();
		System.out.println(pgTitle);
		
		List<WebElement> pgLinks = driver.findElements(By.tagName("a"));
		System.out.println(pgLinks.size());
		
		for(int i=0;i<=pgLinks.size()-1;i++) {
			//read link visible text
			String pgLink=pgLinks.get(i).getText();
			
			if(!pgLink.isEmpty()) {
				pgLinks.get(i).click();
				Thread.sleep(5000);
				
				//Read window handles
				Set<String> pgHandles=driver.getWindowHandles();
				
				//Check the count
				if(pgHandles.size()==2) {
					Iterator<String>winHandles = pgHandles.iterator();
					w1=winHandles.next();
					w2=winHandles.next();
					driver.switchTo().window(w2);
				}
				pgTitle=driver.getTitle();
				System.out.println(pgTitle);
				
				if(pgHandles.size()==2) {
					driver.close();
					driver.switchTo().window(w1);
				}
				else {
					driver.navigate().back();
				}
				driver.navigate().to("https://login.salesforce.com");
				 pgLinks= driver.findElements(By.tagName("a"));
			}
			
			
		}
		


	}

}
