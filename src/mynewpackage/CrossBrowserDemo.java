package mynewpackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserDemo {

	public static void main(String[] args) {
		String testBrowser="";

		WebDriver driver=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browser name: ");
		testBrowser= sc.nextLine();
		sc.close();

		switch(testBrowser)
		{

		case"chrome":
			System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("invalid browser");
			System.exit(1);
			
		}
		driver.get("https://brave.com");
		driver.manage().window().maximize();
	}

}
