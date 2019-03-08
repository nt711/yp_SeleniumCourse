package Lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class exe01 {
	@Test
	public void test01() {
		String expectedTitle = "www.imdb.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://imdb.com");
		driver.navigate().refresh();
		String title = driver.getTitle();
		if (title.equals(expectedTitle))
		{
			System.out.println("Equals");}
		else System.out.println("Not equal");
		driver.quit();
	}

}

