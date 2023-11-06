package javaPrograms0611;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StarPattern {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

//		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@style='width: 100%;']")));
//
//		driver.quit();
		
		Thread.sleep(5000);
		WebElement source_element=driver.findElement(By.id("draggable"));
		WebElement target_element=driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source_element, target_element).build().perform();
		Thread.sleep(5000);
		WebElement text=driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]"));
		System.out.println(text.getText());

		

	}
}
