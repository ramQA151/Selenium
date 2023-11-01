package narayan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC8 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Narayan");
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Satoskar");
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("narayan+7@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test@123");
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Test@123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	Thread.sleep(3000);
	driver.close();
}
}
