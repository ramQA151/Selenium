package demoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectorhub {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver();
		WebDriver driver= new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.findElement((By.xpath("//input[@id='userId']"))).sendKeys("Ram@gmsil.com");
		driver.findElement((By.xpath("//input[@name='Password']"))).sendKeys("RAMQA151");
		driver.findElement((By.xpath("//div[@class='element-companyId']//input[@placeholder='Enter your company']"))).sendKeys("ABC");
		driver.findElement((By.xpath("//div[@class='element-companyId']//input[@placeholder='Enter your mobile number']"))).sendKeys("1234567878");
		driver.findElement((By.xpath("//input[@value='Submit']"))).click();

		//
	}
}
