package assertions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumberofLinks {

public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://kidlitkatalyst.com/");
	driver.manage().window().maximize();
	
	int count = driver.findElements(By.tagName("a")).size();
	System.out.println(count);
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	 
	 //Traversing through the list and printing its text along with link address
	 for(WebElement link:allLinks){
	 System.out.println(link.getText() + " - " + link.getAttribute("href"));
	 }
}
		
}

