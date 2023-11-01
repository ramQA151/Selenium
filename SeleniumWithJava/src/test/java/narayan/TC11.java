package narayan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.python.org/downloads/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[17]//span[4]//a[1]")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}
