package Lesson02;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
   @BeforeClass
  public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation\\\\libs\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org");
	}
  @AfterClass
  public void closeBrowser()
	{
		driver.quit();
	}
  
//  @Test
//  public void test01() {
//	  driver.navigate().refresh();
//		String actualTitleName = driver.getTitle();		
//		System.out.println("Title is: " + actualTitleName);	
//	  
//  }
  @Test
  public void test02() {
	  System.out.println(driver.findElements(By.id("menu_about")));
	  System.out.println(driver.findElements(By.linkText("About")));
	  System.out.println(driver.findElements(By.partialLinkText("bout")));
	  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	  System.out.println(allLinks.size());
  }

}
