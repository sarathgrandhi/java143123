package datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fi = new FileInputStream("./Properties\\testdata.property");
		Properties pobj=new Properties();
		pobj.load(fi);
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(pobj.getProperty("baseURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys(pobj.getProperty("userId"));
		driver.findElement(By.name("password")).sendKeys(pobj.getProperty("pwd"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
