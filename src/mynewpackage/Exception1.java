package mynewpackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Exception1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
		System.out.println("before click on telugu link");
		
		if(driver.findElement(By.linkText("తెలుగు")).isDisplayed()) {
			System.out.println("telugu link is displayed");
		}
		else {
			System.out.println("Teleugu link is invisible");
		}
		
		
		driver.findElement(By.linkText("తెలుగు")).click();
		
		System.out.println("After click on telugu link");
		Thread.sleep(3000);
		try {
		if(driver.findElement(By.linkText("తెలుగు")).isDisplayed()) {
			System.out.println("Telugu link is displayed");
		}
		}
		catch (Exception e) {
			System.out.println("Telugu link is invisible");
		}
		finally {
			File myFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Date dt=new Date();
			DateFormat df=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			
			FileHandler.copy(myFile,new File("./Drivers\\Defects"+df.format(dt)+"png"));
			
		}
	}
}
