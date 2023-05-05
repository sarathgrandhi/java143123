package mynewpackage;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Exception2 {

	public static void main(String[] args) throws InterruptedException {
		//To read user inputs
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter user name");
		String uid= sc.nextLine();
		System.out.println("Enter pwd");
		String pwd= sc.nextLine();
		sc.close();

		//to initialize browser
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//to perform login operation
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(5000);

		//to check "PIM" element visiblity
		try {
			if(driver.findElement(By.xpath("//h6[text()='PIM']")).isDisplayed()) {
				System.out.println("Successful login operation");
				//to perform logout operation
				driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("Logout")).click();			
			}
		}
		catch(Exception e) {
			System.out.println("Unsuccessful login operation");}
			
		       /*File myFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

					Date dt= new Date();
					DateFormat df= new SimpleDateFormat("dd_MM_YYYY_hh_mm_ss");
					FileHandler.copy(myFile, new File("./Defects\\OHRM"+df.format(dt)+".png"));*/
		}
	}

