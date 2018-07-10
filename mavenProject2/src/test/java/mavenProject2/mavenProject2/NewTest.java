package mavenProject2.mavenProject2;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

public class NewTest {
	//Initiate
	WebDriver driver;
	

@BeforeTest
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A06438_P5.training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	 
}

	
  @Test
  public void login() {
	  driver.get("http://localhost:8083/TestMeApp/login.htm");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

  
}

