package Nscorp.cf6g3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HomepageTest {
WebDriver driver,driver2;
 @BeforeTest
 public void setup()
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chdriver\\chromedriver-win64\\chromedriver.exe");
	 driver=new ChromeDriver();
 }

  @Test(priority=0)
  public void mainTest() {
		driver.get("https://qawww.norfolksouthern.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		 Assert.assertEquals(title, "Norfolk Southern");
  }
  @Test(priority=1)
  public void mainTest1() {
	  driver2=new ChromeDriver();
		driver2.get("https://qawww.norfolksouthern.com/en/about-us/company-overview");
		driver2.manage().window().maximize();
		String title1=driver2.getTitle();
		 Assert.assertEquals(title1, "Company Overview");
  }
  @org.testng.annotations.AfterTest
  public void flush()
  {
	  driver.quit();
	  driver2.quit();
  }
}
