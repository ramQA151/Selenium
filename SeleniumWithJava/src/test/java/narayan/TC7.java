package narayan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a.ico-register")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#gender-male")).click();
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Narayan");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("Satoskar");
		
		
		driver.findElement(By.cssSelector("input#Email")).sendKeys("narayan+4@gmail.com");
		driver.findElement(By.cssSelector("input#Password")).sendKeys("Test@123");
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("Test@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#register-button")).click();
		
		Thread.sleep(3000);
		driver.close();
	
		
		
		
	}
}
