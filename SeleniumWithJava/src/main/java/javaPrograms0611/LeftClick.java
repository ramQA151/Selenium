package javaPrograms0611;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeftClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		WebElement jobs=driver.findElement(By.xpath("//div[normalize-space()='Jobs']"));
		Thread.sleep(3000);
		WebElement SkilledJobs=driver.findElement(By.xpath("//div[normalize-space()='Jobs by skill']"));
		
			Actions act= new Actions(driver);
			act.moveToElement(jobs).perform();
			Thread.sleep(3000);
			SkilledJobs.click();
			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl());
			
			if(driver.getCurrentUrl().contains("top-skill-jobs")) {
				System.out.println("URL matched");
			}
	}
}
