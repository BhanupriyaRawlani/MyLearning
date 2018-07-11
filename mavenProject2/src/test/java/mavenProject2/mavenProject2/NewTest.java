package mavenProject2.mavenProject2;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class NewTest {
	//Initiate driver instance branch
	WebDriver driver;
	

@BeforeTest
public void launchBrowser() {
	//set
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A06438_P5.training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	 
}

	
  @Test
  public void login() throws InterruptedException {
	  driver.get("https://www.americangolf.co.uk/golf-clubs/wedges");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	   
	  WebElement element = driver.findElement(By.xpath("(//*[contains(@class,'slider-control noUi-target noUi-ltr noUi-horizontal')])[1]"));
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeScript("arguments[0].scrollIntoView(true)", element);
	  Thread.sleep(5000);
	  js.executeScript("window.scrollBy(0, -150)");
	  Thread.sleep(3000);
	  
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

  
}

