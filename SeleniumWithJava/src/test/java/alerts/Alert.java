package alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@class='_30XB9F']")).click();
			Thread.sleep(4000);
			driver.findElement((By.xpath("(//span[@class='_1XjE3T'])[4]"))).click();
			Thread.sleep(4000);
			driver.findElement((By.xpath("(//span[@class='_1XjE3T'])[4]"))).click();
			List <WebElement> Mobile=driver.findElements(By.xpath("//div[@class='_16rZTH']"));
			
			for(WebElement mob:Mobile )
		System.out.println(mob);
}
	}
		

