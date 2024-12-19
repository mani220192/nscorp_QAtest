package Nscorp.cf6g3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
			
				
		 driver =new ChromeDriver() ;
		driver.get("https://qawww.norfolksouthern.com");
		driver.manage().window().maximize();
		
		
	}

	public static void Homepage() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chdriver\\chromedriver-win64\\chromedriver.exe");
	}

}
