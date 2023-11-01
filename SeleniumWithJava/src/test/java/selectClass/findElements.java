package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElements {
  @Test
  public void selectByIndex() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/practice-project");
		driver.manage().window().maximize();
		List <WebElement> textbox=driver.findElements(By.xpath("//input[@type='text']"));
		
		for(WebElement tb: textbox) {
			System.out.println(textbox.size());

		}
		
		
		
				
  }	
}
