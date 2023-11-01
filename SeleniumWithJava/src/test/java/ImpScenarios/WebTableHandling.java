package ImpScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver();
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement submitbtn=driver.findElement((By.xpath("//input[@type=\"submit\"]")));
		System.out.println(submitbtn.isEnabled());
		submitbtn.click();
		
		List <WebElement> total=driver.findElements(By.xpath(("//table[@id='customers']/tbody/tr")));

		System.out.println(total.size());
		
		for(WebElement tb:total){
			System.out.println(tb.getText());
			
		}
		
		WebElement table=driver.findElement((By.xpath("//table[@id='customers']//tr[3]//td[5]")));
		System.out.println(table.getText());
		table.click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
}
