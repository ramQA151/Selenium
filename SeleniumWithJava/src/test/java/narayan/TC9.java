package narayan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/label[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/div[2]/input[1]")).sendKeys("Narayan");
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/div[3]/input[1]")).sendKeys("Satoskar");
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/div[4]/input[1]")).sendKeys("narayan+7@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[3]/div[2]/div[1]/input[1]")).sendKeys("Test@123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[3]/div[2]/div[2]/input[1]")).sendKeys("Test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[4]/input[1]")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
