package Lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test01 {
	
  @Test
  public void test1() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\libs\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  System.out.println(driver.getCurrentUrl());
	  driver.manage().window().maximize();
	  driver.quit();
	  System.out.println("Hello Nati");

	  
  }
}
