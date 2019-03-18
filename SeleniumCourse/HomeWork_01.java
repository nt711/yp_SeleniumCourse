package Lesson02;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HomeWork_01 {
	WebDriver driver;
 @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Automation\\\\libs\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://atidcollege.co.il/Xamples/ex_locators.html");

  }

  @Test
  public void Test01_FindByID() {
	  System.out.println(driver.findElements(By.id("locator_id")));
  }
 
  @Test
  public void Test02_FindByName() {
	  System.out.println(driver.findElements(By.name("locator_name")));	  
  }

  @Test
  public void Test03_FindByLinkName() {
	  System.out.println(driver.findElements(By.linkText("myLocator(5)")));	  
  }
 
  @Test
  public void Test04_FindByPartialLinkName() {
	  System.out.println(driver.findElements(By.partialLinkText("Find")));	  
  }
 
  @Test
  public void Test05_FindByTagName() {
	  System.out.println(driver.findElements(By.tagName("Find my locator (3)")));	  
  } 
  @Test
  public void Test06_FindByClassName() {
	  System.out.println(driver.findElements(By.className("locator_class")));	  
  } 
  
  @Test
  public void Test07_FindByCssSelector() {
	  System.out.println(driver.findElements(By.cssSelector("div:nth-child(1) div.container div:nth-child(2) div:nth-child(1) > input.btn.btn-2:nth-child(18)")));	  
  } 
  @Test
  public void Test08_FindByXpath() {
	  System.out.println(driver.findElements(By.xpath("//button[@class='btn btn-2']")));	  
  } 
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
